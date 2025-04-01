package com.faculdade.apigeracaodemanda.dtos;

public record PartidaEditarResponseDto(
        String identificacaoPartida,
        VariavelMacroeconomicaEditarResponseDto variavelMacroeconomica
) {
}
