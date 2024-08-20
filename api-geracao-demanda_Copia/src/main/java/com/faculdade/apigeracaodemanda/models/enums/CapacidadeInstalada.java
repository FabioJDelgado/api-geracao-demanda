package com.faculdade.apigeracaodemanda.models.enums;

import com.faculdade.apigeracaodemanda.exceptions.DadosInconsistentesException;

public enum CapacidadeInstalada {

    CAPACIDADEINSTALADA1("CAPACIDADEINSTALADA1"),
    CAPACIDADEINSTALADA2("CAPACIDADEINSTALADA2"),
    CAPACIDADEINSTALADA3("CAPACIDADEINSTALADA3");

    private String capacidadeinstalada;

    CapacidadeInstalada(String capacidadeinstalada) {
        this.capacidadeinstalada = capacidadeinstalada;
    }

    public static CapacidadeInstalada toEnum(String capacidadeinstalada) {
        for (CapacidadeInstalada capacidade : CapacidadeInstalada.values()) {
            if (capacidadeinstalada.equals(capacidade.getCapacidadeInstalada())) {
                return capacidade;
            }
        }
        throw new DadosInconsistentesException("Capacidade instalada inválida: " + capacidadeinstalada);
    }

    public String getCapacidadeInstalada() {
        return this.capacidadeinstalada;
    }
}
