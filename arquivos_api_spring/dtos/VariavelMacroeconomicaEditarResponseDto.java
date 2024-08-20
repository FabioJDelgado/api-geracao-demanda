package com.faculdade.apigeracaodemanda.dtos;

import java.util.Map;

public record VariavelMacroeconomicaEditarResponseDto(
        Map<String, Double> taxaBasicaJuros
) {
}
