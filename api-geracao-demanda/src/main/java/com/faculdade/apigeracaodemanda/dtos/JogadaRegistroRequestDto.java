package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.models.enums.TamanhoEstabelecimento;
import com.faculdade.apigeracaodemanda.validations.ValidaEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Schema(name = "Requisição de Registro da Jogada")
public record JogadaRegistroRequestDto(
        @NotBlank(message = "A identificação da jogada não pode ser nula ou vazia")
        @Schema(description = "Este é o campo de identificação que a jogada terá")
        String identificacaoJogada,
        @NotNull(message = "O preço do produto não pode ser nulo")
        @Min(value = 0, message = "O preço do produto deve ser maior ou igual a 0")
        @Schema(description = "Este é o campo de preço do produto")
        double preco,
        @NotNull(message = "O investimento propaganda rádio não pode ser nulo")
        @Min(value = 0, message = "O investimento propaganda rádio deve ser maior ou igual a 0")
        @Schema(description = "Este é o campo de investimento em propaganda de rádio")
        double investimentoPropagandaRadio,
        @NotNull(message = "O investimento propaganda jornal não pode ser nulo")
        @Min(value = 0, message = "O investimento propaganda jornal deve ser maior ou igual a 0")
        @Schema(description = "Este é o campo de investimento em propaganda de jornal")
        double investimentoPropagandaJornal,
        @NotNull(message = "O investimento propaganda TV não pode ser nulo")
        @Min(value = 0, message = "O investimento propaganda TV deve ser maior ou igual a 0")
        @Schema(description = "Este é o campo de investimento em propaganda de TV")
        double investimentoPropagandaTV,
        @NotNull(message = "O investimento propaganda internet não pode ser nulo")
        @Min(value = 0, message = "O investimento propaganda internet deve ser maior ou igual a 0")
        @Schema(description = "Este é o campo de investimento em propaganda de internet")
        double investimentoPropagandaInternet,
        @NotNull(message = "A quantidade de produtos em estoque do fornecedor 1 não pode ser nula")
        @Min(value = 0, message = "A quantidade de produtos em estoque do fornecedor 1 deve ser maior ou igual a 0")
        @Schema(description = "Este é o campo de quantidade de produtos em estoque do fornecedor 1")
        int qtdProdutosEstoqueFornecedor1,
        @NotNull(message = "A quantidade de produtos em estoque do fornecedor 2 não pode ser nula")
        @Min(value = 0, message = "A quantidade de produtos em estoque do fornecedor 2 deve ser maior ou igual a 0")
        @Schema(description = "Este é o campo de quantidade de produtos em estoque do fornecedor 2")
        int qtdProdutosEstoqueFornecedor2,
        @NotNull(message = "A quantidade de produtos em estoque do fornecedor 3 não pode ser nula")
        @Min(value = 0, message = "A quantidade de produtos em estoque do fornecedor 3 deve ser maior ou igual a 0")
        @Schema(description = "Este é o campo de quantidade de produtos em estoque do fornecedor 3")
        int qtdProdutosEstoqueFornecedor3,
        @ValidaEnum(enumClass = TamanhoEstabelecimento.class, message = "O tamanho da loja deve ser um dos valores: pequeno, medio ou grande", casosIgnorados = false)
        @Schema(description = "Este é o campo de tamanho do estabelecimento")
        String tamanhoEstabelecimento,
        @NotNull(message = "A quantidade de caixas não pode ser nula")
        @Min(value = 1, message = "A quantidade de caixas deve ser maior ou igual a 1")
        @Schema(description = "Este é o campo de quantidade de caixas")
        int qtdCaixas,
        @NotNull(message = "A quantidade de funcionários não pode ser nula")
        @Min(value = 3, message = "A quantidade de funcionários deve ser maior ou igual a 3")
        @Schema(description = "Este é o campo de quantidade de funcionários")
        int qtdFuncionarios
) {
}
