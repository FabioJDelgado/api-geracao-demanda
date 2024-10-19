package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaVariavelMicroeconomia;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Schema(name="Requisição de Cadastro da Variável Microeconômica para Partida")
@ValidaVariavelMicroeconomia
public record VariavelMicroeconomicaRequestDto(
        @NotNull(message = "A porcentagem preço não pode ser nula")
        @Schema(description = "Porcentagem que o preço representa da fatia de mercado")
        double preco,
        @NotNull(message = "O fator penalidade preço não pode ser nulo")
        @Schema(description = "Fator de penalidade do preço")
        int fatorPenalidadePreco,
        @NotNull(message = "A porcentagem da propaganda não pode ser nula")
        @Schema(description = "Porcentagem que a propaganda representa da fatia de mercado")
        double propaganda,
        @NotNull(message = "A porcentagem da propaganda rádio não pode ser nula")
        @Schema(description = "Porcentagem que o rádio representa dentro da porcentagem da propaganda")
        double porcentagemPropagandaRadio,
        @NotNull(message = "Valor mínimo propaganda radio não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda radio é 100")
        @Schema(description = "Valor mínimo que a propaganda de rádio pode ter")
        double valorMinimoPropagandaRadio,
        @NotNull(message = "Proporção crescimento propaganda radio não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda radio deve ser de pelo menos 1")
        @Schema(description = "Proporção de crescimento da propaganda de rádio")
        double proporcaoCrescimentoPropagandaRadio,
        @NotNull(message = "A porcentagem propaganda jornal não pode ser nula")
        @Schema(description = "Porcentagem que o jornal representa dentro da porcentagem da propaganda")
        double porcentagemPropagandaJornal,
        @NotNull(message = "Valor mínimo propaganda jornal não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda jornal é 100")
        @Schema(description = "Valor mínimo que a propaganda de jornal pode ter")
        double valorMinimoPropagandaJornal,
        @NotNull(message = "Proporção crescimento propaganda jornal não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda jornal deve ser de pelo menos 1")
        @Schema(description = "Proporção de crescimento da propaganda de jornal")
        double proporcaoCrescimentoPropagandaJornal,
        @NotNull(message = "A porcentagem propaganda TV não pode ser nula")
        @Schema(description = "Porcentagem que a TV representa dentro da porcentagem da propaganda")
        double porcentagemPropagandaTV,
        @NotNull(message = "Valor mínimo propaganda TV não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda TV é 100")
        @Schema(description = "Valor mínimo que a propaganda de TV pode ter")
        double valorMinimoPropagandaTV,
        @NotNull(message = "Proporção crescimento propaganda TV não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda TV deve ser de pelo menos 1")
        @Schema(description = "Proporção de crescimento da propaganda de TV")
        double proporcaoCrescimentoPropagandaTV,
        @NotNull(message = "A porcentagem propaganda internet não pode ser nula")
        @Schema(description = "Porcentagem que a internet representa dentro da porcentagem da propaganda")
        double porcentagemPropagandaInternet,
        @NotNull(message = "Valor mínimo propaganda internet não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda internet é 100")
        @Schema(description = "Valor mínimo que a propaganda de internet pode ter")
        double valorMinimoPropagandaInternet,
        @NotNull(message = "Proporção crescimento propaganda internet não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda internet deve ser de pelo menos 1")
        @Schema(description = "Proporção de crescimento da propaganda de internet")
        double proporcaoCrescimentoPropagandaInternet,
        @NotNull(message = "Confiabilidade produto 1 não pode ser nulo")
        @Min(value = 1, message = "Confiabilidade produto 1 não pode ser menor que 1")
        @Schema(description = "Confiabilidade do produto 1 (Quantos produtos são vendidos para que um seja devolvido)")
        int confiabilidadeProduto1,
        @NotNull(message = "Confiabilidade produto 2 não pode ser nulo")
        @Min(value = 1, message = "Confiabilidade produto 2 não pode ser menor que 1")
        @Schema(description = "Confiabilidade do produto 2 (Quantos produtos são vendidos para que um seja devolvido)")
        int confiabilidadeProduto2,
        @NotNull(message = "Confiabilidade produto 3 não pode ser nulo")
        @Min(value = 1, message = "Confiabilidade produto 3 não pode ser menor que 1")
        @Schema(description = "Confiabilidade do produto 3 (Quantos produtos são vendidos para que um seja devolvido)")
        int confiabilidadeProduto3,
        @NotNull(message = "Porcentagem Capacidade instalada não pode ser nula")
        @Schema(description = "Porcentagem que a capacidade instala representa da fatia de mercado")
        double capacidadeInstalada,
        @NotNull(message = "Tamanho estabelecimento pequeno não pode ser nulo")
        @Min(value = 50, message = "Tamanho estabelecimento pequeno não pode ser menor que 50")
        @Schema(description = "Tamanho do estabelecimento pequeno")
        double tamanhoEstabelecimentoPequeno,
        @NotNull(message = "Peso tamanho estabelecimento pequeno não pode ser nulo")
        @Min(value = 1, message = "Peso tamanho estabelecimento pequeno não pode ser menor que 1")
        @Schema(description = "Peso do tamanho do estabelecimento pequeno")
        double pesoTamanhoEstabelecimentoPequeno,
        @NotNull(message = "A quantidade de caixas do estabeleciomento pequeno não pode ser nula")
        @Min(value = 1, message = "A quantidade de caixas do estabeleciomento pequeno não pode ser menor que 1")
        @Schema(description = "Quantidade máxima de caixas do estabelecimento pequeno")
        int qtdMaxCaixasEstabelecimentoPequeno,
        @NotNull(message = "Tamanho estabelecimento médio não pode ser nulo")
        @Min(value = 100, message = "Tamanho estabelecimento médio não pode ser menor que 100")
        @Schema(description = "Tamanho do estabelecimento médio")
        double tamanhoEstabelecimentoMedio,
        @NotNull(message = "Peso tamanho estabelecimento medio não pode ser nulo")
        @Min(value = 1, message = "Peso tamanho estabelecimento medio não pode ser menor que 1")
        @Schema(description = "Peso do tamanho do estabelecimento médio")
        double pesoTamanhoEstabelecimentoMedio,
        @NotNull(message = "A quantidade de caixas do estabeleciomento médio não pode ser nula")
        @Min(value = 1, message = "A quantidade de caixas do estabeleciomento médio não pode ser menor que 1")
        @Schema(description = "Quantidade máxima de caixas do estabelecimento médio")
        int qtdMaxCaixasEstabelecimentoMedio,
        @NotNull(message = "Tamanho estabelecimento grande não pode ser nulo")
        @Min(value = 150, message = "Tamanho estabelecimento grande não pode ser menor que 150")
        @Schema(description = "Tamanho do estabelecimento grande")
        double tamanhoEstabelecimentoGrande,
        @NotNull(message = "Peso tamanho estabelecimento grande não pode ser nulo")
        @Min(value = 1, message = "Peso tamanho estabelecimento grande não pode ser menor que 1")
        @Schema(description = "Peso do tamanho do estabelecimento grande")
        double pesoTamanhoEstabelecimentoGrande,
        @NotNull(message = "A quantidade de caixas do estabeleciomento grande não pode ser nula")
        @Min(value = 1, message = "A quantidade de caixas do estabeleciomento grande não pode ser menor que 1")
        @Schema(description = "Quantidade máxima de caixas do estabelecimento grande")
        int qtdMaxCaixasEstabelecimentoGrande,
        @NotNull(message = "Peso caixas não pode ser nulo")
        @Min(value = 1, message = "Peso caixas não pode ser menor que 1")
        @Schema(description = "Peso das caixas")
        double pesoCaixas,
        @NotNull(message = "Peso funcionários não pode ser nulo")
        @Min(value = 1, message = "Peso funcionários não pode ser menor que 1")
        @Schema(description = "Peso dos funcionários")
        double pesoFuncionarios
) {
}
