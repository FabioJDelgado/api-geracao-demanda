package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.models.Rodada;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;
@Schema(name = "Response de Registro das Jogadas na Rodada")
public record RodadaRegistroResponseDto(
        @Schema(description = "Identificação da rodada")
        String identificacaoRodada,
        @Schema(description = "Jogadas realizadas na rodada")
        List<JogadaRegistroResponseDto> jogadas
) {
}
