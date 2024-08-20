package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaRodadaRegistro;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@ValidaRodadaRegistro
public record RodadaRegistroResquestDto(
        String identificacaoPartida,
        @Valid
        List<JogadaRegistroRequestDto> jogadas
) {
}
