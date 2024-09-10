package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;

import java.util.Comparator;

public class CalculoPropaganda {

    // Calcula a demanda da propaganda na partida
    private static void calculaDemanda(Partida partida, String identRodada){

        // Calcula a demanda total da propaganda que a nota pode pegar
        double demandaTotalPropaganda = partida.getIntencaoCompra() * (partida.getVariavelMicroeconomica().getPropaganda() / 100);

        /* Primeiro calcula a demanda da propaganda no rádio */
        // Somando as notas da propaganda de rádio de todas as jogadas
        double somaDasNotasPropRadio = partida.recuperaRodada(identRodada).getJogadas().stream().mapToDouble(Jogada::getNotaPropagandaRadio).sum();

        // Calcula a demanda total da propaganda de rádio que a nota pode pegar
        double demandaTotalPropRadio = demandaTotalPropaganda * (partida.getVariavelMicroeconomica().getPorcentagemPropagandaRadio() / 100);

        // Percorre a lista para calcular a demanda da propaganda de rádio de cada jogada
        for(Jogada jogada : partida.recuperaRodada(identRodada).getJogadas()){

            // Varialvel que armazena a porcentagem da demanda total da propaganda de rádio que a nota da jogada representa
            double porcentagemDemandaTotalPropRadio = jogada.getNotaPropagandaRadio() * 10;

            // Calcula a quantidade de demanda total da propaganda que a nota pode pegar
            double demandaTotalNotaPropRadio = (demandaTotalPropRadio * (porcentagemDemandaTotalPropRadio / 100));

            // Calcula a porcentagem que a nota da jogada representa em relação a soma das notas
            double porcentagemNotaPropRadio = (jogada.getNotaPropagandaRadio() / somaDasNotasPropRadio) * 100;

            // Calcula a quantidade de demanda que a nota da jogada pegou
            double demandaNotaPropRadio = (demandaTotalNotaPropRadio * (porcentagemNotaPropRadio / 100));

            // Atribui a demanda da jogada
            int demandaFinalNotaPropRadio = (int) Math.floor(demandaNotaPropRadio);

            // Atribui a demanda da jogada
            jogada.setDemandaPropagandaRadio(demandaFinalNotaPropRadio);
            jogada.setDemandaTotalPropaganda(demandaFinalNotaPropRadio + jogada.getDemandaTotalPropaganda());
        }
        /**/

        /* Segundo calcula a demanda da propaganda no jornal */
        // Somando as notas da propaganda de rádio de todas as jogadas
        double somaDasNotasPropJornal = partida.recuperaRodada(identRodada).getJogadas().stream().mapToDouble(Jogada::getNotaPropagandaJornal).sum();

        // Calcula a demanda total da propaganda de rádio que a nota pode pegar
        double demandaTotalPropJornal = demandaTotalPropaganda * (partida.getVariavelMicroeconomica().getPorcentagemPropagandaJornal() / 100);

        // Percorre a lista para calcular a demanda da propaganda de rádio de cada jogada
        for(Jogada jogada : partida.recuperaRodada(identRodada).getJogadas()){

            // Varialvel que armazena a porcentagem da demanda total da propaganda de rádio que a nota da jogada representa
            double porcentagemDemandaTotalPropJornal = jogada.getNotaPropagandaJornal() * 10;

            // Calcula a quantidade de demanda total da propaganda que a nota pode pegar
            double demandaTotalNotaPropJornal = (demandaTotalPropJornal * (porcentagemDemandaTotalPropJornal / 100));

            // Calcula a porcentagem que a nota da jogada representa em relação a soma das notas
            double porcentagemNotaPropRadio = (jogada.getNotaPropagandaJornal() / somaDasNotasPropJornal) * 100;

            // Calcula a quantidade de demanda que a nota da jogada pegou
            double demandaNotaPropJornal = (demandaTotalNotaPropJornal * (porcentagemNotaPropRadio / 100));

            // Atribui a demanda da jogada
            int demandaFinalNotaPropJornal = (int) Math.floor(demandaNotaPropJornal);

            // Atribui a demanda da jogada
            jogada.setDemandaPropagandaJornal(demandaFinalNotaPropJornal);
            jogada.setDemandaTotalPropaganda(demandaFinalNotaPropJornal + jogada.getDemandaTotalPropaganda());
        }
        /**/

        /* Terceiro calcula a demanda da propaganda na TV */
        // Somando as notas da propaganda da TV de todas as jogadas
        double somaDasNotasPropTV = partida.recuperaRodada(identRodada).getJogadas().stream().mapToDouble(Jogada::getNotaPropagandaTV).sum();

        // Calcula a demanda total da propaganda da TV que a nota pode pegar
        double demandaTotalPropTV = demandaTotalPropaganda * (partida.getVariavelMicroeconomica().getPorcentagemPropagandaTV() / 100);

        // Percorre a lista para calcular a demanda da propaganda da TV de cada jogada
        for(Jogada jogada : partida.recuperaRodada(identRodada).getJogadas()){

            // Varialvel que armazena a porcentagem da demanda total da propaganda da TV que a nota da jogada representa
            double porcentagemDemandaTotalPropTV = jogada.getNotaPropagandaTV() * 10;

            // Calcula a quantidade de demanda total da propaganda que a nota pode pegar
            double demandaTotalNotaPropTV = (demandaTotalPropTV * (porcentagemDemandaTotalPropTV / 100));

            // Calcula a porcentagem que a nota da jogada representa em relação a soma das notas
            double porcentagemNotaPropTV = (jogada.getNotaPropagandaTV() / somaDasNotasPropTV) * 100;

            // Calcula a quantidade de demanda que a nota da jogada pegou
            double demandaNotaPropTV = (demandaTotalNotaPropTV * (porcentagemNotaPropTV / 100));

            // Atribui a demanda da jogada
            int demandaFinalNotaPropTV = (int) Math.floor(demandaNotaPropTV);

            // Atribui a demanda da jogada
            jogada.setDemandaPropagandaTV(demandaFinalNotaPropTV);
            jogada.setDemandaTotalPropaganda(demandaFinalNotaPropTV + jogada.getDemandaTotalPropaganda());
        }
        /**/

        /* Quarto calcula a demanda da propaganda na internet */
        // Somando as notas da propaganda na internet de todas as jogadas
        double somaDasNotasPropInternet = partida.recuperaRodada(identRodada).getJogadas().stream().mapToDouble(Jogada::getNotaPropagandaInternet).sum();

        // Calcula a demanda total da propaganda na internet que a nota pode pegar
        double demandaTotalPropInternet = demandaTotalPropaganda * (partida.getVariavelMicroeconomica().getPorcentagemPropagandaInternet() / 100);

        // Percorre a lista para calcular a demanda da propaganda na internet de cada jogada
        for(Jogada jogada : partida.recuperaRodada(identRodada).getJogadas()){

            // Varialvel que armazena a porcentagem da demanda total da propaganda na internet que a nota da jogada representa
            double porcentagemDemandaTotalPropInternet = jogada.getNotaPropagandaInternet() * 10;

            // Calcula a quantidade de demanda total da propaganda que a nota pode pegar
            double demandaTotalNotaPropInternet = (demandaTotalPropInternet * (porcentagemDemandaTotalPropInternet / 100));

            // Calcula a porcentagem que a nota da jogada representa em relação a soma das notas
            double porcentagemNotaPropInternet = (jogada.getNotaPropagandaInternet() / somaDasNotasPropInternet) * 100;

            // Calcula a quantidade de demanda que a nota da jogada pegou
            double demandaNotaPropInternet = (demandaTotalNotaPropInternet * (porcentagemNotaPropInternet / 100));

            // Atribui a demanda da jogada
            int demandaFinalNotaPropInternet = (int) Math.floor(demandaNotaPropInternet);

            // Atribui a demanda da jogada
            jogada.setDemandaPropagandaInternet(demandaFinalNotaPropInternet);
            jogada.setDemandaTotalPropaganda(demandaFinalNotaPropInternet + jogada.getDemandaTotalPropaganda());
        }
        /**/
    }


    private static void calculaNota(Partida partida, Jogada jogada){

        // Calcula a nota da propaganda radio
        if(jogada.getInvestimentoPropagandaRadio() < partida.getVariavelMicroeconomica().getValorMinimoPropagandaRadio()){
            jogada.setNotaPropagandaRadio(0);
        } else {

            double dividendo = jogada.getInvestimentoPropagandaRadio() - partida.getVariavelMicroeconomica().getValorMinimoPropagandaRadio();
            double divisor = partida.getVariavelMicroeconomica().getProporcaoCrescimentoPropagandaRadio() * partida.getVariavelMicroeconomica().getValorMinimoPropagandaRadio();

            double nota = 1 + (dividendo / divisor);
            nota = Math.max(0, Math.min(10, nota));

            jogada.setNotaPropagandaRadio(nota);
        }

        // Calcula a nota da propaganda jornal
        if(jogada.getInvestimentoPropagandaJornal() < partida.getVariavelMicroeconomica().getValorMinimoPropagandaJornal()){
            jogada.setNotaPropagandaJornal(0);
        } else {

            double dividendo = jogada.getInvestimentoPropagandaJornal() - partida.getVariavelMicroeconomica().getValorMinimoPropagandaJornal();
            double divisor = partida.getVariavelMicroeconomica().getProporcaoCrescimentoPropagandaJornal() * partida.getVariavelMicroeconomica().getValorMinimoPropagandaJornal();

            double nota = 1 + (dividendo / divisor);
            nota = Math.max(0, Math.min(10, nota));

            jogada.setNotaPropagandaJornal(nota);
        }

        // Calcula a nota da propaganda tv
        if(jogada.getInvestimentoPropagandaTV() < partida.getVariavelMicroeconomica().getValorMinimoPropagandaTV()){
            jogada.setNotaPropagandaTV(0);
        } else {

            double dividendo = jogada.getInvestimentoPropagandaTV() - partida.getVariavelMicroeconomica().getValorMinimoPropagandaTV();
            double divisor = partida.getVariavelMicroeconomica().getProporcaoCrescimentoPropagandaTV() * partida.getVariavelMicroeconomica().getValorMinimoPropagandaTV();

            double nota = 1 + (dividendo / divisor);
            nota = Math.max(0, Math.min(10, nota));

            jogada.setNotaPropagandaTV(nota);
        }

        // Calcula a nota da propaganda internet
        if(jogada.getInvestimentoPropagandaInternet() < partida.getVariavelMicroeconomica().getValorMinimoPropagandaInternet()){
            jogada.setNotaPropagandaInternet(0);
        } else {

            double dividendo = jogada.getInvestimentoPropagandaInternet() - partida.getVariavelMicroeconomica().getValorMinimoPropagandaInternet();
            double divisor = partida.getVariavelMicroeconomica().getProporcaoCrescimentoPropagandaInternet() * partida.getVariavelMicroeconomica().getValorMinimoPropagandaInternet();

            double nota = 1 + (dividendo / divisor);
            nota = Math.max(0, Math.min(10, nota));

            jogada.setNotaPropagandaInternet(nota);
        }

    }

    public static void calculaDemandaPropaganda(Partida partida, String identificacaoRodada){

        // Calcula a nota de cada propaganda
        for(Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()){

            calculaNota(partida, jogada);
        }

        // Calcula a demanda gerada pela nota da propaganda
        calculaDemanda(partida, identificacaoRodada);

        // Soma a demanda da propaganda de cada jogada na demanda total da jogada
        partida.recuperaRodada(identificacaoRodada).getJogadas().forEach(jogada -> jogada.setDemandaTotalJogada(jogada.getDemandaTotalJogada() + jogada.getDemandaTotalPropaganda()));
    }
}
