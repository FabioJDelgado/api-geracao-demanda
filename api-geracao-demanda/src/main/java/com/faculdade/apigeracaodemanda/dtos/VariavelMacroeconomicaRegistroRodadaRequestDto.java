package com.faculdade.apigeracaodemanda.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="Requisição de Cadastro da Variável Macroeconômica Durante as Rodadas")
public record VariavelMacroeconomicaRegistroRodadaRequestDto(
        @Schema(description = "Taxa Básica de Juros cadastrada na rodada")
        Double taxaJuros
) {
}
