package com.faculdade.apigeracaodemanda.utils;

import com.faculdade.apigeracaodemanda.exceptions.RecursoNaoEncontradoException;
import com.faculdade.apigeracaodemanda.models.Jogada;
import com.faculdade.apigeracaodemanda.models.Partida;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class Util {

    // Variável que armazena o caminho a ser utilizado para salvar o arquivo
    static String path = "src/main/java/com/faculdade/apigeracaodemanda/data/";

    public static boolean stringVazia(String string) {
        return string == null || string.trim().isEmpty();
    }

    public static String geraIdentificadorUUID() {
        return UUID.randomUUID().toString();
    }

    public static boolean validaExistenciaPartida(String identificadorPartida) {
        try {
            File file = new File(path + "partida-" + identificadorPartida + ".json");
            if (file.exists()) {
                // Variável que armazena o ObjectMapper
                ObjectMapper objectMapper = new ObjectMapper();

                // Variável que armazena o JSON do arquivo
                JsonNode jsonNode = objectMapper.readTree(file);

                // Variável que armazena a partida
                Partida partida = objectMapper.readValue(jsonNode.toString(), Partida.class);

                return !partida.isPartidaFinalizada();
            }  else{
                return false;
            }
        } catch (IOException e){
            throw new RuntimeException("Erro ao validar a partida: " + e.getMessage());
        }
    }

    public static void salvaPartida(Partida partida) {
        try {
            // Variável que armazena o arquivo a ser salvo
            File file = new File(path + "partida-" + partida.getIdentificacaoPartida() + ".json");

            if(!file.exists()){
                // Cria o arquivo
                file.createNewFile();
            }

            // Variável para mapear o JSON do arquivo
            ObjectMapper objectMapper = new ObjectMapper();

            // Variável que armazena o JSON da partida
            String json = objectMapper.writeValueAsString(partida);

            // Variável que armazena o FileWriter para escrever no arquivo
            FileWriter fileWriter = new FileWriter(file, false);

            // Escreve o JSON no arquivo
            fileWriter.write(json);

            // Fecha o FileWriter
            fileWriter.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar a rodada da partida: " + e.getMessage());
        }
    }

    public static Partida recuperaPartida(String identificadorPartida) {
        try {
            // Variável que armazena o arquivo a ser recuperado
            File file = new File(path + "partida-" + identificadorPartida + ".json");

            if(file.exists()){
                // Variável que armazena o ObjectMapper
                ObjectMapper objectMapper = new ObjectMapper();

                // Variável que armazena o JSON do arquivo
                JsonNode jsonNode = objectMapper.readTree(file);

                // Variável que armazena a partida
                Partida partida = objectMapper.readValue(jsonNode.toString(), Partida.class);

                return partida;
            } else {
                throw new RecursoNaoEncontradoException("Partida informada não encontrada");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao recuperar a partida: " + e.getMessage());
        }
    }
}
