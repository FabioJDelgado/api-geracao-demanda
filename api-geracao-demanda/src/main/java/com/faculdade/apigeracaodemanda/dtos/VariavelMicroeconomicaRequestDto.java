package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.validations.ValidaVariavelMicroeconomia;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@ValidaVariavelMicroeconomia
public record VariavelMicroeconomicaRequestDto(
        @Min(value = 0, message = "Preço não pode ser negativo")
        double preco,
        int fatorPenalidadePreco
) {
}
