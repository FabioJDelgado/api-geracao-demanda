package com.faculdade.apigeracaodemanda.models;

import com.faculdade.apigeracaodemanda.utils.Util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Partida implements Serializable {

    private String identificacaoPartida;
    private int quantidadeRodadas;
    private double fatiaMercado;

    private int contadorRodadas;
    private boolean partidaFinalizada;
    private List<Rodada> rodadas = new ArrayList<>();
    private VariavelMicroeconomica variavelMicroeconomica;
    private VariavelMacroeconomica variavelMacroeconomica;

    public Partida() {
    }

    public String getIdentificacaoPartida() {
        return identificacaoPartida;
    }

    public void setIdentificacaoPartida(String identificacaoPartida) {
        this.identificacaoPartida = identificacaoPartida;
    }

    public int getQuantidadeRodadas() {
        return quantidadeRodadas;
    }

    public void setQuantidadeRodadas(int quantidadeRodadas) {
        this.quantidadeRodadas = quantidadeRodadas;
    }

    public double getFatiaMercado() {
        return fatiaMercado;
    }

    public void setFatiaMercado(double fatiaMercado) {
        this.fatiaMercado = fatiaMercado;
    }

    public int getContadorRodadas() {
        return contadorRodadas;
    }

    public void setContadorRodadas(int contadorRodadas) {
        this.contadorRodadas = contadorRodadas;
    }

    public boolean isPartidaFinalizada() {
        return partidaFinalizada;
    }

    public void setPartidaFinalizada(boolean partidaFinalizada) {
        this.partidaFinalizada = partidaFinalizada;
    }

    public List<Rodada> getRodadas() {
        return rodadas;
    }

    public void setRodadas(List<Rodada> rodadas) {
        this.rodadas = rodadas;
    }

    public VariavelMicroeconomica getVariavelMicroeconomica() {
        return variavelMicroeconomica;
    }

    public void setVariavelMicroeconomica(VariavelMicroeconomica variavelMicroeconomica) {
        this.variavelMicroeconomica = variavelMicroeconomica;
    }

    public VariavelMacroeconomica getVariavelMacroeconomica() {
        return variavelMacroeconomica;
    }

    public void setVariavelMacroeconomica(VariavelMacroeconomica variavelMacroeconomica) {
        this.variavelMacroeconomica = variavelMacroeconomica;
    }

    public Rodada recuperaRodada(String identificacaoRodada){
        Rodada rodada = null;
        for(int i = 0; i < rodadas.size(); i++){
            if(rodadas.get(i).getIdentificacaoRodada().equals(identificacaoRodada)){
                rodada = rodadas.get(i);
                break;
            }
        }
        return rodada;
    }
}
