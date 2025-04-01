package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaVariavelMicroeconomia;
import jakarta.validation.constraints.Min;

@ValidaVariavelMicroeconomia
public record VariavelMicroeconomicaRequestDto(
        @Min(value = 0, message = "Propaganda não pode ser negativa")
        double propaganda,
        @Min(value = 0, message = "Porcentagem propaganda radio não pode ser negativa")
        double porcentagemPropagandaRadio,
        @Min(value = 0, message = "Porcentagem propaganda jornal não pode ser negativa")
        double porcentagemPropagandaJornal,
        @Min(value = 0, message = "Porcentagem propaganda TV não pode ser negativa")
        double porcentagemPropagandaTV,
        @Min(value = 0, message = "Porcentagem propaganda internet não pode ser negativa")
        double porcentagemPropagandaInternet,
        @Min(value = 0, message = "Qualidade não pode ser negativa")
        double qualidade,
        @Min(value = 0, message = "Preço não pode ser negativo")
        double preco,
        @Min(value = 0, message = "Capacidade instalada não pode ser negativa")
        double capacidadeInstalada
) {
}
