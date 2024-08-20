package com.faculdade.apigeracaodemanda.models.enums;

import com.faculdade.apigeracaodemanda.exceptions.DadosInconsistentesException;

public enum TipoProduto {

    ESSENCIAL("ESSENCIAL"),
    SECUNDARIO("SECUNDARIO"),
    LUXO_SUPERFLUO("LUXO/SUPERFLUO");

    private String tipoProduto;

    TipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public static TipoProduto toEnum(String tipoProduto) {
        for (TipoProduto tipoProd : TipoProduto.values()) {
            if (tipoProduto.equals(tipoProd.getTipoProduto())) {
                return tipoProd;
            }
        }
        throw new DadosInconsistentesException("Tipo de produto inválido: " + tipoProduto);
    }

    public String getTipoProduto() {
        return this.tipoProduto;
    }
}
