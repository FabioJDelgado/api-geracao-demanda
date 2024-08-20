package com.faculdade.apigeracaodemanda.validations;

import com.faculdade.apigeracaodemanda.dtos.VariavelMicroeconomicaRequestDto;
import com.faculdade.apigeracaodemanda.exceptions.ErroInfo;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.List;

public class ValidacaoVariavelMicroeconomica implements ConstraintValidator<ValidaVariavelMicroeconomia, VariavelMicroeconomicaRequestDto> {

    @Override
    public boolean isValid(VariavelMicroeconomicaRequestDto dto, ConstraintValidatorContext context) {

        List<ErroInfo> erros = new ArrayList<>();

        if (!isPorcentagemMeiosPropagandaValida(dto)) {
            erros.add(new ErroInfo("porcentagemMeiosPropaganda", "A soma das porcentagens dos meios de propaganda deve ser igual a 100"));
        }

        if (!isPorcentagemVariavelMicroeconomicaValida(dto)) {
            erros.add(new ErroInfo("porcentagemVariaveisMicroeconomicas", "A soma das porcentagens das variáveis microeconomicas deve ser igual a 100"));
        }

        for (ErroInfo e : erros) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getTitulo())
                    .addConstraintViolation();
        }

        return erros.isEmpty();
    }

    private boolean isPorcentagemMeiosPropagandaValida(VariavelMicroeconomicaRequestDto dto) {
        double soma = dto.porcentagemPropagandaRadio() + dto.porcentagemPropagandaJornal() + dto.porcentagemPropagandaTV() + dto.porcentagemPropagandaInternet();
        return soma == 100;
    }

    private boolean isPorcentagemVariavelMicroeconomicaValida(VariavelMicroeconomicaRequestDto dto) {
        double soma = dto.propaganda() + dto.qualidade() + dto.preco() + dto.capacidadeInstalada();
        return soma == 100;
    }
}
