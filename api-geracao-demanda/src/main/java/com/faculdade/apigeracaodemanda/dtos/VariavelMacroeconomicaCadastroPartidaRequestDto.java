package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaCadastroPartidaVariavelMacroeconomica;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@ValidaCadastroPartidaVariavelMacroeconomica
public record VariavelMacroeconomicaCadastroPartidaRequestDto(
        @NotNull(message = "O fator de ajuste não pode ser nulo")
        @Min(value = 1, message = "O fator de ajuste deve ser no mínimo 1")
        double fatorAjuste
) {
}
