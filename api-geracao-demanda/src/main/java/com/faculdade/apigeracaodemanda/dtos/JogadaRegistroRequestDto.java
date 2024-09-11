package com.faculdade.apigeracaodemanda.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record JogadaRegistroRequestDto(
        @NotBlank
        String identificacaoJogada,
        @Min(value = 0, message = "O preço do produto deve ser maior ou igual a 0")
        double preco,
        @NotNull(message = "O investimento propaganda rádio não pode ser nulo")
        @Min(value = 0, message = "O investimento propaganda rádio deve ser maior ou igual a 0")
        double investimentoPropagandaRadio,
        @NotNull(message = "O investimento propaganda jornal não pode ser nulo")
        @Min(value = 0, message = "O investimento propaganda jornal deve ser maior ou igual a 0")
        double investimentoPropagandaJornal,
        @NotNull(message = "O investimento propaganda TV não pode ser nulo")
        @Min(value = 0, message = "O investimento propaganda TV deve ser maior ou igual a 0")
        double investimentoPropagandaTV,
        @NotNull(message = "O investimento propaganda internet não pode ser nulo")
        @Min(value = 0, message = "O investimento propaganda internet deve ser maior ou igual a 0")
        double investimentoPropagandaInternet,
        @NotNull(message = "A quantidade de produtos em estoque do fornecedor 1 não pode ser nula")
        @Min(value = 0, message = "A quantidade de produtos em estoque do fornecedor 1 deve ser maior ou igual a 0")
        int qtdProdutosEstoqueFornecedor1,
        @NotNull(message = "A quantidade de produtos em estoque do fornecedor 2 não pode ser nula")
        @Min(value = 0, message = "A quantidade de produtos em estoque do fornecedor 2 deve ser maior ou igual a 0")
        int qtdProdutosEstoqueFornecedor2,
        @NotNull(message = "A quantidade de produtos em estoque do fornecedor 3 não pode ser nula")
        @Min(value = 0, message = "A quantidade de produtos em estoque do fornecedor 3 deve ser maior ou igual a 0")
        int qtdProdutosEstoqueFornecedor3
) {
}
