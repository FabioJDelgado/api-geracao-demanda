package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaVariavelMicroeconomia;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@ValidaVariavelMicroeconomia
public record VariavelMicroeconomicaRequestDto(
        @NotNull(message = "A porcentagem preço não pode ser nula")
        double preco,
        @NotNull(message = "O fator penalidade preço não pode ser nulo")
        int fatorPenalidadePreco,
        @NotNull(message = "A porcentagem da propaganda não pode ser nula")
        double propaganda,
        @NotNull(message = "A porcentagem da propaganda rádio não pode ser nula")
        double porcentagemPropagandaRadio,
        @NotNull(message = "Valor mínimo propaganda radio não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda radio é 100")
        double valorMinimoPropagandaRadio,
        @NotNull(message = "Proporção crescimento propaganda radio não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda radio deve ser de pelo menos 1")
        double proporcaoCrescimentoPropagandaRadio,
        @NotNull(message = "A porcentagem propaganda jornal não pode ser nula")
        double porcentagemPropagandaJornal,
        @NotNull(message = "Valor mínimo propaganda jornal não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda jornal é 100")
        double valorMinimoPropagandaJornal,
        @NotNull(message = "Proporção crescimento propaganda jornal não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda jornal deve ser de pelo menos 1")
        double proporcaoCrescimentoPropagandaJornal,
        @NotNull(message = "A porcentagem propaganda TV não pode ser nula")
        double porcentagemPropagandaTV,
        @NotNull(message = "Valor mínimo propaganda TV não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda TV é 100")
        double valorMinimoPropagandaTV,
        @NotNull(message = "Proporção crescimento propaganda TV não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda TV deve ser de pelo menos 1")
        double proporcaoCrescimentoPropagandaTV,
        @NotNull(message = "A porcentagem propaganda internet não pode ser nula")
        double porcentagemPropagandaInternet,
        @NotNull(message = "Valor mínimo propaganda internet não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda internet é 100")
        double valorMinimoPropagandaInternet,
        @NotNull(message = "Proporção crescimento propaganda internet não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda internet deve ser de pelo menos 1")
        double proporcaoCrescimentoPropagandaInternet,
        @NotNull(message = "Confiabilidade produto 1 não pode ser nulo")
        @Min(value = 1, message = "Confiabilidade produto 1 não pode ser menor que 1")
        int confiabilidadeProduto1,
        @NotNull(message = "Confiabilidade produto 2 não pode ser nulo")
        @Min(value = 1, message = "Confiabilidade produto 2 não pode ser menor que 1")
        int confiabilidadeProduto2,
        @NotNull(message = "Confiabilidade produto 3 não pode ser nulo")
        @Min(value = 1, message = "Confiabilidade produto 3 não pode ser menor que 1")
        int confiabilidadeProduto3,
        @NotNull(message = "Capacidade instalada não pode ser nula")
        double capacidadeInstalada,
        @NotNull(message = "Tamanho estabelecimento pequeno não pode ser nulo")
        @Min(value = 50, message = "Tamanho estabelecimento pequeno não pode ser menor que 50")
        double tamanhoEstabelecimentoPequeno,
        @NotNull(message = "Peso tamanho estabelecimento pequeno não pode ser nulo")
        @Min(value = 1, message = "Peso tamanho estabelecimento pequeno não pode ser menor que 1")
        double pesoTamanhoEstabelecimentoPequeno,
        @NotNull(message = "A quantidade de caixas do estabeleciomento pequeno não pode ser nula")
        @Min(value = 1, message = "A quantidade de caixas do estabeleciomento pequeno não pode ser menor que 1")
        int qtdMaxCaixasEstabelecimentoPequeno,
        @NotNull(message = "Tamanho estabelecimento médio não pode ser nulo")
        @Min(value = 100, message = "Tamanho estabelecimento médio não pode ser menor que 100")
        double tamanhoEstabelecimentoMedio,
        @NotNull(message = "Peso tamanho estabelecimento medio não pode ser nulo")
        @Min(value = 1, message = "Peso tamanho estabelecimento medio não pode ser menor que 1")
        double pesoTamanhoEstabelecimentoMedio,
        @NotNull(message = "A quantidade de caixas do estabeleciomento médio não pode ser nula")
        @Min(value = 1, message = "A quantidade de caixas do estabeleciomento médio não pode ser menor que 1")
        int qtdMaxCaixasEstabelecimentoMedio,
        @NotNull(message = "Tamanho estabelecimento grande não pode ser nulo")
        @Min(value = 150, message = "Tamanho estabelecimento grande não pode ser menor que 150")
        double tamanhoEstabelecimentoGrande,
        @NotNull(message = "Peso tamanho estabelecimento grande não pode ser nulo")
        @Min(value = 1, message = "Peso tamanho estabelecimento grande não pode ser menor que 1")
        double pesoTamanhoEstabelecimentoGrande,
        @NotNull(message = "A quantidade de caixas do estabeleciomento grande não pode ser nula")
        @Min(value = 1, message = "A quantidade de caixas do estabeleciomento grande não pode ser menor que 1")
        int qtdMaxCaixasEstabelecimentoGrande,
        @NotNull(message = "Peso caixas não pode ser nulo")
        @Min(value = 1, message = "Peso caixas não pode ser menor que 1")
        double pesoCaixas,
        @NotNull(message = "Peso funcionários não pode ser nulo")
        @Min(value = 1, message = "Peso funcionários não pode ser menor que 1")
        double pesoFuncionarios
) {
}
