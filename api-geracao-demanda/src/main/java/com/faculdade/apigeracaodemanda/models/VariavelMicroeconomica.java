package com.faculdade.apigeracaodemanda.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class VariavelMicroeconomica implements Serializable {


    // Preço - INÍCIO
    private double preco;
    private int fatorPenalidadePreco;
    // Preço - FIM

    // Propaganda - INÍCIO
    private double propaganda;

    private double porcentagemPropagandaRadio;
    private double valorMinimoPropagandaRadio;
    private double proporcaoCrescimentoPropagandaRadio;

    private double porcentagemPropagandaJornal;
    private double valorMinimoPropagandaJornal;
    private double proporcaoCrescimentoPropagandaJornal;

    private double porcentagemPropagandaTV;
    private double valorMinimoPropagandaTV;
    private double proporcaoCrescimentoPropagandaTV;

    private double porcentagemPropagandaInternet;
    private double valorMinimoPropagandaInternet;
    private double proporcaoCrescimentoPropagandaInternet;
    // Propaganda - FIM



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

    public double getValorMinimoPropagandaRadio() {
        return valorMinimoPropagandaRadio;
    }

    public void setValorMinimoPropagandaRadio(double valorMinimoPropagandaRadio) {
        this.valorMinimoPropagandaRadio = valorMinimoPropagandaRadio;
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

    public double getValorMinimoPropagandaJornal() {
        return valorMinimoPropagandaJornal;
    }

    public void setValorMinimoPropagandaJornal(double valorMinimoPropagandaJornal) {
        this.valorMinimoPropagandaJornal = valorMinimoPropagandaJornal;
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

    public double getValorMinimoPropagandaTV() {
        return valorMinimoPropagandaTV;
    }

    public void setValorMinimoPropagandaTV(double valorMinimoPropagandaTV) {
        this.valorMinimoPropagandaTV = valorMinimoPropagandaTV;
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

    public double getValorMinimoPropagandaInternet() {
        return valorMinimoPropagandaInternet;
    }

    public void setValorMinimoPropagandaInternet(double valorMinimoPropagandaInternet) {
        this.valorMinimoPropagandaInternet = valorMinimoPropagandaInternet;
    }

    public double getProporcaoCrescimentoPropagandaInternet() {
        return proporcaoCrescimentoPropagandaInternet;
    }

    public void setProporcaoCrescimentoPropagandaInternet(double proporcaoCrescimentoPropagandaInternet) {
        this.proporcaoCrescimentoPropagandaInternet = proporcaoCrescimentoPropagandaInternet;
    }
}
