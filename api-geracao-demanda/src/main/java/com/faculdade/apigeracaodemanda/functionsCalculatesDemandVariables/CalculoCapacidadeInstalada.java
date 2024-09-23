package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;

public class CalculoCapacidadeInstalada {

    public static void calculaCapacidadeInstalada(Partida partida, String identificacaoRodada) {

        for (Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()) {

            // Equaliza valores capactidade instalada
            int qtdFuncionariosFinais = 1;
            int qtdFuncionariosCaixa = 0;
            int qtdFuncionariosEstoque = 0;
            int qtdCaixasFinais = 0;

            if((jogada.getQtdFuncionarios() - 1) % 2 == 0){
                qtdFuncionariosCaixa = (jogada.getQtdFuncionarios() - 1) / 2;
            } else {
                qtdFuncionariosCaixa = (jogada.getQtdFuncionarios() - 2) / 2;
            }

            if(qtdFuncionariosCaixa > jogada.getQtdCaixas()){
                qtdFuncionariosCaixa = jogada.getQtdCaixas();
                qtdCaixasFinais = jogada.getQtdCaixas();
            } else if(qtdFuncionariosCaixa < jogada.getQtdCaixas()){
                qtdCaixasFinais = qtdFuncionariosCaixa;
            } else{
                qtdCaixasFinais = jogada.getQtdCaixas();
            }

            qtdFuncionariosEstoque = qtdFuncionariosCaixa;

            qtdFuncionariosFinais += qtdFuncionariosCaixa + qtdFuncionariosEstoque;





        }
    }
}
