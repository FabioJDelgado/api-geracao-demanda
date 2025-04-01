package com.faculdade.apigeracaodemanda.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class VariavelMacroeconomica implements Serializable {

    private Map<String, Double> taxaBasicaJuros;
    private double fatorAjuste; // Diz o quanto é a sensibilidade da demanda do produto vendio em relação a taxa básica de juros

    private double renda;


    public VariavelMacroeconomica() {
    }

    public Map<String, Double> getTaxaBasicaJuros() {
        return taxaBasicaJuros;
    }

    public void setTaxaBasicaJuros(Map<String, Double> taxaBasicaJuros) {
        this.taxaBasicaJuros = taxaBasicaJuros;
    }

    public double getFatorAjuste() {
        return fatorAjuste;
    }

    public void setFatorAjuste(double fatorAjuste) {
        this.fatorAjuste = fatorAjuste;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "VariavelMacroeconomica{" +
                "taxaBasicaJuros=" + taxaBasicaJuros +
                ", fatorAjuste=" + fatorAjuste +
                ", renda=" + renda +
                '}';
    }
}
