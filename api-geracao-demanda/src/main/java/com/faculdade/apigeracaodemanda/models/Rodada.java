package com.faculdade.apigeracaodemanda.models;

import com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables.*;

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

    // Calcula a demanda das jogadas da rodada
    public void calculaDemandaJogadas(Partida partida){

        // Calcula impacto da taxa básica de juros
        CalculoTaxaBasicaJuros.calculaTaxaBasicaJuros(partida);

        // Calcula demanda do preço
        CalculoPreco.calculaNotasPrecoDemandas(partida, this.identificacaoRodada);

        // Calcula demanda da propaganda
        CalculoPropaganda.calculaDemandaPropaganda(partida, this.identificacaoRodada);

        // Calcula demanda da capacidade instalada
        CalculoCapacidadeInstalada.calculaCapacidadeInstalada(partida, this.identificacaoRodada);

        // Calcula demanda da concorrência
        CalculoConcorrencia.calculaConcorrencia(partida, this.identificacaoRodada);

        // Calcula demanda da confiabilidade (Deve ser o último cálculo)
        CalculoConfiabilidade.calculaConfiabilidade(partida, this.identificacaoRodada);
    }

    @Override
    public String toString() {
        return "Rodada{" +
                "identificacaoRodada=" + identificacaoRodada +
                ", jogadas=" + jogadas +
                '}';
    }
}
