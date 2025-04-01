package com.faculdade.apigeracaodemanda.models;

import com.faculdade.apigeracaodemanda.models.enums.CapacidadeInstalada;

import java.io.Serializable;

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

    /*
    - fornecedor 1: => pior qualidade
                    => taxa de devolução: 1 a cada 4 produtos
                    => taxa de compra: 1 a cada 10 produtos
                    => peso qualidade: 3
    - fornecedor 2: => média qualidade
                    => taxa de devolução: 1 a cada 12 produtos
                    => taxa de compra: 3 a cada 10 produtos
                    => peso qualidade: 6
    - fornecedor 3: => melhor qualidade
                    => taxa de devolução: 1 a cada 25 produtos
                    => taxa de compra: 6 a cada 10 produtos
                    => peso qualidade: 10
    */
    private int qtdProdutosFornecedor1;
    private int qtdProdutosFornecedor2;
    private int qtdProdutosFornecedor3;
    private double notaQualidade;
    private int demandaQualidade;

    private double preco;
    private double notaPreco;
    private int demandaPreco;

    /*
    - capacidade instalada 1: => espaço físico: 5 metros de largura por 10 de comprimento
                              => número de funcionários: 3 (caixa: 1, atendimento: 1, estoque: 1)
                              => número de caixas: 1
                              => nota: 3
    - capacidade instalada 2: => espaço físico: 10 metros de largura por 15 de comprimento
                              => número de funcionários: 9 (caixa: 3, atendimento: 4, estoque: 2)
                              => número de caixas: 3
                              => nota: 6,5
    - capacidade instalada 3: => espaço físico: 15 metros de largura por 20 de comprimento
                              => número de funcionários: 18 (caixa: 5, atendimento: 9, estoque: 4)
                              => número de caixas: 5
                              => nota: 10
    */
    private CapacidadeInstalada capacidadeInstalada;
    private double notaCapacidadeInstalada;
    private int demandaCapacidadeInstalada;

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

    public double getInvestimentoPropagandaRadio() {
        return investimentoPropagandaRadio;
    }

    public void setInvestimentoPropagandaRadio(double investimentoPropagandaRadio) {
        this.investimentoPropagandaRadio = investimentoPropagandaRadio;
    }

    public double getNotaPropagandaRadio() {
        return notaPropagandaRadio;
    }

    public void setNotaPropagandaRadio(double notaPropagandaRadio) {
        this.notaPropagandaRadio = notaPropagandaRadio;
    }

    public int getDemandaPropagandaRadio() {
        return demandaPropagandaRadio;
    }

    public void setDemandaPropagandaRadio(int demandaPropagandaRadio) {
        this.demandaPropagandaRadio = demandaPropagandaRadio;
    }

    public double getInvestimentoPropagandaJornal() {
        return investimentoPropagandaJornal;
    }

    public void setInvestimentoPropagandaJornal(double investimentoPropagandaJornal) {
        this.investimentoPropagandaJornal = investimentoPropagandaJornal;
    }

    public double getNotaPropagandaJornal() {
        return notaPropagandaJornal;
    }

    public void setNotaPropagandaJornal(double notaPropagandaJornal) {
        this.notaPropagandaJornal = notaPropagandaJornal;
    }

    public int getDemandaPropagandaJornal() {
        return demandaPropagandaJornal;
    }

    public void setDemandaPropagandaJornal(int demandaPropagandaJornal) {
        this.demandaPropagandaJornal = demandaPropagandaJornal;
    }

    public double getInvestimentoPropagandaTV() {
        return investimentoPropagandaTV;
    }

    public void setInvestimentoPropagandaTV(double investimentoPropagandaTV) {
        this.investimentoPropagandaTV = investimentoPropagandaTV;
    }

    public double getNotaPropagandaTV() {
        return notaPropagandaTV;
    }

    public void setNotaPropagandaTV(double notaPropagandaTV) {
        this.notaPropagandaTV = notaPropagandaTV;
    }

    public int getDemandaPropagandaTV() {
        return demandaPropagandaTV;
    }

    public void setDemandaPropagandaTV(int demandaPropagandaTV) {
        this.demandaPropagandaTV = demandaPropagandaTV;
    }

    public double getInvestimentoPropagandaInternet() {
        return investimentoPropagandaInternet;
    }

    public void setInvestimentoPropagandaInternet(double investimentoPropagandaInternet) {
        this.investimentoPropagandaInternet = investimentoPropagandaInternet;
    }

    public double getNotaPropagandaInternet() {
        return notaPropagandaInternet;
    }

    public void setNotaPropagandaInternet(double notaPropagandaInternet) {
        this.notaPropagandaInternet = notaPropagandaInternet;
    }

    public int getDemandaPropagandaInternet() {
        return demandaPropagandaInternet;
    }

    public void setDemandaPropagandaInternet(int demandaPropagandaInternet) {
        this.demandaPropagandaInternet = demandaPropagandaInternet;
    }

    public int getDemandaTotalPropaganda() {
        return demandaTotalPropaganda;
    }

    public void setDemandaTotalPropaganda(int demandaTotalPropaganda) {
        this.demandaTotalPropaganda = demandaTotalPropaganda;
    }

    public int getQtdProdutosFornecedor1() {
        return qtdProdutosFornecedor1;
    }

    public void setQtdProdutosFornecedor1(int qtdProdutosFornecedor1) {
        this.qtdProdutosFornecedor1 = qtdProdutosFornecedor1;
    }

    public int getQtdProdutosFornecedor2() {
        return qtdProdutosFornecedor2;
    }

    public void setQtdProdutosFornecedor2(int qtdProdutosFornecedor2) {
        this.qtdProdutosFornecedor2 = qtdProdutosFornecedor2;
    }

    public int getQtdProdutosFornecedor3() {
        return qtdProdutosFornecedor3;
    }

    public void setQtdProdutosFornecedor3(int qtdProdutosFornecedor3) {
        this.qtdProdutosFornecedor3 = qtdProdutosFornecedor3;
    }

    public double getNotaQualidade() {
        return notaQualidade;
    }

    public void setNotaQualidade(double notaQualidade) {
        this.notaQualidade = notaQualidade;
    }

    public int getDemandaQualidade() {
        return demandaQualidade;
    }

    public void setDemandaQualidade(int demandaQualidade) {
        this.demandaQualidade = demandaQualidade;
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

    public CapacidadeInstalada getCapacidadeInstalada() {
        return capacidadeInstalada;
    }

    public void setCapacidadeInstalada(CapacidadeInstalada capacidadeInstalada) {
        this.capacidadeInstalada = capacidadeInstalada;
    }

    public double getNotaCapacidadeInstalada() {
        return notaCapacidadeInstalada;
    }

    public void setNotaCapacidadeInstalada(double notaCapacidadeInstalada) {
        this.notaCapacidadeInstalada = notaCapacidadeInstalada;
    }

    public int getDemandaCapacidadeInstalada() {
        return demandaCapacidadeInstalada;
    }

    public void setDemandaCapacidadeInstalada(int demandaCapacidadeInstalada) {
        this.demandaCapacidadeInstalada = demandaCapacidadeInstalada;
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
