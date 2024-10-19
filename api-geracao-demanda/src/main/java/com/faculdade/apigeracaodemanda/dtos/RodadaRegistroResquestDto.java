package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaRodadaRegistro;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Schema(name = "Registro da Rodada")
@ValidaRodadaRegistro
public record RodadaRegistroResquestDto(
        @NotNull(message = "A identificação da partida não pode ser nula")
        @Schema(description = "Identificação da partida que foi cadastrada")
        String identificacaoPartida,
        @Schema(description = "Variável macroeconômica da rodada")
        VariavelMacroeconomicaRegistroRodadaRequestDto variavelMacroeconomica,
        @Valid
        @Schema(description = "Jogadas realizadas na rodada")
        List<JogadaRegistroRequestDto> jogadas
) {
}
