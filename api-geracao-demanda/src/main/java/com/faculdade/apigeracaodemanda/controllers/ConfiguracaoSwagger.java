package com.faculdade.apigeracaodemanda.controllers;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API Geração de Demanda",
        version = "v1.0",
        description = "Essa API é disponibilizada com intuito de ajudar na criação de simuladores de vendas gamificados, que utilizam geradores de demanda, " +
                      "de forma que sejam acessíveis para auxiliar no ensino de alunos do curso técnico em Administração a aprender de forma prática e intuitiva em paralelo " +
                      "com a visão teórica aprendida nas aulas ministradas.\n\n" +
                      "Dito isto, essa API busca ser o ponto de partida para auxiliar a criação de ferramentas de " +
                      "ajuda aos professores em sala de aula, preenchendo a lacuna na disponibilidade gratuita de ferramentas voltadas para o ensino de alunos do " +
                      "nível técnico em Administração. A aplicação foi pensada de forma meticulosa para que haja uma documentação abrangente, permitindo uma integração " +
                      "simples e fácil de forma eficiente para que assim seja evitado retrabalhos e consequentemente  desuso da mesma.\n\n" +
                      "Para o melhor uso desse documento, é necessário que o usuário analíse cada esquema das estruturas JSON apresentadas, pois assim ele terá uma " +
                      "melhor compreensão de como a API funciona e como ela pode ser utilizada de forma eficiente."
        /*contact = @Contact(
                name = "Suporte da API",
                email = "suporte@exemplo.com",
                url = "https://www.exemplo.com"
        ),
        license = @License(
                name = "Licença API",
                url = "https://www.exemplo.com/licenca"
        )*/
    )
)
public class ConfiguracaoSwagger {
}
