package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.JogadaRegistroResponseDto;
import com.faculdade.apigeracaodemanda.dtos.RodadaRegistroResponseDto;
import com.faculdade.apigeracaodemanda.models.Rodada;

import java.util.ArrayList;
import java.util.List;

public class RodadaMapper {

    public static RodadaRegistroResponseDto toRodadaRegistroResponseDto(Rodada rodada){

        List<JogadaRegistroResponseDto> jogadas = new ArrayList<>();
        for(int i = 0; i < rodada.getJogadas().size(); i++){
            jogadas.add(JogadaMapper.toJogadaRegistroResponseDto(rodada.getJogadas().get(i)));
        }

        return new RodadaRegistroResponseDto(
                rodada.getIdentificacaoRodada(),
                jogadas
        );
    }
}
