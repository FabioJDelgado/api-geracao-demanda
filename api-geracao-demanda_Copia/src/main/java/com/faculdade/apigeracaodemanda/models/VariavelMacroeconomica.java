package com.faculdade.apigeracaodemanda.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class VariavelMacroeconomica implements Serializable {

    private Map<String, Double> taxaBasicaJuros;
    private double renda;

    public VariavelMacroeconomica() {
    }

    public Map<String, Double> getTaxaBasicaJuros() {
        return taxaBasicaJuros;
    }

    public void setTaxaBasicaJuros(Map<String, Double> taxaBasicaJuros) {
        this.taxaBasicaJuros = taxaBasicaJuros;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "VariaveisMacroeconomicas{" +
                "taxaBasicaJuros=" + taxaBasicaJuros +
                ", renda=" + renda +
                '}';
    }
}
