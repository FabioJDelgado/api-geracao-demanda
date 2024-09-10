package com.faculdade.apigeracaodemanda.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Jogada implements Serializable {

    private String identificacaoJogada;

    private int demandaTotalJogada;

    // Preço - INÍCIO
    private double preco;
    private double notaPreco;
    private int demandaPreco;
    // Preço - FIM

    // Propaganda - INÍCIO
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
    // Propaganda - FIM


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
}
