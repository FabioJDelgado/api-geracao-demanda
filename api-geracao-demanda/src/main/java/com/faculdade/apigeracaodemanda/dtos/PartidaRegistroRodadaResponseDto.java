package com.faculdade.apigeracaodemanda.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Response de Registro da Rodada")
public record PartidaRegistroRodadaResponseDto(
        @Schema(description = "Identificação da partida que foi cadastrada")
        String identificacaoPartida,
        @Schema(description = "Rodada atual da partida")
        int rodadaAtual,
        @Schema(description = "Rodadas restantes para o fim da partida")
        int rodadasRestantes,
        @Schema(description = "Rodada para ser registrada")
        RodadaRegistroResponseDto rodada
) {
}
