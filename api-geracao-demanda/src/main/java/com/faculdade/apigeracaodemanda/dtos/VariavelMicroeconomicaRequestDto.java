package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaVariavelMicroeconomia;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@ValidaVariavelMicroeconomia
public record VariavelMicroeconomicaRequestDto(
        @Min(value = 0, message = "Preço não pode ser negativo")
        double preco,
        int fatorPenalidadePreco,
        double propaganda,
        double porcentagemPropagandaRadio,
        @NotNull(message = "Valor mínimo propaganda radio não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda radio é 100")
        double valorMinimoPropagandaRadio,
        @NotNull(message = "Proporção crescimento propaganda radio não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda radio deve ser de pelo menos 1")
        double proporcaoCrescimentoPropagandaRadio,
        double porcentagemPropagandaJornal,
        @NotNull(message = "Valor mínimo propaganda jornal não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda jornal é 100")
        double valorMinimoPropagandaJornal,
        @NotNull(message = "Proporção crescimento propaganda jornal não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda jornal deve ser de pelo menos 1")
        double proporcaoCrescimentoPropagandaJornal,
        double porcentagemPropagandaTV,
        @NotNull(message = "Valor mínimo propaganda TV não pode ser nulo")
        @Min(value = 100, message = "Valor mínimo propaganda TV é 100")
        double valorMinimoPropagandaTV,
        @NotNull(message = "Proporção crescimento propaganda TV não pode ser nulo")
        @Min(value = 1, message = "Proporção crescimento propaganda TV deve ser de pelo menos 1")
        double proporcaoCrescimentoPropagandaTV,
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
        int confiabilidadeProduto3
) {
}
