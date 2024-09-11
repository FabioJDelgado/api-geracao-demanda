package com.faculdade.apigeracaodemanda.mapper;

import com.faculdade.apigeracaodemanda.dtos.VariavelMicroeconomicaRequestDto;
import com.faculdade.apigeracaodemanda.models.VariavelMicroeconomica;

public class VariavelMicroeconomicaMapper {

    public static VariavelMicroeconomica toEntity(VariavelMicroeconomicaRequestDto variavelMicroeconomicaRequestDto) {
        VariavelMicroeconomica variavelMicroeconomica = new VariavelMicroeconomica();

        variavelMicroeconomica.setPreco(variavelMicroeconomicaRequestDto.preco());
        variavelMicroeconomica.setFatorPenalidadePreco(variavelMicroeconomicaRequestDto.fatorPenalidadePreco());

        variavelMicroeconomica.setPropaganda(variavelMicroeconomicaRequestDto.propaganda());

        variavelMicroeconomica.setPorcentagemPropagandaRadio(variavelMicroeconomicaRequestDto.porcentagemPropagandaRadio());
        variavelMicroeconomica.setValorMinimoPropagandaRadio(variavelMicroeconomicaRequestDto.valorMinimoPropagandaRadio());
        variavelMicroeconomica.setProporcaoCrescimentoPropagandaRadio(variavelMicroeconomicaRequestDto.proporcaoCrescimentoPropagandaRadio());

        variavelMicroeconomica.setPorcentagemPropagandaJornal(variavelMicroeconomicaRequestDto.porcentagemPropagandaJornal());
        variavelMicroeconomica.setValorMinimoPropagandaJornal(variavelMicroeconomicaRequestDto.valorMinimoPropagandaJornal());
        variavelMicroeconomica.setProporcaoCrescimentoPropagandaJornal(variavelMicroeconomicaRequestDto.proporcaoCrescimentoPropagandaJornal());

        variavelMicroeconomica.setPorcentagemPropagandaTV(variavelMicroeconomicaRequestDto.porcentagemPropagandaTV());
        variavelMicroeconomica.setValorMinimoPropagandaTV(variavelMicroeconomicaRequestDto.valorMinimoPropagandaTV());
        variavelMicroeconomica.setProporcaoCrescimentoPropagandaTV(variavelMicroeconomicaRequestDto.proporcaoCrescimentoPropagandaTV());

        variavelMicroeconomica.setPorcentagemPropagandaInternet(variavelMicroeconomicaRequestDto.porcentagemPropagandaInternet());
        variavelMicroeconomica.setValorMinimoPropagandaInternet(variavelMicroeconomicaRequestDto.valorMinimoPropagandaInternet());
        variavelMicroeconomica.setProporcaoCrescimentoPropagandaInternet(variavelMicroeconomicaRequestDto.proporcaoCrescimentoPropagandaInternet());

        variavelMicroeconomica.setConfiabilidadeProduto1(variavelMicroeconomicaRequestDto.confiabilidadeProduto1());
        variavelMicroeconomica.setConfiabilidadeProduto2(variavelMicroeconomicaRequestDto.confiabilidadeProduto2());
        variavelMicroeconomica.setConfiabilidadeProduto3(variavelMicroeconomicaRequestDto.confiabilidadeProduto3());

        return variavelMicroeconomica;
    }

    public static VariavelMicroeconomicaRequestDto toDto(VariavelMicroeconomica variavelMicroeconomica) {
        return new VariavelMicroeconomicaRequestDto(
            variavelMicroeconomica.getPreco(),
            variavelMicroeconomica.getFatorPenalidadePreco(),
            variavelMicroeconomica.getPropaganda(),
            variavelMicroeconomica.getPorcentagemPropagandaRadio(),
            variavelMicroeconomica.getValorMinimoPropagandaRadio(),
            variavelMicroeconomica.getProporcaoCrescimentoPropagandaRadio(),
            variavelMicroeconomica.getPorcentagemPropagandaJornal(),
            variavelMicroeconomica.getValorMinimoPropagandaJornal(),
            variavelMicroeconomica.getProporcaoCrescimentoPropagandaJornal(),
            variavelMicroeconomica.getPorcentagemPropagandaTV(),
            variavelMicroeconomica.getValorMinimoPropagandaTV(),
            variavelMicroeconomica.getProporcaoCrescimentoPropagandaTV(),
            variavelMicroeconomica.getPorcentagemPropagandaInternet(),
            variavelMicroeconomica.getValorMinimoPropagandaInternet(),
            variavelMicroeconomica.getProporcaoCrescimentoPropagandaInternet(),
            variavelMicroeconomica.getConfiabilidadeProduto1(),
            variavelMicroeconomica.getConfiabilidadeProduto2(),
            variavelMicroeconomica.getConfiabilidadeProduto3()
        );
    }
}
