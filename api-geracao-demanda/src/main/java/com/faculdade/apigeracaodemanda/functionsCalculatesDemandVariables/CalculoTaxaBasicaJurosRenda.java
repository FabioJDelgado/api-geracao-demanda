package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Partida;

public class CalculoTaxaBasicaJurosRenda {

    public static void calculaTaxaBasicaJurosRenda(Partida partida){

        int resto = (partida.getContadorRodadas() - 1) % 3;

        if((partida.getContadorRodadas() - 1) != 0 && resto == 0){

            double taxaBasicaJurosAtual = partida.getVariavelMacroeconomica().getTaxaBasicaJuros().get(partida.getContadorRodadas());
            double taxaBasicaJurosAnterior = partida.getVariavelMacroeconomica().getTaxaBasicaJuros().get(partida.getContadorRodadas() - 3);

            double variacaoTaxaBasicaJuros = ((taxaBasicaJurosAtual - taxaBasicaJurosAnterior) / taxaBasicaJurosAnterior) * -partida.getVariavelMacroeconomica().getFatorAjuste();

            double demandaAlterada = (1 + variacaoTaxaBasicaJuros) * partida.getFatiaMercado();

            partida.setFatiaMercado(Math.ceil(demandaAlterada));
            System.out.println("Taxa básica de juros alterada para: " + partida.getFatiaMercado());

        }

    }
}
