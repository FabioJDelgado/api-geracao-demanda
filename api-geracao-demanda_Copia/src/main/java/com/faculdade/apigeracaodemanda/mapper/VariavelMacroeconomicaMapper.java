package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.VariavelMacroeconomicaCadastroRequestDto;
import com.faculdade.apigeracaodemanda.dtos.VariavelMacroeconomicaEditarRequestDto;
import com.faculdade.apigeracaodemanda.dtos.VariavelMacroeconomicaEditarResponseDto;
import com.faculdade.apigeracaodemanda.models.VariavelMacroeconomica;

public class VariavelMacroeconomicaMapper {

    public static VariavelMacroeconomica toEntityCadastro(VariavelMacroeconomicaCadastroRequestDto variavelMacroeconomicaCadastroRequestDto) {
        VariavelMacroeconomica variavelMacroeconomica = new VariavelMacroeconomica();
        variavelMacroeconomica.setTaxaBasicaJuros(variavelMacroeconomicaCadastroRequestDto.taxaBasicaJuros());
        variavelMacroeconomica.setRenda(variavelMacroeconomicaCadastroRequestDto.renda());
        return variavelMacroeconomica;
    }

    public static VariavelMacroeconomicaCadastroRequestDto toDto(VariavelMacroeconomica variavelMacroeconomica) {
        return new VariavelMacroeconomicaCadastroRequestDto(
            variavelMacroeconomica.getTaxaBasicaJuros(),
            variavelMacroeconomica.getRenda()
        );
    }

    public static VariavelMacroeconomica toEntityEditar(VariavelMacroeconomicaEditarRequestDto variavelMacroeconomicaEditarRequestDto) {
        VariavelMacroeconomica variavelMacroeconomica = new VariavelMacroeconomica();
        variavelMacroeconomica.setTaxaBasicaJuros(variavelMacroeconomicaEditarRequestDto.taxaBasicaJuros());
        return variavelMacroeconomica;
    }

    public static VariavelMacroeconomicaEditarResponseDto toDtoEditar(VariavelMacroeconomica variavelMacroeconomica) {
        return new VariavelMacroeconomicaEditarResponseDto(
            variavelMacroeconomica.getTaxaBasicaJuros()
        );
    }
}
