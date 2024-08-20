package com.faculdade.apigeracaodemanda.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record JogadaRegistroRequestDto(
        @NotBlank
        String identificacaoJogada,
        @Min(value = 0, message = "O preço do produto deve ser maior ou igual a 0")
        double preco
) {
}
