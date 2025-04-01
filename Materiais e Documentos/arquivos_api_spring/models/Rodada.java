package com.faculdade.apigeracaodemanda.models;

import java.util.List;

public class Rodada {

    private String identificacaoRodada;

    private List<Jogada> jogadas;

    public Rodada() {
    }

    public String getIdentificacaoRodada() {
        return identificacaoRodada;
    }

    public void setIdentificacaoRodada(String identificacaoRodada) {
        this.identificacaoRodada = identificacaoRodada;
    }

    public List<Jogada> getJogadas() {
        return jogadas;
    }

    public void setJogadas(List<Jogada> jogadas) {
        this.jogadas = jogadas;
    }

    @Override
    public String toString() {
        return "Rodada{" +
                "identificacaoRodada=" + identificacaoRodada +
                ", jogadas=" + jogadas +
                '}';
    }
}
