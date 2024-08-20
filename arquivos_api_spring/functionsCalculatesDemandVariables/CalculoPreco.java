package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;

import java.util.Comparator;

public class CalculoPreco {

    // Calcula a demanda gerada pela nota
    private static void calculaDemandaPreco(Partida partida, String identificacaoRodada){

        // Somando as notas do preço de todas as jogadas
        double somaDasNotas = partida.recuperaRodada(identificacaoRodada).getJogadas().stream().mapToDouble(Jogada::getNotaPreco).sum();

        // Calcula a demanda total do preço que a nota pode pegar
        double demandaTotalPreco = partida.getIntencaoCompra() * (partida.getVariavelMicroeconomica().getPreco() / 100);

        // Percorre a lista para calcular a demanda do preço de cada jogada
        for(Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()){

            // Varialvel que armazena a porcentagem da demanda total do preço que a nota da jogada representa
            double porcentagemDemandaTotalPreco = jogada.getNotaPreco() * 10;

            /*// Porcentagem da demanda total do preço que a nota da jogada representa
            if(jogada.getNotaPreco() == 10){
                porcentagemDemandaTotalPreco = 100;
            } else if(jogada.getNotaPreco() < 10 && jogada.getNotaPreco() >= 8){
                porcentagemDemandaTotalPreco = 80;
            } else if(jogada.getNotaPreco() < 8 && jogada.getNotaPreco() >= 6){
                porcentagemDemandaTotalPreco = 60;
            } else if(jogada.getNotaPreco() < 6 && jogada.getNotaPreco() >= 4){
                porcentagemDemandaTotalPreco = 40;
            } else if(jogada.getNotaPreco() < 4 && jogada.getNotaPreco() >= 2){
                porcentagemDemandaTotalPreco = 20;
            } else if(jogada.getNotaPreco() < 2 && jogada.getNotaPreco() >= 1){
                porcentagemDemandaTotalPreco = 10;
            } else{
                porcentagemDemandaTotalPreco = 0;
            }*/

            // Calcula a quantidade de demanda total do preço que a nota pode pegar
            double demandaTotalPrecoNota = (demandaTotalPreco * (porcentagemDemandaTotalPreco / 100));

            // Calcula a porcentagem que a nota da jogada representa em relação a soma das notas
            double porcentagemNota = (jogada.getNotaPreco() / somaDasNotas) * 100;

            // Calcula a quantidade de demanda que a nota da jogada pegou
            double demandaNota = (demandaTotalPrecoNota * (porcentagemNota / 100));

            // Atribui a demanda da jogada
            int demandaFinalNota = (int) Math.floor(demandaNota);
            jogada.setDemandaPreco(demandaFinalNota);
        }
    }

    // Calcula a nota inicial do menor preço em função da diferença de preço com o segundo menor preço (PENSAR EM MELHORAR)
    private static double calculaNotaPrecoInicial(double menorPreco, double maiorPreco){

        // Calcula a diferença entre o maior e o menor preço
        double diferencaPreco = maiorPreco - menorPreco;

        // Calcula a porcentagem de desconto da nota d menor preço para o maior preço
        double porcentagemDesconto = (diferencaPreco / menorPreco) * 100;

        // Inicialmente a nota do menor preço é 5
        double nota = 5;

        // Calcula a nota da jogada
        if(porcentagemDesconto > 40){
            nota = 10;
        } else if(porcentagemDesconto > 30){
            nota = 9;
        } else if(porcentagemDesconto > 20){
            nota = 8;
        } else if(porcentagemDesconto > 12.5){
            nota = 7;
        } else if(porcentagemDesconto > 5){
            nota = 6;
        }

        return nota;
    }

    // Calcula a nota de cada jogada em função do preço
    public static void calculaNotasPrecoDemandas(Partida partida, String identificacaoRodada){

        // Ordenar a lista de jogadas com base na variável "preco"
        partida.recuperaRodada(identificacaoRodada).getJogadas().sort(Comparator.comparing(Jogada::getPreco));

        // Calcular a nota da melhor jogada
        double notaIncial = calculaNotaPrecoInicial(partida.recuperaRodada(identificacaoRodada).getJogadas().get(0).getPreco(), partida.recuperaRodada(identificacaoRodada).getJogadas().get(1).getPreco());

        // A jogada com menor preço recebe a nota inicial
        partida.recuperaRodada(identificacaoRodada).getJogadas().get(0).setNotaPreco(notaIncial);

        // Canculando a nota de cada jogada
        for(int i = 0; i < (partida.recuperaRodada(identificacaoRodada).getJogadas().size() - 1); i++){
            // Recupera o menor e o maior preço
            double menorPreco = partida.recuperaRodada(identificacaoRodada).getJogadas().get(i).getPreco();
            double maiorPreco = partida.recuperaRodada(identificacaoRodada).getJogadas().get(i+1).getPreco();

            // Calcula a diferença entre o maior e o menor preço
            double diferencaPreco = maiorPreco - menorPreco;

            // Calcula a porcentagem de desconto da nota d menor preço para o maior preço
            double porcentagemDesconto = (diferencaPreco / menorPreco) * partida.recuperaRodada(identificacaoRodada).getJogadas().get(i).getNotaPreco();

            // Calcula a nota da jogada
            double nota = partida.recuperaRodada(identificacaoRodada).getJogadas().get(i).getNotaPreco() - porcentagemDesconto;

            // Atribui a nota da jogada
            partida.recuperaRodada(identificacaoRodada).getJogadas().get(i+1).setNotaPreco((nota < 0 ? 1 : nota));
        }

        // Calcula a demanda gerada pela nota de cada jogada
        calculaDemandaPreco(partida, identificacaoRodada);

        // Soma a demanda preco de cada jogada na demanda total da jogada
        partida.recuperaRodada(identificacaoRodada).getJogadas().forEach(jogada -> jogada.setDemandaTotalJogada(jogada.getDemandaTotalJogada() + jogada.getDemandaPreco()));
    }
}
