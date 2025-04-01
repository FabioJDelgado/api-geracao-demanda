package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.VariavelMicroeconomicaRequestDto;
import com.faculdade.apigeracaodemanda.models.VariavelMacroeconomica;
import com.faculdade.apigeracaodemanda.models.VariavelMicroeconomica;

public class VariavelMicroeconomicaMapper {

    public static VariavelMicroeconomica toEntity(VariavelMicroeconomicaRequestDto variavelMicroeconomicaRequestDto) {
        VariavelMicroeconomica variavelMicroeconomica = new VariavelMicroeconomica();
        variavelMicroeconomica.setPropaganda(variavelMicroeconomicaRequestDto.propaganda());
        variavelMicroeconomica.setPorcentagemPropagandaRadio(variavelMicroeconomicaRequestDto.porcentagemPropagandaRadio());
        variavelMicroeconomica.setPorcentagemPropagandaJornal(variavelMicroeconomicaRequestDto.porcentagemPropagandaJornal());
        variavelMicroeconomica.setPorcentagemPropagandaTV(variavelMicroeconomicaRequestDto.porcentagemPropagandaTV());
        variavelMicroeconomica.setPorcentagemPropagandaInternet(variavelMicroeconomicaRequestDto.porcentagemPropagandaInternet());
        variavelMicroeconomica.setQualidade(variavelMicroeconomicaRequestDto.qualidade());
        variavelMicroeconomica.setPreco(variavelMicroeconomicaRequestDto.preco());
        variavelMicroeconomica.setCapacidadeInstalada(variavelMicroeconomicaRequestDto.capacidadeInstalada());
        return variavelMicroeconomica;
    }

    public static VariavelMicroeconomicaRequestDto toDto(VariavelMicroeconomica variavelMicroeconomica) {
        return new VariavelMicroeconomicaRequestDto(
            variavelMicroeconomica.getPropaganda(),
            variavelMicroeconomica.getPorcentagemPropagandaRadio(),
            variavelMicroeconomica.getPorcentagemPropagandaJornal(),
            variavelMicroeconomica.getPorcentagemPropagandaTV(),
            variavelMicroeconomica.getPorcentagemPropagandaInternet(),
            variavelMicroeconomica.getQualidade(),
            variavelMicroeconomica.getPreco(),
            variavelMicroeconomica.getCapacidadeInstalada()
        );
    }
}
