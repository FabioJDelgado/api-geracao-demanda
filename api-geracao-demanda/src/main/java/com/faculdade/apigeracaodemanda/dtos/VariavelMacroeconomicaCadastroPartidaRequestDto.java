package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaCadastroPartidaVariavelMacroeconomica;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Schema(name="Requisição de Cadastro da Variável Macroeconômica para Partida")
@ValidaCadastroPartidaVariavelMacroeconomica
public record VariavelMacroeconomicaCadastroPartidaRequestDto(
        @NotNull(message = "O fator de ajuste não pode ser nulo")
        @Min(value = 1, message = "O fator de ajuste deve ser no mínimo 1")
        @Schema(description = "Fator de ajuste da variável macroeconômica")
        double fatorAjuste
) {
}
