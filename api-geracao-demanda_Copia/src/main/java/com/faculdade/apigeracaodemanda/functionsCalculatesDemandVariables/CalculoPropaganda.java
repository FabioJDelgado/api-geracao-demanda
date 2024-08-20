package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;

import java.util.Comparator;

public class CalculoPropaganda {

    // Calcula a demanda da propaganda na partida
    private static void calculaDemandaPropaganda(Partida partida, String identRodada){

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

            /*// Porcentagem da demanda total da propaganda de rádio que a nota da jogada representa
            if(jogada.getNotaPropagandaRadio() == 10){
                porcentagemDemandaTotalPropRadio = 100;
            } else if(jogada.getNotaPropagandaRadio() < 10 && jogada.getNotaPropagandaRadio() >= 8){
                porcentagemDemandaTotalPropRadio = 80;
            } else if(jogada.getNotaPropagandaRadio() < 8 && jogada.getNotaPropagandaRadio() >= 6){
                porcentagemDemandaTotalPropRadio = 60;
            } else if(jogada.getNotaPropagandaRadio() < 6 && jogada.getNotaPropagandaRadio() >= 4){
                porcentagemDemandaTotalPropRadio = 40;
            } else if(jogada.getNotaPropagandaRadio() < 4 && jogada.getNotaPropagandaRadio() >= 2){
                porcentagemDemandaTotalPropRadio = 20;
            } else if(jogada.getNotaPropagandaRadio() < 2 && jogada.getNotaPropagandaRadio() >= 1){
                porcentagemDemandaTotalPropRadio = 10;
            } else{
                porcentagemDemandaTotalPropRadio = 0;
            }*/

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

            /*// Porcentagem da demanda total da propaganda de rádio que a nota da jogada representa
            if(jogada.getNotaPropagandaJornal() == 10){
                porcentagemDemandaTotalPropJornal = 100;
            } else if(jogada.getNotaPropagandaJornal() < 10 && jogada.getNotaPropagandaJornal() >= 8){
                porcentagemDemandaTotalPropJornal = 80;
            } else if(jogada.getNotaPropagandaJornal() < 8 && jogada.getNotaPropagandaJornal() >= 6){
                porcentagemDemandaTotalPropJornal = 60;
            } else if(jogada.getNotaPropagandaJornal() < 6 && jogada.getNotaPropagandaJornal() >= 4){
                porcentagemDemandaTotalPropJornal = 40;
            } else if(jogada.getNotaPropagandaJornal() < 4 && jogada.getNotaPropagandaJornal() >= 2){
                porcentagemDemandaTotalPropJornal = 20;
            } else if(jogada.getNotaPropagandaJornal() < 2 && jogada.getNotaPropagandaJornal() >= 1){
                porcentagemDemandaTotalPropJornal = 10;
            } else{
                porcentagemDemandaTotalPropJornal = 0;
            }*/

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

            /*// Porcentagem da demanda total da propaganda da TV que a nota da jogada representa
            if(jogada.getNotaPropagandaTV() == 10){
                porcentagemDemandaTotalPropTV = 100;
            } else if(jogada.getNotaPropagandaTV() < 10 && jogada.getNotaPropagandaTV() >= 8){
                porcentagemDemandaTotalPropTV = 80;
            } else if(jogada.getNotaPropagandaTV() < 8 && jogada.getNotaPropagandaTV() >= 6){
                porcentagemDemandaTotalPropTV = 60;
            } else if(jogada.getNotaPropagandaTV() < 6 && jogada.getNotaPropagandaTV() >= 4){
                porcentagemDemandaTotalPropTV = 40;
            } else if(jogada.getNotaPropagandaTV() < 4 && jogada.getNotaPropagandaTV() >= 2){
                porcentagemDemandaTotalPropTV = 20;
            } else if(jogada.getNotaPropagandaTV() < 2 && jogada.getNotaPropagandaTV() >= 1){
                porcentagemDemandaTotalPropTV = 10;
            } else{
                porcentagemDemandaTotalPropTV = 0;
            }*/

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

            /*// Porcentagem da demanda total da propaganda na internet que a nota da jogada representa
            if(jogada.getNotaPropagandaInternet() == 10){
                porcentagemDemandaTotalPropInternet = 100;
            } else if(jogada.getNotaPropagandaInternet() < 10 && jogada.getNotaPropagandaInternet() >= 8){
                porcentagemDemandaTotalPropInternet = 80;
            } else if(jogada.getNotaPropagandaInternet() < 8 && jogada.getNotaPropagandaInternet() >= 6){
                porcentagemDemandaTotalPropInternet = 60;
            } else if(jogada.getNotaPropagandaInternet() < 6 && jogada.getNotaPropagandaInternet() >= 4){
                porcentagemDemandaTotalPropInternet = 40;
            } else if(jogada.getNotaPropagandaInternet() < 4 && jogada.getNotaPropagandaInternet() >= 2){
                porcentagemDemandaTotalPropInternet = 20;
            } else if(jogada.getNotaPropagandaInternet() < 2 && jogada.getNotaPropagandaInternet() >= 1){
                porcentagemDemandaTotalPropInternet = 10;
            } else{
                porcentagemDemandaTotalPropInternet = 0;
            }*/

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

    // Calcula a nota inicial do maior investimento de propaganda em função da diferença de preço com o segundo maior preço (PENSAR EM MELHORAR)
    private static double calculaNotaPropagandaInicial(double maiorInvestimento, double menorInvestimento){

        // Inicialmente a nota da jogada é 0
        double nota = 0;

        // Se nenhum dos valores de investimento em propaganda for igual a 0, então calcula a nota inicial
        if(maiorInvestimento != 0){

            // Inicialmente a nota da jogada é 5
            nota = 5;

            // Calcula a diferença entre o maior e o menor preço
            double diferencaInvestimento = maiorInvestimento - menorInvestimento;

            // Calcula a porcentagem de desconto da nota d menor preço para o maior preço
            double porcentagemDesconto = (diferencaInvestimento / maiorInvestimento) * 100;

            // Calcula a nota da jogada
            if(porcentagemDesconto > 40){
                nota = 10;
            } else if(porcentagemDesconto >= 30){
                nota = 9;
            } else if(porcentagemDesconto >= 20){
                nota = 8;
            } else if(porcentagemDesconto >= 15){
                nota = 7;
            } else if(porcentagemDesconto >= 10){
                nota = 6;
            }
        }

        return nota;
    }

    // Calcula a nota de cada jogada em função do valor investido na propaganda de maior investimento
    private static double calculaNotaPropaganda(double maiorInvestimento, double menorInvestimento, double notaMaiorInvestimento){

        // Inicialmente a nota da jogada é 0
        double nota = 0;

        // Se ambos os valores de investimento forem iguais a 0, então a nota da jogada é 0
        if(maiorInvestimento != 0){
            // Calcula a diferença entre o maior e o menor preço
            double diferencaInvestimento = maiorInvestimento - menorInvestimento;

            // Calcula a porcentagem de desconto da nota d menor preço para o maior preço
            double porcentagemDesconto = (diferencaInvestimento / maiorInvestimento) * notaMaiorInvestimento;

            // Calcula a nota da jogada
            nota = notaMaiorInvestimento - porcentagemDesconto;
        }

        return nota;
    }

    // Calcula a nota de cada jogada em função da propaganda
    public static void calculaNotasPropagandaDemandas(Partida partida, String identRodada){

        /* Primeiro calcular a nota para a propaganda no rádio */
        // Ordenar a lista de jogadas com base na variável "propagandaRadio"
        partida.recuperaRodada(identRodada).getJogadas().sort(Comparator.comparing(jogada -> ((Jogada) jogada).getInvestimentoPropagandaRadio()).reversed());

        // Calcular a nota da melhor jogada
        double notaIncialPropagandaRadio = calculaNotaPropagandaInicial(partida.recuperaRodada(identRodada).getJogadas().get(0).getInvestimentoPropagandaRadio(), partida.recuperaRodada(identRodada).getJogadas().get(1).getInvestimentoPropagandaRadio());

        // A jogada com maior investimento em propaganda no rádio recebe a nota inicial
        partida.recuperaRodada(identRodada).getJogadas().get(0).setNotaPropagandaRadio(notaIncialPropagandaRadio);

        // Canculando a nota de cada jogada
        for(int i = 0; i < (partida.recuperaRodada(identRodada).getJogadas().size() - 1); i++){
            // Recupera o menor e o maior investimento em propaganda no rádio, e a nota do maior investimento
            double maiorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i).getInvestimentoPropagandaRadio();
            double menorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i+1).getInvestimentoPropagandaRadio();
            double notaMaiorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i).getNotaPropagandaRadio();

            // Calcula a nota da jogada
            double nota = calculaNotaPropaganda(maiorInvestimento, menorInvestimento, notaMaiorInvestimento);

            //Atribui a nota da jogada
            partida.recuperaRodada(identRodada).getJogadas().get(i+1).setNotaPropagandaRadio((nota < 0 ? 0 : nota));
        }
        /**/

        /* Segundo calcular a nota para a propaganda no jornal */
        // Ordenar a lista de jogadas com base na variável "propagandaJornal"
        partida.recuperaRodada(identRodada).getJogadas().sort(Comparator.comparing(jogada -> ((Jogada) jogada).getInvestimentoPropagandaJornal()).reversed());

        // Calcular a nota da melhor jogada
        double notaIncialPropagandaJornal = calculaNotaPropagandaInicial(partida.recuperaRodada(identRodada).getJogadas().get(0).getInvestimentoPropagandaJornal(), partida.recuperaRodada(identRodada).getJogadas().get(1).getInvestimentoPropagandaJornal());

        // A jogada com maior investimento em propaganda no rádio recebe a nota inicial
        partida.recuperaRodada(identRodada).getJogadas().get(0).setNotaPropagandaJornal(notaIncialPropagandaJornal);

        // Canculando a nota de cada jogada
        for(int i = 0; i < (partida.recuperaRodada(identRodada).getJogadas().size() - 1); i++){
            // Recupera o menor e o maior investimento em propaganda no rádio, e a nota do maior investimento
            double maiorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i).getInvestimentoPropagandaJornal();
            double menorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i+1).getInvestimentoPropagandaJornal();
            double notaMaiorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i).getNotaPropagandaJornal();

            // Calcula a nota da jogada
            double nota = calculaNotaPropaganda(maiorInvestimento, menorInvestimento, notaMaiorInvestimento);

            //Atribui a nota da jogada
            partida.recuperaRodada(identRodada).getJogadas().get(i+1).setNotaPropagandaJornal((nota < 0 ? 0 : nota));
        }
        /**/

        /* Terceiro calcular a nota para a propaganda na TV */
        // Ordenar a lista de jogadas com base na variável "propagandaTV"
        partida.recuperaRodada(identRodada).getJogadas().sort(Comparator.comparing(jogada -> ((Jogada) jogada).getInvestimentoPropagandaTV()).reversed());

        // Calcular a nota da melhor jogada
        double notaIncialPropagandaTV = calculaNotaPropagandaInicial(partida.recuperaRodada(identRodada).getJogadas().get(0).getInvestimentoPropagandaInternet(), partida.recuperaRodada(identRodada).getJogadas().get(1).getInvestimentoPropagandaTV());

        // A jogada com maior investimento em propaganda na TV recebe a nota inicial
        partida.recuperaRodada(identRodada).getJogadas().get(0).setNotaPropagandaTV(notaIncialPropagandaTV);

        // Canculando a nota de cada jogada
        for(int i = 0; i < (partida.recuperaRodada(identRodada).getJogadas().size() - 1); i++){
            // Recupera o menor e o maior investimento em propaganda na TV, e a nota do maior investimento
            double maiorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i).getInvestimentoPropagandaTV();
            double menorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i+1).getInvestimentoPropagandaTV();
            double notaMaiorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i).getNotaPropagandaTV();

            // Calcula a nota da jogada
            double nota = calculaNotaPropaganda(maiorInvestimento, menorInvestimento, notaMaiorInvestimento);

            //Atribui a nota da jogada
            partida.recuperaRodada(identRodada).getJogadas().get(i+1).setNotaPropagandaTV((nota < 0 ? 0 : nota));
        }
        /**/

        /* Quarto calcular a nota para a propaganda na internet */
        // Ordenar a lista de jogadas com base na variável "propagandaInternet"
        partida.recuperaRodada(identRodada).getJogadas().sort(Comparator.comparing(jogada -> ((Jogada) jogada).getInvestimentoPropagandaInternet()).reversed());

        // Calcular a nota da melhor jogada
        double notaIncialPropagandaInternet = calculaNotaPropagandaInicial(partida.recuperaRodada(identRodada).getJogadas().get(0).getInvestimentoPropagandaInternet(), partida.recuperaRodada(identRodada).getJogadas().get(1).getInvestimentoPropagandaInternet());

        // A jogada com maior investimento em propaganda na internet recebe a nota inicial
        partida.recuperaRodada(identRodada).getJogadas().get(0).setNotaPropagandaInternet(notaIncialPropagandaInternet);

        // Canculando a nota de cada jogada
        for(int i = 0; i < (partida.recuperaRodada(identRodada).getJogadas().size() - 1); i++){
            // Recupera o menor e o maior investimento em propaganda na TV, e a nota do maior investimento
            double maiorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i).getInvestimentoPropagandaInternet();
            double menorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i+1).getInvestimentoPropagandaInternet();
            double notaMaiorInvestimento = partida.recuperaRodada(identRodada).getJogadas().get(i).getNotaPropagandaInternet();

            // Calcula a nota da jogada
            double nota = calculaNotaPropaganda(maiorInvestimento, menorInvestimento, notaMaiorInvestimento);

            // Atribui a nota da jogada
            partida.recuperaRodada(identRodada).getJogadas().get(i+1).setNotaPropagandaInternet((nota < 0 ? 0 : nota));
        }
        /**/

        // Calcula a demanda gerada pela nota de cada jogada
        calculaDemandaPropaganda(partida, identRodada);

        // Soma a demanda da propaganda de cada jogada na demanda total da jogada
        partida.recuperaRodada(identRodada).getJogadas().forEach(jogada -> jogada.setDemandaTotalJogada(jogada.getDemandaTotalJogada() + jogada.getDemandaTotalPropaganda()));
    }
}
