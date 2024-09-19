package com.faculdade.apigeracaodemanda.validations;

import com.faculdade.apigeracaodemanda.dtos.VariavelMacroeconomicaCadastroPartidaRequestDto;
import com.faculdade.apigeracaodemanda.exceptions.ErroInfo;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.List;

public class ValidacaoCadastroPartidaVariavelMacroeconomica implements ConstraintValidator<ValidaCadastroPartidaVariavelMacroeconomica, VariavelMacroeconomicaCadastroPartidaRequestDto> {


    @Override
    public boolean isValid(VariavelMacroeconomicaCadastroPartidaRequestDto dto, ConstraintValidatorContext context) {
        List<ErroInfo> erros = new ArrayList<>();

        if(dto.fatorAjuste() < 1 || dto.fatorAjuste() > 5){
            erros.add(new ErroInfo("fatorAjuste", "O fator de ajuste deve ser um valor entre 1 e 5"));
        }

        for (ErroInfo e : erros) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getTitulo())
                    .addConstraintViolation();
        }

        return erros.isEmpty();
    }
}
