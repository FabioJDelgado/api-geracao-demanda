package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;

public class CalculoConfiabilidade {

    public static void calculaConfiabilidade(Partida partida, String identificacaoRodada) {

        for (Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()) {

            // Calcula a quantidade total de produtos em estoque
            int totalEstoque = jogada.getQtdProdutosEstoqueFornecedor1() + jogada.getQtdProdutosEstoqueFornecedor2() + jogada.getQtdProdutosEstoqueFornecedor3();


            // Calcula a porcentagem de produtos em estoque de cada fornecedor
            double porcentagemEstoqueFornecedor1 = (double) jogada.getQtdProdutosEstoqueFornecedor1() / (double) totalEstoque;
            double porcentagemEstoqueFornecedor2 = (double) jogada.getQtdProdutosEstoqueFornecedor2() / (double) totalEstoque;
            double porcentagemEstoqueFornecedor3 = (double) jogada.getQtdProdutosEstoqueFornecedor3() / (double) totalEstoque;


            // Faz a distribuição do produtos em estoque de acordo com a porcentagem de cada fornecedor
            if(jogada.getDemandaTotalJogada() > totalEstoque){
                jogada.setDemandaTotalJogada(totalEstoque);
            }

            double qtdProdutosPorcentagemFornecedor1 = jogada.getDemandaTotalJogada() * porcentagemEstoqueFornecedor1;
            double qtdProdutosPorcentagemFornecedor2 = jogada.getDemandaTotalJogada() * porcentagemEstoqueFornecedor2;
            double qtdProdutosPorcentagemFornecedor3 = jogada.getDemandaTotalJogada() * porcentagemEstoqueFornecedor3;
            System.out.println("demandaTotalJogada: " + jogada.getDemandaTotalJogada());
            System.out.println("qtdProdutosPorcentagemFornecedor1: " + qtdProdutosPorcentagemFornecedor1 + " qtdProdutosPorcentagemFornecedor2: " + qtdProdutosPorcentagemFornecedor2 + " qtdProdutosPorcentagemFornecedor3: " + qtdProdutosPorcentagemFornecedor3);


            // Aplica a taxa de confiabilidade
            double valorDecrescimoFornecedor1 = qtdProdutosPorcentagemFornecedor1 / partida.getVariavelMicroeconomica().getConfiabilidadeProduto1();
            double valorDecrescimoFornecedor2 = qtdProdutosPorcentagemFornecedor2 / partida.getVariavelMicroeconomica().getConfiabilidadeProduto2();
            double valorDecrescimoFornecedor3 = qtdProdutosPorcentagemFornecedor3 / partida.getVariavelMicroeconomica().getConfiabilidadeProduto3();

            double qtdeProdutosFinaisFornecedor1 = qtdProdutosPorcentagemFornecedor1 - Math.ceil(valorDecrescimoFornecedor1);
            double qtdeProdutosFinaisFornecedor2 = qtdProdutosPorcentagemFornecedor2 - Math.ceil(valorDecrescimoFornecedor2);
            double qtdeProdutosFinaisFornecedor3 = qtdProdutosPorcentagemFornecedor3 - Math.ceil(valorDecrescimoFornecedor3);


            // Calcula a demanda final
            double demandaFinal = qtdeProdutosFinaisFornecedor1 + qtdeProdutosFinaisFornecedor2 + qtdeProdutosFinaisFornecedor3;
            jogada.setDemandaTotalJogada((int) Math.ceil(demandaFinal));

        }
    }
}
