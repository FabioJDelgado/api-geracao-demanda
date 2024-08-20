package com.faculdade.apigeracaodemanda.functionsCalculatesDemandVariables;

import com.faculdade.apigeracaodemanda.models.Partida;

public class CalculoConcorrencia {

    public static void calculaConcorrencia(Partida partida, String identificacaoRodada) {



        /*// Ler o arquivo JSON referente a partida
        JsonNode jsonNode = Util.lerArquvioPartida(partida.getIdentificacaoPartidaAPI());

        // Verifica se não é a primeira rodada
        if(jsonNode != null){

            // Percorre o JSON para recuperar a demanda total das rodadas anteriores
            List<JsonNode> jogadas = new ArrayList<>();
            for(int i = 0; i < jsonNode.get("jogadas").size(); i++){
                // Adiciona a demanda total da rodada anterior
                JsonNode jogada = jsonNode.get("jogadas").get(i);
                jogadas.add(jogada);
            }

            // Ordena as demandas das rodadas anteriores em forma decrescente
            jogadas.sort((j1, j2) -> j2.get("demandaTotalPartida").asInt() - j1.get("demandaTotalPartida").asInt());

            // Calcula quanto de demanda está sobrando da intenção de compra da partida
            int demandaTotalJogadas = partida.getJogadas().stream().mapToInt(Jogada::getDemandaTotalJogada).sum();
            int sobraIntencaoCompra = (int) (partida.getIntencaoCompra() - demandaTotalJogadas);

            // O três melhores colocados em toda a partida terão um acréscimo na demanda da rodada
            if(sobraIntencaoCompra > 0){
                for(int i = 0; i < 3; i++){
                    System.out.println();
                    if(i == 0){

                        // A melhor jogada em decorrer das partidas terá 12% do que sobrou da intenção de compra
                        double valorAcrescimo = sobraIntencaoCompra * 0.12;

                        // Converte a demanda acrescida em inteiro
                        int demandaAcrescida = (int) Math.floor(valorAcrescimo);

                        // Atribui a demanda acrescida a jogada
                        for(Jogada jogada : partida.getJogadas()){
                            if(jogada.getIdentificacaoJogadaAPI().equals(jogadas.get(0).get("identificacaoJogadaAPI").asText())){
                                jogada.setDemandaTotalJogada(jogada.getDemandaTotalJogada() + demandaAcrescida);
                            }
                        }

                    } else if(i == 1){

                        // A melhor jogada em decorrer das partidas terá 8% do que sobrou da intenção de compra
                        double valorAcrescimo = sobraIntencaoCompra * 0.08;

                        // Converte a demanda acrescida em inteiro
                        int demandaAcrescida = (int) Math.floor(valorAcrescimo);

                        // Atribui a demanda acrescida a jogada
                        for(Jogada jogada : partida.getJogadas()){
                            if(jogada.getIdentificacaoJogadaAPI().equals(jogadas.get(1).get("identificacaoJogadaAPI").asText())){
                                jogada.setDemandaTotalJogada(jogada.getDemandaTotalJogada() + demandaAcrescida);
                            }
                        }

                    } else if(i == 2){
                        // A melhor jogada em decorrer das partidas terá 4% do que sobrou da intenção de compra
                        double valorAcrescimo = sobraIntencaoCompra * 0.04;

                        // Converte a demanda acrescida em inteiro
                        int demandaAcrescida = (int) Math.floor(valorAcrescimo);

                        // Atribui a demanda acrescida a jogada
                        for(Jogada jogada : partida.getJogadas()){
                            if(jogada.getIdentificacaoJogadaAPI().equals(jogadas.get(2).get("identificacaoJogadaAPI").asText())){
                                jogada.setDemandaTotalJogada(jogada.getDemandaTotalJogada() + demandaAcrescida);
                            }
                        }
                    }
                }
            }
        }*/
    }
}
