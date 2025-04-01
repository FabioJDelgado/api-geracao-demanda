package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaVariavelMacroeconomica;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.Map;

public record VariavelMacroeconomicaCadastroRequestDto(
        @NotNull(message = "A taxa de juros não pode ser nula")
        @ValidaVariavelMacroeconomica
        Map<String, Double> taxaBasicaJuros,
        @Min(value = 1, message = "O fator de ajuste deve ser no mínimo 1")
        double fatorAjuste,
        @Min(value = 0, message = "A renda deve ser no mínimo 0")
        double renda
) {
}
