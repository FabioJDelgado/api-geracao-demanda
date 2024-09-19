package com.faculdade.apigeracaodemanda.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class VariavelMacroeconomica implements Serializable {

    private Map<Integer, Double> taxaBasicaJuros = new HashMap<>();
    private double fatorAjuste; // Diz o quanto é a sensibilidade da demanda do produto vendio em relação a taxa básica de juros


    public VariavelMacroeconomica() {
    }

    public Map<Integer, Double> getTaxaBasicaJuros() {
        return taxaBasicaJuros;
    }

    public void setTaxaBasicaJuros(Map<Integer, Double> taxaBasicaJuros) {
        this.taxaBasicaJuros = taxaBasicaJuros;
    }

    public void setAlterarTaxaBasicaJuros(Integer rodada, Double taxa) {
        this.taxaBasicaJuros.put(rodada, taxa);
    }

    public double getFatorAjuste() {
        return fatorAjuste;
    }

    public void setFatorAjuste(double fatorAjuste) {
        this.fatorAjuste = fatorAjuste;
    }

}
