package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaCapacidadeInstaladaJogada;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record JogadaRegistroRequestDto(
        @NotBlank
        String identificacaoJogada,
        @Min(value = 0, message = "O valor do investimento em propaganda de rádio deve ser maior ou igual a 0")
        double investimentoPropagandaRadio,
        @Min(value = 0, message = "O valor do investimento em propaganda de jornal deve ser maior ou igual a 0")
        double investimentoPropagandaJornal,
        @Min(value = 0, message = "O valor do investimento em propaganda de TV deve ser maior ou igual a 0")
        double investimentoPropagandaTV,
        @Min(value = 0, message = "O valor do investimento em propaganda na internet deve ser maior ou igual a 0")
        double investimentoPropagandaInternet,
        @Min(value = 0, message = "A quantidade de produtos do fornecedor 1 deve ser maior ou igual a 0")
        int qtdProdutosFornecedor1,
        @Min(value = 0, message = "A quantidade de produtos do fornecedor 2 deve ser maior ou igual a 0")
        int qtdProdutosFornecedor2,
        @Min(value = 0, message = "A quantidade de produtos do fornecedor 3 deve ser maior ou igual a 0")
        int qtdProdutosFornecedor3,
        @Min(value = 0, message = "O preço do produto deve ser maior ou igual a 0")
        double preco,
        @NotBlank(message = "A capacidade instalada não pode ser vazia ou nula")
        @ValidaCapacidadeInstaladaJogada
        String capacidadeInstalada
) {
}
