package com.faculdade.apigeracaodemanda.models;

import com.faculdade.apigeracaodemanda.exceptions.ErroInfo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class VariavelMicroeconomica implements Serializable {

    private double propaganda;

    private double porcentagemPropagandaRadio;
    private double minimoInvestimentoPropagandaRadio;
    private double proprocaoCrescimentoPropagandaRadio;

    private double porcentagemPropagandaJornal;
    private double minimoInvestimentoPropagandaJornal;
    private double proprocaoCrescimentoPropagandaJornal;

    private double porcentagemPropagandaTV;
    private double minimoInvestimentoPropagandaTV;
    private double proprocaoCrescimentoPropagandaTV;

    private double porcentagemPropagandaInternet;
    private double minimoInvestimentoPropagandaInternet;
    private double proprocaoCrescimentoPropagandaInternet;

    private double qualidade;

    private double preco;

    private double capacidadeInstalada;

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

    public double getPorcentagemPropagandaJornal() {
        return porcentagemPropagandaJornal;
    }

    public void setPorcentagemPropagandaJornal(double porcentagemPropagandaJornal) {
        this.porcentagemPropagandaJornal = porcentagemPropagandaJornal;
    }

    public double getPorcentagemPropagandaTV() {
        return porcentagemPropagandaTV;
    }

    public void setPorcentagemPropagandaTV(double porcentagemPropagandaTV) {
        this.porcentagemPropagandaTV = porcentagemPropagandaTV;
    }

    public double getPorcentagemPropagandaInternet() {
        return porcentagemPropagandaInternet;
    }

    public void setPorcentagemPropagandaInternet(double porcentagemPropagandaInternet) {
        this.porcentagemPropagandaInternet = porcentagemPropagandaInternet;
    }

    public double getQualidade() {
        return qualidade;
    }

    public void setQualidade(double qualidade) {
        this.qualidade = qualidade;
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

    @Override
    public String toString() {
        return "VariavelMicroeconomica{" +
                "propaganda=" + propaganda +
                ", porcentagemPropagandaRadio=" + porcentagemPropagandaRadio +
                ", porcentagemPropagandaJornal=" + porcentagemPropagandaJornal +
                ", porcentagemPropagandaTV=" + porcentagemPropagandaTV +
                ", porcentagemPropagandaInternet=" + porcentagemPropagandaInternet +
                ", qualidade=" + qualidade +
                ", preco=" + preco +
                ", capacidadeInstalada=" + capacidadeInstalada +
                '}';
    }
}
