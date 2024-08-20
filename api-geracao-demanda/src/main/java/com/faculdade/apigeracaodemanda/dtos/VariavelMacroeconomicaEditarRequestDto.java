package com.faculdade.apigeracaodemanda.dtos;


import com.faculdade.apigeracaodemanda.validations.ValidaEdicaoVariavelMacroeconomica;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.Map;

@ValidaEdicaoVariavelMacroeconomica
public record VariavelMacroeconomicaEditarRequestDto(
        @NotNull(message = "A taxa de juros não pode ser nula")
        Map<String, Double> taxaBasicaJuros,
        @Min(value = 1, message = "O fator de ajuste deve ser no mínimo 1")
        double fatorAjuste
) {
}
