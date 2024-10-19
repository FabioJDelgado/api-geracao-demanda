package com.faculdade.apigeracaodemanda.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Response do Registro da Jogada")
public record JogadaRegistroResponseDto(
        @Schema(description = "Identificação da Jogada que foi registrada")
        String identificacaoJogada,
        @Schema(description = "Demanda total da Jogada que foi registrada")
        int demandaTotalJogada
) {
}
