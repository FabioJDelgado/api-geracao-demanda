package com.faculdade.apigeracaodemanda.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Response do Cadastro da Partida")
public record PartidaCadastroResponseDto(
        @Schema(description = "Identificação da partida que foi cadastrada")
        String identificacaoPartida
) {
}
