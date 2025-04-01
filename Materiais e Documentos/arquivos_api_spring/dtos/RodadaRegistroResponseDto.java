package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.models.Rodada;

import java.util.List;

public record RodadaRegistroResponseDto(
        String identificacaoRodada,
        List<JogadaRegistroResponseDto> jogadas
) {
}
