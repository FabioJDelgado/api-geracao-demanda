package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaPesoCapacidadeInstaladaVariavelMicroeconomica;
import com.faculdade.apigeracaodemanda.validations.ValidaTaxaDevolucaoVariavelMicroeconomica;
import com.faculdade.apigeracaodemanda.validations.ValidaVariavelMicroeconomia;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.Map;

@ValidaVariavelMicroeconomia
public record VariavelMicroeconomicaRequestDto(
        @Min(value = 0, message = "Propaganda não pode ser negativa")
        double propaganda,
        @Min(value = 0, message = "Porcentagem propaganda radio não pode ser negativa")
        double porcentagemPropagandaRadio,
        @Min(value = 0, message = "Minimo investimento propaganda radio não pode ser negativo")
        double minimoInvestimentoPropagandaRadio,
        @Min(value = 0, message = "Porcentagem propaganda jornal não pode ser negativa")
        double porcentagemPropagandaJornal,
        @Min(value = 0, message = "Minimo investimento propaganda jornal não pode ser negativo")
        double minimoInvestimentoPropagandaJornal,
        @Min(value = 0, message = "Porcentagem propaganda TV não pode ser negativa")
        double porcentagemPropagandaTV,
        @Min(value = 0, message = "Minimo investimento propaganda TV não pode ser negativo")
        double minimoInvestimentoPropagandaTV,
        @Min(value = 0, message = "Porcentagem propaganda internet não pode ser negativa")
        double porcentagemPropagandaInternet,
        @Min(value = 0, message = "Minimo investimento propaganda internet não pode ser negativo")
        double minimoInvestimentoPropagandaInternet,
        @Min(value = 0, message = "Qualidade não pode ser negativa")
        double qualidade,
        @NotNull(message = "Taxa de devolução não pode ser nula")
        @ValidaTaxaDevolucaoVariavelMicroeconomica
        Map<String, Double> taxaDevolucao,
        @Min(value = 0, message = "Preço não pode ser negativo")
        double preco,
        @Min(value = 0, message = "Capacidade instalada não pode ser negativa")
        double capacidadeInstalada,
        @NotNull(message = "Pesos capacidade instalada não podem ser nulos")
        @ValidaPesoCapacidadeInstaladaVariavelMicroeconomica
        Map<String, Double> pesosCapacidadeInstalada
) {
}
