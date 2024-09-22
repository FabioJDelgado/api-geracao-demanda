package com.faculdade.apigeracaodemanda.models.enums;

import com.faculdade.apigeracaodemanda.exceptions.DadosInconsistentesException;

public enum TamanhoEstabelecimento {

    PEQUENO("PEQUENO"),
    MEDIO("MEDIO"),
    GRANDE("GRANDE");

    private String tamanhoEstabelecimento;

    TamanhoEstabelecimento(String tamanhoEstabelecimento) {
        this.tamanhoEstabelecimento = tamanhoEstabelecimento;
    }

    public static TamanhoEstabelecimento toEnum(String tamanhoEstabelecimento) {
        for (TamanhoEstabelecimento tamEstab : TamanhoEstabelecimento.values()) {
            if (tamanhoEstabelecimento.equals(tamEstab.getTamanhoEstabelecimento())) {
                return tamEstab;
            }
        }
        throw new DadosInconsistentesException("Tamanho Estabelecioemnto inválido: " + tamanhoEstabelecimento);
    }

    public String getTamanhoEstabelecimento() {
        return tamanhoEstabelecimento;
    }
}
