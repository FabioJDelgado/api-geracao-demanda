package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.*;
import com.faculdade.apigeracaodemanda.models.Partida;
import com.faculdade.apigeracaodemanda.models.enums.TipoProduto;

public class PartidaMapper {

    public static Partida toEntityCadastro(PartidaCadastroRequestDto partidaCadastroRequestDto) {
        Partida partida = new Partida();
        partida.setQuantidadeRodadas(partidaCadastroRequestDto.quantidadeRodadas());
        partida.setIntencaoCompra(partidaCadastroRequestDto.intencaoCompra());
        partida.setTipoProduto(TipoProduto.toEnum(partidaCadastroRequestDto.tipoProduto()));
        partida.setVariavelMicroeconomica(VariavelMicroeconomicaMapper.toEntity(partidaCadastroRequestDto.variavelMicroeconomica()));
        partida.setVariavelMacroeconomica(VariavelMacroeconomicaMapper.toEntityCadastro(partidaCadastroRequestDto.variavelMacroeconomica()));
        return partida;
    }

    public static PartidaCadastroRequestDto toRequestDto(Partida partida) {
        return new PartidaCadastroRequestDto(
                partida.getQuantidadeRodadas(),
                partida.getIntencaoCompra(),
                partida.getTipoProduto().getTipoProduto(),
                VariavelMicroeconomicaMapper.toDto(partida.getVariavelMicroeconomica()),
                VariavelMacroeconomicaMapper.toDto(partida.getVariavelMacroeconomica())
        );
    }

    public static PartidaCadastroResponseDto toResponseCadastroDto(Partida partida) {
        return new PartidaCadastroResponseDto(
                partida.getIdentificacaoPartida()
        );
    }

    public static Partida toEntityEditar(PartidaEditarRequestDto partidaEditarRequestDto) {
        Partida partida = new Partida();
        partida.setIdentificacaoPartida(partidaEditarRequestDto.identificacaoPartida());
        partida.setVariavelMacroeconomica(VariavelMacroeconomicaMapper.toEntityEditar(partidaEditarRequestDto.variavelMacroeconomica()));
        return partida;
    }

    public static PartidaEditarResponseDto toResponseEditarDto(Partida partida) {
        return new PartidaEditarResponseDto(
                partida.getIdentificacaoPartida(),
                VariavelMacroeconomicaMapper.toDtoEditar(partida.getVariavelMacroeconomica())
        );
    }

    public static PartidaRegistroRodadaResponseDto toPartidaRegistroRodadaResponseDto(Partida partida, String identificacaoRodada) {
        return new PartidaRegistroRodadaResponseDto(
                partida.getIdentificacaoPartida(),
                partida.getContadorRodadas(),
                partida.getQuantidadeRodadas() - partida.getContadorRodadas(),
                RodadaMapper.toRodadaRegistroResponseDto(partida.recuperaRodada(identificacaoRodada))
        );
    }
}
