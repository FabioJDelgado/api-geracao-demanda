package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;

public class CalculoCapacidadeInstalada {

    // Calcula a demanda gerada pela nota da capacidade instalada
    private static void calculaDemandaCapacidadeInstalada(Partida partida, String identificacaoRodada){

        // Somando as notas da capacidade instalada de todas as jogadas
        double somaDasNotas = partida.recuperaRodada(identificacaoRodada).getJogadas().stream().mapToDouble(Jogada::getNotaCapacidadeInstalada).sum();

        // Calcula a demanda total da capacidade instalada tem direito
        double demandaTotalCapacidadeInstalada = partida.getIntencaoCompra() * (partida.getVariavelMicroeconomica().getCapacidadeInstalada() / 100);

        // Percorre a lista para calcular a demanda da capacidade instalada de cada jogada
        for(Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()){

            // Varialvel que armazena a porcentagem da demanda total da capacidade instalada que a nota da jogada representa
            double porcentagemDemandaTotalCapacidadeInstalada = jogada.getNotaCapacidadeInstalada() * 10;

            /*// Porcentagem da demanda total da capacidade instalada que a nota da jogada representa
            if(jogada.getNotaCapacidadeInstalada() == 5){
                porcentagemDemandaTotalCapacidadeInstalada = 50;
            } else if(jogada.getNotaCapacidadeInstalada() == 8){
                porcentagemDemandaTotalCapacidadeInstalada = 80;
            } else{
                porcentagemDemandaTotalCapacidadeInstalada = 100;
            }*/

            // Calcula a quantidade de demanda total da capacidade instalada que a nota pode pegar
            double demandaTotalNotaCapacidadeInstalada = (demandaTotalCapacidadeInstalada * (porcentagemDemandaTotalCapacidadeInstalada / 100));

            // Calcula a porcentagem que a nota da jogada representa em relação a soma das notas
            double porcentagemNota = (jogada.getNotaCapacidadeInstalada() / somaDasNotas) * 100;

            // Calcula a quantidade de demanda que a nota da jogada pegou
            double demandaNota = (demandaTotalNotaCapacidadeInstalada * (porcentagemNota / 100));

            // Atribui a demanda da jogada
            int demandaFinalNota = (int) Math.floor(demandaNota);
            jogada.setDemandaCapacidadeInstalada(demandaFinalNota);
        }
    }

    // Calcula nota da capacidade instalada da jogada
    public static void calculaNotasCapacidadeInstaladaDemandas(Partida partida, String identificacaoRodada){

        // Calcula a nota da jogada
        for(Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()){
            if(jogada.getCapacidadeInstalada().getCapacidadeInstalada().equals("CAPACIDADEINSTALADA1")){
                jogada.setNotaCapacidadeInstalada(3);
            } else if(jogada.getCapacidadeInstalada().getCapacidadeInstalada().equals("CAPACIDADEINSTALADA2")){
                jogada.setNotaCapacidadeInstalada(6.5);
            } else if(jogada.getCapacidadeInstalada().getCapacidadeInstalada().equals("CAPACIDADEINSTALADA3")) {
                jogada.setNotaCapacidadeInstalada(10);
            }
        }

        // Calcula a demanda gerada pela nota de cada jogada
        calculaDemandaCapacidadeInstalada(partida, identificacaoRodada);

        // Soma a demanda da capacidade instalada de cada jogada na demanda total da jogada
        partida.recuperaRodada(identificacaoRodada).getJogadas().forEach(jogada -> jogada.setDemandaTotalJogada(jogada.getDemandaTotalJogada() + jogada.getDemandaCapacidadeInstalada()));

    }
}
