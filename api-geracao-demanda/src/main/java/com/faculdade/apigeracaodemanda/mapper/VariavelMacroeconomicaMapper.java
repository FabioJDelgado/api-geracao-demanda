package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.VariavelMacroeconomicaCadastroPartidaRequestDto;
import com.faculdade.apigeracaodemanda.models.VariavelMacroeconomica;

public class VariavelMacroeconomicaMapper {

    public static VariavelMacroeconomica toEntityCadastroPartida(VariavelMacroeconomicaCadastroPartidaRequestDto variavelMacroeconomicaCadastroPartidaRequestDto) {
        VariavelMacroeconomica variavelMacroeconomica = new VariavelMacroeconomica();
        variavelMacroeconomica.setFatorAjuste(variavelMacroeconomicaCadastroPartidaRequestDto.fatorAjuste());
        return variavelMacroeconomica;
    }

    public static VariavelMacroeconomicaCadastroPartidaRequestDto toDtoCadastroPartida(VariavelMacroeconomica variavelMacroeconomica) {
        return new VariavelMacroeconomicaCadastroPartidaRequestDto(
            variavelMacroeconomica.getFatorAjuste()
        );
    }
}
