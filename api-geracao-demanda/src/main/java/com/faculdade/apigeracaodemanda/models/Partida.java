package com.faculdade.apigeracaodemanda.models;

import com.faculdade.apigeracaodemanda.models.enums.TipoProduto;
import com.faculdade.apigeracaodemanda.utils.Util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Partida implements Serializable {

    private String identificacaoPartida;
    private int quantidadeRodadas;
    private double intencaoCompra;

    /*
    Tipos de produtos:
        - essencial
	    - secundario
	    - luxo/superfluo
    */
    private TipoProduto tipoProduto;
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

    public double getIntencaoCompra() {
        return intencaoCompra;
    }

    public void setIntencaoCompra(double intencaoCompra) {
        this.intencaoCompra = intencaoCompra;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
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

    @Override
    public String toString() {
        return "Partida{" +
                "identificacaoPartida='" + identificacaoPartida + '\'' +
                ", quantidadeRodadas=" + quantidadeRodadas +
                ", intencaoCompra=" + intencaoCompra +
                ", tipoProduto=" + tipoProduto +
                ", contadorRodadas=" + contadorRodadas +
                ", partidaFinalizada=" + partidaFinalizada +
                ", rodadas=" + rodadas +
                ", variavelMicroeconomica=" + variavelMicroeconomica +
                ", variavelMacroeconomica=" + variavelMacroeconomica +
                '}';
    }
}
