package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Partida;

public class CalculoTaxaBasicaJurosRenda {

    public static void calculaTaxaBasicaJurosRenda(Partida partida){

        int resto = partida.getContadorRodadas() % 3;

        if(resto == 0){

            double taxaBasicaJurosAtual = partida.getVariavelMacroeconomica().getTaxaBasicaJuros().get("rodada" + partida.getContadorRodadas());
            double taxaBasicaJurosAnterior = partida.getVariavelMacroeconomica().getTaxaBasicaJuros().get("rodada" + (partida.getContadorRodadas() - 2));
            double diferencaoTaxaBasicaJuros = taxaBasicaJurosAtual - taxaBasicaJurosAnterior;

            int intencaoCompraAlterada = (int) (partida.getFatiaMercado() * (1 - ((partida.getVariavelMacroeconomica().getFatorAjuste()/10) * diferencaoTaxaBasicaJuros)));

            partida.setFatiaMercado(intencaoCompraAlterada);

        }

    }
}
