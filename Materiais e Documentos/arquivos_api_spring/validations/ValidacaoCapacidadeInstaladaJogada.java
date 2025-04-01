package com.faculdade.apigeracaodemanda.validations;

import com.faculdade.apigeracaodemanda.exceptions.ErroInfo;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidacaoCapacidadeInstaladaJogada implements ConstraintValidator<ValidaCapacidadeInstaladaJogada, Map<String, Double>> {

    @Override
    public boolean isValid(Map<String, Double> capacidadeInstalada, ConstraintValidatorContext context) {
        List<ErroInfo> erros = new ArrayList<>();
        boolean isValid = true;
        String msgErro = "";

        for(Map.Entry<String, Double> entry : capacidadeInstalada.entrySet()){
            if(!entry.getKey().equals("espacoFisico") && !entry.getKey().equals("funcionarios") && !entry.getKey().equals("caixas")){
                isValid = false;
                msgErro = "As chaves da capacidade instalada devem ser 'espacoFisico', 'funcionarios' e 'caixas'";
                break;
            }
            if(entry.getValue() == null || entry.getValue() < 1){
                isValid = false;
                msgErro = "Os valores da capacidade instalada não podem ser nulos ou menores que 1";
                break;
            }
        }

        if(!isValid) {
            erros.add(new ErroInfo("capacidadeInstalada", msgErro));

            for (ErroInfo e : erros) {
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getTitulo())
                        .addConstraintViolation();
            }
        }

        return erros.isEmpty();
    }
}
