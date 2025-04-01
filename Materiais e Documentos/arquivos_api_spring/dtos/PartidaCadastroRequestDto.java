package com.faculdade.apigeracaodemanda.dtos;

import com.faculdade.apigeracaodemanda.models.enums.TipoProduto;
import com.faculdade.apigeracaodemanda.validations.ValidaEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record PartidaCadastroRequestDto(
        @Min(value = 6, message = "Uma partida deve ter no mínimo 6 rodadas")
        int quantidadeRodadas,
        @Min(value = 1000, message = "A quantidade consumidores dispostos a consumir o produto deve de ser no mínimo 1000")
        double intencaoCompra,
        @NotBlank(message = "O tipo do produto não pode ser vazio ou nulo e deve ser um dos valores: essencial, secundario ou luxo/superfluo")
        @ValidaEnum(enumClass = TipoProduto.class, message = "O tipo do produto deve ser um dos valores: essencial, secundario ou luxo/superfluo", casosIgnorados = false)
        String tipoProduto,
        @Valid
        VariavelMicroeconomicaRequestDto variavelMicroeconomica,
        @Valid
        VariavelMacroeconomicaCadastroRequestDto variavelMacroeconomica
) {
}
