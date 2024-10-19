package com.faculdade.apigeracaodemanda.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Schema(name = "Requisição de Cadastro da Partida")
public record PartidaCadastroRequestDto(
        @NotNull(message = "A quantidade de rodadas não pode ser nula")
        @Min(value = 6, message = "Uma partida deve ter no mínimo 6 rodadas")
        @Schema(description = "Quantidade de rodadas que a partida terá")
        int quantidadeRodadas,
        @NotNull(message = "A fatia de mercado não pode ser nula")
        @Min(value = 1000, message = "A quantidade consumidores dispostos a consumir o produto deve de ser no mínimo 1000")
        @Schema(description = "Quantidade de consumidores dispostos a consumir o produto")
        double fatiaMercado,
        @Valid
        @Schema(description = "Variáveis Microeconômicas a serem usadas na partida")
        VariavelMicroeconomicaRequestDto variavelMicroeconomica,
        @Valid
        @Schema(description = "Variáveis Macroeconômicas a serem usadas na partida")
        VariavelMacroeconomicaCadastroPartidaRequestDto variavelMacroeconomica
) {
}
