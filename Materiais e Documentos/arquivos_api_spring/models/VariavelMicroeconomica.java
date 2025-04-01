package com.faculdade.apigeracaodemanda.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class VariavelMicroeconomica implements Serializable {

    private double propaganda;

    private double porcentagemPropagandaRadio;
    private double minimoInvestimentoPropagandaRadio;
    private double proporcaoCrescimentoPropagandaRadio;

    private double porcentagemPropagandaJornal;
    private double minimoInvestimentoPropagandaJornal;
    private double proporcaoCrescimentoPropagandaJornal;

    private double porcentagemPropagandaTV;
    private double minimoInvestimentoPropagandaTV;
    private double proporcaoCrescimentoPropagandaTV;

    private double porcentagemPropagandaInternet;
    private double minimoInvestimentoPropagandaInternet;
    private double proporcaoCrescimentoPropagandaInternet;

    private double qualidade;
    /*
        Chaves obrigatórias da taxa de devolução:
        - "fornecedor1"
        - "fornecedor2"
        - "fornecedor3"
    */
    private Map<String, Double> taxaDevolucao;

    private double preco;

    private double capacidadeInstalada;
    /*
        Chaves obrigatórias dos pesos de capacidade instalada:
        - "espacoFisico"
        - "funcionarios"
        - "caixas"
    */
    private Map<String, Double> pesosCapacidadeInstalada;

    public VariavelMicroeconomica() {
    }

    public double getPropaganda() {
        return propaganda;
    }

    public void setPropaganda(double propaganda) {
        this.propaganda = propaganda;
    }

    public double getPorcentagemPropagandaRadio() {
        return porcentagemPropagandaRadio;
    }

    public void setPorcentagemPropagandaRadio(double porcentagemPropagandaRadio) {
        this.porcentagemPropagandaRadio = porcentagemPropagandaRadio;
    }

    public double getMinimoInvestimentoPropagandaRadio() {
        return minimoInvestimentoPropagandaRadio;
    }

    public void setMinimoInvestimentoPropagandaRadio(double minimoInvestimentoPropagandaRadio) {
        this.minimoInvestimentoPropagandaRadio = minimoInvestimentoPropagandaRadio;
    }

    public double getProporcaoCrescimentoPropagandaRadio() {
        return proporcaoCrescimentoPropagandaRadio;
    }

    public void setProporcaoCrescimentoPropagandaRadio(double proporcaoCrescimentoPropagandaRadio) {
        this.proporcaoCrescimentoPropagandaRadio = proporcaoCrescimentoPropagandaRadio;
    }

    public double getPorcentagemPropagandaJornal() {
        return porcentagemPropagandaJornal;
    }

    public void setPorcentagemPropagandaJornal(double porcentagemPropagandaJornal) {
        this.porcentagemPropagandaJornal = porcentagemPropagandaJornal;
    }

    public double getMinimoInvestimentoPropagandaJornal() {
        return minimoInvestimentoPropagandaJornal;
    }

    public void setMinimoInvestimentoPropagandaJornal(double minimoInvestimentoPropagandaJornal) {
        this.minimoInvestimentoPropagandaJornal = minimoInvestimentoPropagandaJornal;
    }

    public double getProporcaoCrescimentoPropagandaJornal() {
        return proporcaoCrescimentoPropagandaJornal;
    }

    public void setProporcaoCrescimentoPropagandaJornal(double proporcaoCrescimentoPropagandaJornal) {
        this.proporcaoCrescimentoPropagandaJornal = proporcaoCrescimentoPropagandaJornal;
    }

    public double getPorcentagemPropagandaTV() {
        return porcentagemPropagandaTV;
    }

    public void setPorcentagemPropagandaTV(double porcentagemPropagandaTV) {
        this.porcentagemPropagandaTV = porcentagemPropagandaTV;
    }

    public double getMinimoInvestimentoPropagandaTV() {
        return minimoInvestimentoPropagandaTV;
    }

    public void setMinimoInvestimentoPropagandaTV(double minimoInvestimentoPropagandaTV) {
        this.minimoInvestimentoPropagandaTV = minimoInvestimentoPropagandaTV;
    }

    public double getProporcaoCrescimentoPropagandaTV() {
        return proporcaoCrescimentoPropagandaTV;
    }

    public void setProporcaoCrescimentoPropagandaTV(double proporcaoCrescimentoPropagandaTV) {
        this.proporcaoCrescimentoPropagandaTV = proporcaoCrescimentoPropagandaTV;
    }

    public double getPorcentagemPropagandaInternet() {
        return porcentagemPropagandaInternet;
    }

    public void setPorcentagemPropagandaInternet(double porcentagemPropagandaInternet) {
        this.porcentagemPropagandaInternet = porcentagemPropagandaInternet;
    }

    public double getMinimoInvestimentoPropagandaInternet() {
        return minimoInvestimentoPropagandaInternet;
    }

    public void setMinimoInvestimentoPropagandaInternet(double minimoInvestimentoPropagandaInternet) {
        this.minimoInvestimentoPropagandaInternet = minimoInvestimentoPropagandaInternet;
    }

    public double getProporcaoCrescimentoPropagandaInternet() {
        return proporcaoCrescimentoPropagandaInternet;
    }

    public void setProporcaoCrescimentoPropagandaInternet(double proporcaoCrescimentoPropagandaInternet) {
        this.proporcaoCrescimentoPropagandaInternet = proporcaoCrescimentoPropagandaInternet;
    }

    public double getQualidade() {
        return qualidade;
    }

    public void setQualidade(double qualidade) {
        this.qualidade = qualidade;
    }

    public Map<String, Double> getTaxaDevolucao() {
        return taxaDevolucao;
    }

    public void setTaxaDevolucao(Map<String, Double> taxaDevolucao) {
        this.taxaDevolucao = taxaDevolucao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getCapacidadeInstalada() {
        return capacidadeInstalada;
    }

    public void setCapacidadeInstalada(double capacidadeInstalada) {
        this.capacidadeInstalada = capacidadeInstalada;
    }

    public Map<String, Double> getPesosCapacidadeInstalada() {
        return pesosCapacidadeInstalada;
    }

    public void setPesosCapacidadeInstalada(Map<String, Double> pesosCapacidadeInstalada) {
        this.pesosCapacidadeInstalada = pesosCapacidadeInstalada;
    }

    @Override
    public String toString() {
        return "VariavelMicroeconomica{" +
                "propaganda=" + propaganda +
                ", porcentagemPropagandaRadio=" + porcentagemPropagandaRadio +
                ", minimoInvestimentoPropagandaRadio=" + minimoInvestimentoPropagandaRadio +
                ", proporcaoCrescimentoPropagandaRadio=" + proporcaoCrescimentoPropagandaRadio +
                ", porcentagemPropagandaJornal=" + porcentagemPropagandaJornal +
                ", minimoInvestimentoPropagandaJornal=" + minimoInvestimentoPropagandaJornal +
                ", proporcaoCrescimentoPropagandaJornal=" + proporcaoCrescimentoPropagandaJornal +
                ", porcentagemPropagandaTV=" + porcentagemPropagandaTV +
                ", minimoInvestimentoPropagandaTV=" + minimoInvestimentoPropagandaTV +
                ", proporcaoCrescimentoPropagandaTV=" + proporcaoCrescimentoPropagandaTV +
                ", porcentagemPropagandaInternet=" + porcentagemPropagandaInternet +
                ", minimoInvestimentoPropagandaInternet=" + minimoInvestimentoPropagandaInternet +
                ", proporcaoCrescimentoPropagandaInternet=" + proporcaoCrescimentoPropagandaInternet +
                ", qualidade=" + qualidade +
                ", taxaDevolucao=" + taxaDevolucao +
                ", preco=" + preco +
                ", capacidadeInstalada=" + capacidadeInstalada +
                ", pesosCapacidadeInstalada=" + pesosCapacidadeInstalada +
                '}';
    }
}
