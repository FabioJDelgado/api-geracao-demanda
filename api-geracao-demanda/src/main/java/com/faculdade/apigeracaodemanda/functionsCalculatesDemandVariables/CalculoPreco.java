package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CalculoPreco {

    // Calcula a demanda gerada pela nota
    private static void calculaDemandaPreco(Partida partida, String identificacaoRodada){

        // Somando as notas do preço de todas as jogadas
        double somaDasNotas = partida.recuperaRodada(identificacaoRodada).getJogadas().stream().mapToDouble(Jogada::getNotaPreco).sum();

        // Calcula a demanda total do preço
        double demandaTotalPreco = partida.getFatiaMercado() * (partida.getVariavelMicroeconomica().getPreco() / 100);

        // Percorre a lista para calcular a demanda do preço de cada jogada
        for(Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()){

            // Varialvel que armazena a porcentagem da demanda total do preço que a nota da jogada representa
            double porcentagemDemandaTotalPreco = jogada.getNotaPreco() * 10;

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

    private static double calcularNota(double preco, List<Double> listaPrecos, double fatorPenalidade) {
        double somaPrecos = listaPrecos.stream().mapToDouble(Double::doubleValue).sum();
        double menorPreco = listaPrecos.stream().mapToDouble(Double::doubleValue).min().orElse(0);
        double maiorPreco = listaPrecos.stream().mapToDouble(Double::doubleValue).max().orElse(0);

        double diferencaMaiorMenor = (maiorPreco - menorPreco) == 0 ? 1 : maiorPreco - menorPreco;

        double nota = (10 - ((preco / somaPrecos) * 10)) - (((preco - menorPreco) / diferencaMaiorMenor) * fatorPenalidade);

        return nota;
    }

    public static void calculaNotasPrecoDemandas(Partida partida, String identificacaoRodada){

        // Lista de preços
        List<Double> listaPrecos = new ArrayList<>();
        for (Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()) {
            listaPrecos.add(jogada.getPreco());
        }

        // Calculando e atribuindo as notas a cada jogada
        for (Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()) {
            double nota = calcularNota(jogada.getPreco(), listaPrecos, partida.getVariavelMicroeconomica().getFatorPenalidadePreco());
            jogada.setNotaPreco(nota);
        }

        // Calcula a demanda gerada pela nota de cada jogada
        calculaDemandaPreco(partida, identificacaoRodada);

        // Soma a demanda preco de cada jogada na demanda total da jogada
        partida.recuperaRodada(identificacaoRodada).getJogadas().forEach(jogada -> jogada.setDemandaTotalJogada(jogada.getDemandaTotalJogada() + jogada.getDemandaPreco()));
    }
}
