package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;

public class CalculoQualidade {

    public static void calculaNotasQualidadeDemandas(Partida partida, String identificacaoRodada) {

        // Percorre as jogadas da partida
        for (Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()) {

            // Dividendo para calcular a quantidade máxima de estoque que pode ser vendido
            double dividendo = (jogada.getQtdProdutosFornecedor1() * 3) + (jogada.getQtdProdutosFornecedor2() * 6) + (jogada.getQtdProdutosFornecedor3() * 10);

            // Divisor para calcular a quantidade máxima de estoque que pode ser vendido
            double divisor = 19;

            // Calcula a quantidade máxima de estoque que pode ser vendido
            double qtdMaxEstoqueVendido = dividendo / divisor;


        }
    }
}
