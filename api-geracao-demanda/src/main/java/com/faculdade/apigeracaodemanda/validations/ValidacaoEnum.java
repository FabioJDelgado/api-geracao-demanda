package com.faculdade.apigeracaodemanda.validations;

import com.faculdade.apigeracaodemanda.exceptions.ErroInfo;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidacaoEnum implements ConstraintValidator<ValidaEnum, String> {

    private Class<? extends Enum<?>> enumClass;
    private boolean casosIgnorados;
    private String nomeCampo;

    @Override
    public void initialize(ValidaEnum validaEnum) {
        ConstraintValidator.super.initialize(validaEnum);
        this.enumClass = validaEnum.enumClass();
        this.casosIgnorados = validaEnum.casosIgnorados();
        this.nomeCampo = validaEnum.nomeCampo();
    }

    @Override
    public boolean isValid(String valor, ConstraintValidatorContext context) {
        String valoresValidos =  Arrays.toString(enumClass.getEnumConstants()) + " (case " + (casosIgnorados ? "insensitive" : "sensitive") + ")";
        List<ErroInfo> erros = new ArrayList<>();

        if (valor == null) {
            erros.add(new ErroInfo(this.nomeCampo, "Valor não pode ser nulo. Valores válidos: " + valoresValidos));
        }

        if(erros.isEmpty()){
            boolean isValid = Arrays.stream(enumClass.getEnumConstants())
                    .anyMatch(enumValue -> casosIgnorados ?
                            enumValue.toString().equalsIgnoreCase(valor) :
                            enumValue.toString().equals(valor));
            if (!isValid) {
                erros.add(new ErroInfo(this.nomeCampo, "O valor " + valor + " é inválido. Valores válidos: " + valoresValidos));
            }
        }

        for (ErroInfo e : erros) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMensagem()).addPropertyNode(e.getTitulo())
                    .addConstraintViolation();
        }

        return erros.isEmpty();
    }
}
