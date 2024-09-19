package com.faculdade.apigeracaodemanda.services;

import com.faculdade.apigeracaodemanda.dtos.PartidaCadastroRequestDto;
import com.faculdade.apigeracaodemanda.dtos.PartidaCadastroResponseDto;
import com.faculdade.apigeracaodemanda.mapper.PartidaMapper;
import com.faculdade.apigeracaodemanda.models.Partida;
import com.faculdade.apigeracaodemanda.utils.Util;
import org.springframework.stereotype.Service;

@Service
public class PartidaService {

    // Método para cadastrar partida
    public PartidaCadastroResponseDto cadastrarPartida(PartidaCadastroRequestDto partidaCadastroRequestDto) {

        // Converter PartidaRequestDto para Partida
        Partida partida = PartidaMapper.toEntityCadastro(partidaCadastroRequestDto);

        // Gera identificador UUID
        String identificadorUUID = Util.geraIdentificadorUUID();
        partida.setIdentificacaoPartida(identificadorUUID);

        // Salvar partida em arquivo
        Util.salvaPartida(partida);

        //Retorna PartidaResponseCadastroDto
        return PartidaMapper.toResponseCadastroDto(partida);
    }
}
