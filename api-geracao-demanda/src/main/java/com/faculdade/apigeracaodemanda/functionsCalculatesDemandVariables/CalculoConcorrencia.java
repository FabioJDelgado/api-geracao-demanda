package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;
import com.faculdade.apigeracaodemanda.models.Rodada;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculoConcorrencia {

    public static void calculaConcorrencia(Partida partida, String identificacaoRodada) {

        // Mapa para armazenar a soma das demandas de cada jogada em todas as rodadas
        Map<String, Integer> valores = new HashMap<>();


        // Percorre todas as rodadas da partida para somar as demandas de cada jogada em todas as rodadas
        for(Rodada rodada : partida.getRodadas()) {
            for(Jogada jogada : rodada.getJogadas()) {
                if(!valores.containsKey(jogada.getIdentificacaoJogada())) {
                    // Se a jogada ainda não foi adicionada ao mapa, adiciona com a demanda total da jogada
                    valores.put(jogada.getIdentificacaoJogada(), jogada.getDemandaTotalJogada());
                } else {
                    // Se a jogada já foi adicionada ao mapa, soma a demanda total da jogada com a demanda total já existente
                    valores.put(jogada.getIdentificacaoJogada(), valores.get(jogada.getIdentificacaoJogada()) + jogada.getDemandaTotalJogada());
                }
            }
        }


        // Lista com as três maiores demandas de jogadas em todas as rodadas
        List<String> top3Maiores = valores.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Ordenar por valor em ordem decrescente
                .limit(3) // Pegar os três primeiros
                .map(Map.Entry::getKey) // Extrair as chaves
                .collect(Collectors.toList()); // Coletar em uma lista


        // Multiplicadores de aumento de demanda para as três maiores jogadas de todas as rodadas
        double[] multiplicadoresAumento = {1.07, 1.05, 1.03};
        final int[] contador = {0};
        top3Maiores.forEach(chave -> {
            for (Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()) {
                if(jogada.getIdentificacaoJogada().equals(chave)) {
                    double demandaTotalJogadaAjustada = jogada.getDemandaTotalJogada() * multiplicadoresAumento[contador[0]];
                    if(demandaTotalJogadaAjustada > partida.getFatiaMercado()) {
                        jogada.setDemandaTotalJogada((int) partida.getFatiaMercado());
                    } else{
                        jogada.setDemandaTotalJogada((int) Math.ceil(demandaTotalJogadaAjustada));
                    }
                    contador[0]++;
                }
            }
        });
    }
}
