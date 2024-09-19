package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.*;
import com.faculdade.apigeracaodemanda.models.Partida;

public class PartidaMapper {

    public static Partida toEntityCadastro(PartidaCadastroRequestDto partidaCadastroRequestDto) {
        Partida partida = new Partida();
        partida.setQuantidadeRodadas(partidaCadastroRequestDto.quantidadeRodadas());
        partida.setFatiaMercado(partidaCadastroRequestDto.fatiaMercado());
        partida.setVariavelMicroeconomica(VariavelMicroeconomicaMapper.toEntity(partidaCadastroRequestDto.variavelMicroeconomica()));
        partida.setVariavelMacroeconomica(VariavelMacroeconomicaMapper.toEntityCadastroPartida(partidaCadastroRequestDto.variavelMacroeconomica()));
        return partida;
    }

    public static PartidaCadastroRequestDto toRequestDto(Partida partida) {
        return new PartidaCadastroRequestDto(
                partida.getQuantidadeRodadas(),
                partida.getFatiaMercado(),
                VariavelMicroeconomicaMapper.toDto(partida.getVariavelMicroeconomica()),
                VariavelMacroeconomicaMapper.toDtoCadastroPartida(partida.getVariavelMacroeconomica())
        );
    }

    public static PartidaCadastroResponseDto toResponseCadastroDto(Partida partida) {
        return new PartidaCadastroResponseDto(
                partida.getIdentificacaoPartida()
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
