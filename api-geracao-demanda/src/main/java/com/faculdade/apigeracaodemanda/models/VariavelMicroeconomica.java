package com.faculdade.apigeracaodemanda.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class VariavelMicroeconomica implements Serializable {


    private double preco;
    private int fatorPenalidadePreco;


    public VariavelMicroeconomica() {
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getFatorPenalidadePreco() {
        return fatorPenalidadePreco;
    }

    public void setFatorPenalidadePreco(int fatorPenalidadePreco) {
        this.fatorPenalidadePreco = fatorPenalidadePreco;
    }

    @Override
    public String toString() {
        return "VariavelMicroeconomica{" +
                "preco=" + preco +
                ", fatorPenalidadePreco=" + fatorPenalidadePreco +
                '}';
    }
}
