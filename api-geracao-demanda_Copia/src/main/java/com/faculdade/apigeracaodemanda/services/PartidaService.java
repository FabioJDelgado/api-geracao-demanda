package com.faculdade.apigeracaodemanda.services;

import com.faculdade.apigeracaodemanda.dtos.PartidaCadastroRequestDto;
import com.faculdade.apigeracaodemanda.dtos.PartidaEditarRequestDto;
import com.faculdade.apigeracaodemanda.dtos.PartidaEditarResponseDto;
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

    // Método para editar a taxa basica de juros
    public PartidaEditarResponseDto editarTaxaBasicaJuros(PartidaEditarRequestDto partidaEditarRequestDto) {

        // Converter PartidaEditarRequestDto para Partida
        Partida partida = PartidaMapper.toEntityEditar(partidaEditarRequestDto);

        // Recuperar partida salva
        Partida partidaSalva = Util.recuperaPartida(partida.getIdentificacaoPartida());

        // Editar a taxa basica de juros
        partidaSalva.getVariavelMacroeconomica().setTaxaBasicaJuros(partida.getVariavelMacroeconomica().getTaxaBasicaJuros());

        // Salvar partida em arquivo
        Util.salvaPartida(partidaSalva);

        return PartidaMapper.toResponseEditarDto(partidaSalva);
    }
}
