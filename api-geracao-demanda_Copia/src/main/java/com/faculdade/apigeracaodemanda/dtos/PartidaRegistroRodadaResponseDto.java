package com.faculdade.apigeracaodemanda.dtos;

public record PartidaRegistroRodadaResponseDto(
        String identificacaoPartida,
        int rodadaAtual,
        int rodadasRestantes,
        RodadaRegistroResponseDto rodada
) {
}
