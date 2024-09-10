package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.JogadaRegistroRequestDto;
import com.faculdade.apigeracaodemanda.dtos.JogadaRegistroResponseDto;
import com.faculdade.apigeracaodemanda.models.Jogada;

public class JogadaMapper {

    public static Jogada toJogadaRegistro(JogadaRegistroRequestDto jogadaRegistroRequestDto){
        Jogada jogada = new Jogada();

        jogada.setIdentificacaoJogada(jogadaRegistroRequestDto.identificacaoJogada());

        jogada.setPreco(jogadaRegistroRequestDto.preco());
        jogada.setInvestimentoPropagandaRadio(jogadaRegistroRequestDto.investimentoPropagandaRadio());
        jogada.setInvestimentoPropagandaJornal(jogadaRegistroRequestDto.investimentoPropagandaJornal());
        jogada.setInvestimentoPropagandaTV(jogadaRegistroRequestDto.investimentoPropagandaTV());
        jogada.setInvestimentoPropagandaInternet(jogadaRegistroRequestDto.investimentoPropagandaInternet());

        return jogada;
    }

    public static JogadaRegistroResponseDto toJogadaRegistroResponseDto(Jogada jogada){
        return new JogadaRegistroResponseDto(
                jogada.getIdentificacaoJogada(),
                jogada.getDemandaTotalJogada()
        );
    }
}
