package com.faculdade.apigeracaodemanda.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Jogada implements Serializable {

    private String identificacaoJogada;

    private int demandaTotalJogada;


    private double preco;
    private double notaPreco;
    private int demandaPreco;


    public Jogada() {
    }

    public String getIdentificacaoJogada() {
        return identificacaoJogada;
    }

    public void setIdentificacaoJogada(String identificacaoJogada) {
        this.identificacaoJogada = identificacaoJogada;
    }

    public int getDemandaTotalJogada() {
        return demandaTotalJogada;
    }

    public void setDemandaTotalJogada(int demandaTotalJogada) {
        this.demandaTotalJogada = demandaTotalJogada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getNotaPreco() {
        return notaPreco;
    }

    public void setNotaPreco(double notaPreco) {
        this.notaPreco = notaPreco;
    }

    public int getDemandaPreco() {
        return demandaPreco;
    }

    public void setDemandaPreco(int demandaPreco) {
        this.demandaPreco = demandaPreco;
    }

    @Override
    public String toString() {
        return "Jogada{" +
                "identificacaoJogada='" + identificacaoJogada + '\'' +
                ", demandaTotalJogada=" + demandaTotalJogada +
                ", preco=" + preco +
                ", notaPreco=" + notaPreco +
                ", demandaPreco=" + demandaPreco +
                '}';
    }
}
