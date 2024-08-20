package com.faculdade.apigeracaodemanda.validations;

import com.faculdade.apigeracaodemanda.dtos.VariavelMacroeconomicaEditarRequestDto;
import com.faculdade.apigeracaodemanda.exceptions.ErroInfo;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidacaoEdicaoVariavelMacroeconomica implements ConstraintValidator<ValidaEdicaoVariavelMacroeconomica, VariavelMacroeconomicaEditarRequestDto> {
    @Override
    public boolean isValid(VariavelMacroeconomicaEditarRequestDto dto, ConstraintValidatorContext context) {
        List<ErroInfo> erros = new ArrayList<>();

        for(Map.Entry<String, Double> entry : dto.taxaBasicaJuros().entrySet()){
            if(entry.getValue() == null || entry.getValue() < 0){
                erros.add(new ErroInfo("taxaBasicaJuros", "A taxa básica de juros não pode conter valores nulos ou menor que 0"));
                break;
            }
        }

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
