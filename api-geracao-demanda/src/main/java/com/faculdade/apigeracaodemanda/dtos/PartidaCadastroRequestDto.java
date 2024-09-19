package com.faculdade.apigeracaodemanda.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PartidaCadastroRequestDto(
        @NotNull(message = "A quantidade de rodadas não pode ser nula")
        @Min(value = 6, message = "Uma partida deve ter no mínimo 6 rodadas")
        int quantidadeRodadas,
        @NotNull(message = "A fatia de mercado não pode ser nula")
        @Min(value = 1000, message = "A quantidade consumidores dispostos a consumir o produto deve de ser no mínimo 1000")
        double fatiaMercado,
        @Valid
        VariavelMicroeconomicaRequestDto variavelMicroeconomica,
        @Valid
        VariavelMacroeconomicaCadastroPartidaRequestDto variavelMacroeconomica
) {
}
