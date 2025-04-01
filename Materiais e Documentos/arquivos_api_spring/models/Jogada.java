package com.faculdade.apigeracaodemanda.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Jogada implements Serializable {

    private String identificacaoJogada;


    private int demandaTotalJogada;


    private double investimentoPropagandaRadio;
    private double notaPropagandaRadio;
    private int demandaPropagandaRadio;

    private double investimentoPropagandaJornal;
    private double notaPropagandaJornal;
    private int demandaPropagandaJornal;

    private double investimentoPropagandaTV;
    private double notaPropagandaTV;
    private int demandaPropagandaTV;

    private double investimentoPropagandaInternet;
    private double notaPropagandaInternet;
    private int demandaPropagandaInternet;

    private int demandaTotalPropaganda;


    private int qtdProdutosFornecedor1;
    private int qtdProdutosFornecedor2;
    private int qtdProdutosFornecedor3;
    private double notaQualidade;
    private int demandaQualidade;


    private double preco;
    private double notaPreco;
    private int demandaPreco;


    /*
        Chaves obrigatórias da capacidade instalada:
        - "espacoFisico"
        - "funcionarios"
        - "caixas"
    */
    private Map<String, Integer> capacidadeInstalada = new HashMap<>();
    private double notaCapacidadeInstalada;
    private int demandaCapacidadeInstalada;


    public Jogada() {
    }

    @Override
    public String toString() {
        return "Jogada{" +
                "identificacaoJogada='" + identificacaoJogada + '\'' +
                ", demandaTotalJogada=" + demandaTotalJogada +
                ", investimentoPropagandaRadio=" + investimentoPropagandaRadio +
                ", notaPropagandaRadio=" + notaPropagandaRadio +
                ", demandaPropagandaRadio=" + demandaPropagandaRadio +
                ", investimentoPropagandaJornal=" + investimentoPropagandaJornal +
                ", notaPropagandaJornal=" + notaPropagandaJornal +
                ", demandaPropagandaJornal=" + demandaPropagandaJornal +
                ", investimentoPropagandaTV=" + investimentoPropagandaTV +
                ", notaPropagandaTV=" + notaPropagandaTV +
                ", demandaPropagandaTV=" + demandaPropagandaTV +
                ", investimentoPropagandaInternet=" + investimentoPropagandaInternet +
                ", notaPropagandaInternet=" + notaPropagandaInternet +
                ", demandaPropagandaInternet=" + demandaPropagandaInternet +
                ", demandaTotalPropaganda=" + demandaTotalPropaganda +
                ", qtdProdutosFornecedor1=" + qtdProdutosFornecedor1 +
                ", qtdProdutosFornecedor2=" + qtdProdutosFornecedor2 +
                ", qtdProdutosFornecedor3=" + qtdProdutosFornecedor3 +
                ", notaQualidade=" + notaQualidade +
                ", demandaQualidade=" + demandaQualidade +
                ", preco=" + preco +
                ", notaPreco=" + notaPreco +
                ", demandaPreco=" + demandaPreco +
                ", capacidadeInstalada=" + capacidadeInstalada +
                ", notaCapacidadeInstalada=" + notaCapacidadeInstalada +
                ", demandaCapacidadeInstalada=" + demandaCapacidadeInstalada +
                '}';
    }
}
