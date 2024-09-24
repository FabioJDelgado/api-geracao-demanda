package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;

public class CalculoCapacidadeInstalada {

    private static void calculaDemandaCapacidadeInstalada(Partida partida, String identificacaoRodada){

        // Somando as notas do preço de todas as jogadas
        double somaDasNotas = partida.recuperaRodada(identificacaoRodada).getJogadas().stream().mapToDouble(Jogada::getNotaCapacidadeInstalada).sum();

        // Calcula a demanda total do preço
        double demandaTotalCI = partida.getFatiaMercado() * (partida.getVariavelMicroeconomica().getCapacidadeInstalada() / 100);

        // Percorre a lista para calcular a demanda do preço de cada jogada
        for(Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()){

            // Varialvel que armazena a porcentagem da demanda total do preço que a nota da jogada representa
            double porcentagemDemandaTotalCI = jogada.getNotaCapacidadeInstalada() * 10;

            // Calcula a quantidade de demanda total do preço que a nota pode pegar
            double demandaTotalCINota = (demandaTotalCI * (porcentagemDemandaTotalCI / 100));

            // Calcula a porcentagem que a nota da jogada representa em relação a soma das notas
            double porcentagemNota = (jogada.getNotaCapacidadeInstalada() / somaDasNotas) * 100;

            // Calcula a quantidade de demanda que a nota da jogada pegou
            double demandaNota = (demandaTotalCINota * (porcentagemNota / 100));

            // Atribui a demanda da jogada
            int demandaFinalNota = (int) Math.floor(demandaNota);
            jogada.setDemandaCapacidadeInstalada(demandaFinalNota);
        }
    }

    private static double calcularNota(double pontosCapacidadeInstalada, double somaPontosCapacidadeInstalada, double menorPontosCapacidadeInstalada, double maiorPontosCapacidadeInstalada) {
        double diferencaMaiorMenor = (maiorPontosCapacidadeInstalada - menorPontosCapacidadeInstalada) == 0 ? 1 : maiorPontosCapacidadeInstalada - menorPontosCapacidadeInstalada;

        double nota = ((pontosCapacidadeInstalada / somaPontosCapacidadeInstalada) * 10) - (((pontosCapacidadeInstalada - maiorPontosCapacidadeInstalada) / diferencaMaiorMenor) * -1);

        if (nota < 0) {
            nota = 0;
        }

        return nota;
    }

    private static double calculaPontos(double tamanhoEstabelecimento, double pesoTamanhoEstabelecimento, int qtdFuncionarios, int qtdCaixas, Partida partida) {
        return ((tamanhoEstabelecimento * pesoTamanhoEstabelecimento) +
                (qtdFuncionarios * partida.getVariavelMicroeconomica().getPesoFuncionarios()) +
                (qtdCaixas * partida.getVariavelMicroeconomica().getPesoCaixas())) /
                pesoTamanhoEstabelecimento + partida.getVariavelMicroeconomica().getPesoFuncionarios() + partida.getVariavelMicroeconomica().getPesoCaixas();
    }

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

            int qtdMaxCaixas = 0;
            double tamanhoEstabelecimento = 0;
            double pesoTamanhoEstabelecimento = 0;
            if(jogada.getTamanhoEstabelecimento().getTamanhoEstabelecimento().equals("PEQUENO")){
                qtdMaxCaixas = partida.getVariavelMicroeconomica().getQtdMaxCaixasEstabelecimentoPequeno();
                tamanhoEstabelecimento = partida.getVariavelMicroeconomica().getTamanhoEstabelecimentoPequeno();
                pesoTamanhoEstabelecimento = partida.getVariavelMicroeconomica().getPesoTamanhoEstabelecimentoPequeno();
            } else if(jogada.getTamanhoEstabelecimento().getTamanhoEstabelecimento().equals("MEDIO")){
                qtdMaxCaixas = partida.getVariavelMicroeconomica().getQtdMaxCaixasEstabelecimentoMedio();
                tamanhoEstabelecimento = partida.getVariavelMicroeconomica().getTamanhoEstabelecimentoMedio();
                pesoTamanhoEstabelecimento = partida.getVariavelMicroeconomica().getPesoTamanhoEstabelecimentoMedio();
            } else if(jogada.getTamanhoEstabelecimento().getTamanhoEstabelecimento().equals("GRANDE")){
                qtdMaxCaixas = partida.getVariavelMicroeconomica().getQtdMaxCaixasEstabelecimentoGrande();
                tamanhoEstabelecimento = partida.getVariavelMicroeconomica().getTamanhoEstabelecimentoGrande();
                pesoTamanhoEstabelecimento = partida.getVariavelMicroeconomica().getPesoTamanhoEstabelecimentoGrande();
            }

            if(qtdFuncionariosCaixa > qtdMaxCaixas){
                qtdFuncionariosCaixa = qtdMaxCaixas;
                qtdCaixasFinais = qtdMaxCaixas;
            }

            qtdFuncionariosEstoque = qtdFuncionariosCaixa;

            qtdFuncionariosFinais += qtdFuncionariosCaixa + qtdFuncionariosEstoque;

            double pontosCapacidadeInstalada = calculaPontos(tamanhoEstabelecimento, pesoTamanhoEstabelecimento, qtdFuncionariosFinais, qtdCaixasFinais, partida);
            jogada.setPontosCapacidadeInstalada(pontosCapacidadeInstalada);
        }

        double somaPontosCapacidadeInstalada = 0;
        double maiorPontosCapacidadeInstalada = 0;
        double menorPontosCapacidadeInstalada = 0;

        for (Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()){

            somaPontosCapacidadeInstalada += jogada.getPontosCapacidadeInstalada();

            if(menorPontosCapacidadeInstalada == 0){
                menorPontosCapacidadeInstalada = jogada.getPontosCapacidadeInstalada();
            } else if(menorPontosCapacidadeInstalada > jogada.getPontosCapacidadeInstalada()){
                menorPontosCapacidadeInstalada = jogada.getPontosCapacidadeInstalada();
            }

            if(maiorPontosCapacidadeInstalada == 0){
                maiorPontosCapacidadeInstalada = jogada.getPontosCapacidadeInstalada();
            } else if(maiorPontosCapacidadeInstalada < jogada.getPontosCapacidadeInstalada()){
                maiorPontosCapacidadeInstalada = jogada.getPontosCapacidadeInstalada();
            }
        }

        for (Jogada jogada : partida.recuperaRodada(identificacaoRodada).getJogadas()){

            double notaCapacidadeInstalada = calcularNota(jogada.getPontosCapacidadeInstalada(), somaPontosCapacidadeInstalada, menorPontosCapacidadeInstalada, maiorPontosCapacidadeInstalada);

            jogada.setNotaCapacidadeInstalada(notaCapacidadeInstalada);
        }

        // Calcula a demanda gerada pela nota de cada jogada
        calculaDemandaCapacidadeInstalada(partida, identificacaoRodada);

        // Soma a demanda capacidade instalada de cada jogada na demanda total da jogada
        partida.recuperaRodada(identificacaoRodada).getJogadas().forEach(jogada -> jogada.setDemandaTotalJogada(jogada.getDemandaTotalJogada() + jogada.getDemandaCapacidadeInstalada()));
    }
}
