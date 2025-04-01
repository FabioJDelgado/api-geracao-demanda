package com.faculdade.apigeracaodemanda.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record PartidaEditarRequestDto(
        @NotBlank(message = "A identificação da partida não pode ser vazia ou nula")
        String identificacaoPartida,
        @Valid
        VariavelMacroeconomicaEditarRequestDto variavelMacroeconomica
) {
}
