package com.faculdade.apigeracaodemanda.validations;

import com.faculdade.apigeracaodemanda.dtos.RodadaRegistroResquestDto;
import com.faculdade.apigeracaodemanda.dtos.VariavelMicroeconomicaRequestDto;
import com.faculdade.apigeracaodemanda.exceptions.ErroInfo;
import com.faculdade.apigeracaodemanda.models.Partida;
import com.faculdade.apigeracaodemanda.utils.Util;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.List;

public class ValidacaoRodadaRegistro implements ConstraintValidator<ValidaRodadaRegistro, RodadaRegistroResquestDto> {

    @Override
    public boolean isValid(RodadaRegistroResquestDto dto, ConstraintValidatorContext context) {

        List<ErroInfo> erros = new ArrayList<>();

        if(dto.jogadas() == null){
            erros.add(new ErroInfo("jogadas", "A lista de jogadas não pode ser nula"));
        }
        if(erros.isEmpty()) {
            if (!Util.validaExistenciaPartida(dto.identificacaoPartida())) {
                erros.add(new ErroInfo("identificacaoPartida", "A partida informada não existe ou já foi finalizada"));
            }

            if (dto.jogadas().size() < 1) { // Verificar com o Luiz Cláudio
                erros.add(new ErroInfo("qtdJogadas", "A quantidade mínima de jogadas em cada rodade é 1"));
            }

            Partida partida = Util.recuperaPartida(dto.identificacaoPartida());

            if((partida.getContadorRodadas() == 0 || partida.getContadorRodadas() % 3 == 0)){
                if(dto.variavelMacroeconomica() == null){
                    erros.add(new ErroInfo("taxaJuros", "A taxa de juros deve ser informada na primeira e a cada 3 rodadas"));
                } else if(dto.variavelMacroeconomica().taxaJuros() == null){
                    erros.add(new ErroInfo("taxaJuros", "A taxa de juros deve ser informada na primeira e a cada 3 rodadas"));
                }
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
