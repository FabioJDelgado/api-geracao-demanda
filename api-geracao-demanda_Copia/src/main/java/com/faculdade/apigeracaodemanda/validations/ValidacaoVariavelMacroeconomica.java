package com.faculdade.apigeracaodemanda.validations;

import com.faculdade.apigeracaodemanda.exceptions.ErroInfo;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidacaoVariavelMacroeconomica implements ConstraintValidator<ValidaVariavelMacroeconomica, Map<String, Double>> {


    @Override
    public boolean isValid(Map<String, Double> taxaBasicaJuros, ConstraintValidatorContext context) {
        List<ErroInfo> erros = new ArrayList<>();
        boolean isValid = true;

        for(Map.Entry<String, Double> entry : taxaBasicaJuros.entrySet()){
            if(entry.getValue() == null || entry.getValue() < 0){
                isValid = false;
                break;
            }
        }

        if(!isValid) {
            erros.add(new ErroInfo("taxaBasicaJuros", "A taxa básica de juros não pode conter valores nulos ou menor que 0"));

            for (ErroInfo e : erros) {
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getTitulo())
                        .addConstraintViolation();
            }
        }

        return erros.isEmpty();
    }
}
