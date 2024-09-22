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

    // Confiabilidade - INÍCIO
    private int confiabilidadeProduto1;
    private int confiabilidadeProduto2;
    private int confiabilidadeProduto3;
    // Confiabilidade - FIM

    // Capacidade instalada - INÍCIO
    private double pesoTamanhoEstabelecimento;
    private double pesoCaixas;
    private double pesoFuncionarios;
    // Capacidade instalada - FIM


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

    public int getConfiabilidadeProduto1() {
        return confiabilidadeProduto1;
    }

    public void setConfiabilidadeProduto1(int confiabilidadeProduto1) {
        this.confiabilidadeProduto1 = confiabilidadeProduto1;
    }

    public int getConfiabilidadeProduto2() {
        return confiabilidadeProduto2;
    }

    public void setConfiabilidadeProduto2(int confiabilidadeProduto2) {
        this.confiabilidadeProduto2 = confiabilidadeProduto2;
    }

    public int getConfiabilidadeProduto3() {
        return confiabilidadeProduto3;
    }

    public void setConfiabilidadeProduto3(int confiabilidadeProduto3) {
        this.confiabilidadeProduto3 = confiabilidadeProduto3;
    }

    public double getPesoTamanhoEstabelecimento() {
        return pesoTamanhoEstabelecimento;
    }

    public void setPesoTamanhoEstabelecimento(double pesoTamanhoEstabelecimento) {
        this.pesoTamanhoEstabelecimento = pesoTamanhoEstabelecimento;
    }

    public double getPesoCaixas() {
        return pesoCaixas;
    }

    public void setPesoCaixas(double pesoCaixas) {
        this.pesoCaixas = pesoCaixas;
    }

    public double getPesoFuncionarios() {
        return pesoFuncionarios;
    }

    public void setPesoFuncionarios(double pesoFuncionarios) {
        this.pesoFuncionarios = pesoFuncionarios;
    }
}
