package com.faculdade.apigeracaodemanda.services;

import com.faculdade.apigeracaodemanda.dtos.PartidaRegistroRodadaResponseDto;
import com.faculdade.apigeracaodemanda.dtos.RodadaRegistroResquestDto;
import com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables.CalculoCapacidadeInstalada;
import com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables.CalculoPreco;
import com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables.CalculoPropaganda;
import com.faculdade.apigeracaodemanda.mapper.JogadaMapper;
import com.faculdade.apigeracaodemanda.mapper.PartidaMapper;
import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;
import com.faculdade.apigeracaodemanda.models.Rodada;
import com.faculdade.apigeracaodemanda.utils.Util;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RodadaService {

    public PartidaRegistroRodadaResponseDto registrarRodada(RodadaRegistroResquestDto rodadaRegistroResquestDto){

        // Recupera a partida informada
        Partida partida = Util.recuperaPartida(rodadaRegistroResquestDto.identificacaoPartida());

        // Incrementa a rodada da partida
        partida.setContadorRodadas(partida.getContadorRodadas() + 1);

        // Verifica se a partida chegou ao fim
        if(partida.getContadorRodadas() == partida.getQuantidadeRodadas()){
            partida.setPartidaFinalizada(true);
        }

        // Cria uma nova rodada
        Rodada rodada = new Rodada();

        // Atribui identificação da rodada
        rodada.setIdentificacaoRodada(partida.getContadorRodadas() + "");

        // Atribui a rodada a partida
        partida.getRodadas().add(rodada);

        // Converte a lista de jogadas dtos para uma lista de jogadas class
        List<Jogada> jogadas = new ArrayList<>();
        for(int i = 0; i < rodadaRegistroResquestDto.jogadas().size(); i++){
            jogadas.add(JogadaMapper.toJogadaRegistro(rodadaRegistroResquestDto.jogadas().get(i)));
        }

        // Atribui as jogadas a rodada
        rodada.setJogadas(jogadas);

        // Chama o método para fazer os cálculos das jogadas da rodada
        calcularJogadasRodada(partida, rodada.getIdentificacaoRodada());

        // Retorna a rodada registrada
        return PartidaMapper.toPartidaRegistroRodadaResponseDto(partida, rodada.getIdentificacaoRodada());
    }

    private void calcularJogadasRodada(Partida partida, String identificacaoRodada){

        // Calcula demanda da propaganda
        CalculoPropaganda.calculaNotasPropagandaDemandas(partida, identificacaoRodada);

        // Calcula demanda do preço
        CalculoPreco.calculaNotasPrecoDemandas(partida, identificacaoRodada);

        // Calcula demanda da capacidade instalada
        CalculoCapacidadeInstalada.calculaNotasCapacidadeInstaladaDemandas(partida, identificacaoRodada);
    }
}
