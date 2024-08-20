package com.faculdade.apigeracaodemanda.validations;

import com.faculdade.apigeracaodemanda.exceptions.ErroInfo;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidacaoTaxaDevolucaoVariavelMicroeconomica implements ConstraintValidator<ValidaTaxaDevolucaoVariavelMicroeconomica, Map<String, Double>> {

    @Override
    public boolean isValid(Map<String, Double> taxaDevolucao, ConstraintValidatorContext context) {
        List<ErroInfo> erros = new ArrayList<>();
        boolean isValid = true;
        String msgErro = "";

        for(Map.Entry<String, Double> entry : taxaDevolucao.entrySet()){
            if(!entry.getKey().equals("fornecedor1") && !entry.getKey().equals("fornecedor2") && !entry.getKey().equals("fornecedor3")){
                isValid = false;
                msgErro = "As chaves da taxa de devolução devem ser 'fornecedor1', 'fornecedor2' e 'fornecedor3'";
                break;
            }
        }

        if(!isValid) {
            erros.add(new ErroInfo("taxaDevolucao", msgErro));

            for (ErroInfo e : erros) {
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getTitulo())
                        .addConstraintViolation();
            }
        }

        return erros.isEmpty();
    }
}
