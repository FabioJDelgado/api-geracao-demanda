package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaVariavelMacroeconomica;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.Map;

public record VariavelMacroeconomicaCadastroRequestDto(
        @NotNull(message = "A taxa de juros não pode ser nula")
        @ValidaVariavelMacroeconomica
        Map<String, Double> taxaBasicaJuros,
        @Min(value = 0, message = "A taxa de desemprego deve ser no mínimo 0")
        double renda
) {
}
