package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaVariavelMacroeconomica;
import jakarta.validation.constraints.NotNull;

import java.util.Map;

public record VariavelMacroeconomicaEditarRequestDto(
        @NotNull(message = "A taxa de juros não pode ser nula")
        @ValidaVariavelMacroeconomica
        Map<String, Double> taxaBasicaJuros
) {
}
