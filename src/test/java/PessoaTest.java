import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void testeMediator(){

        MsgMediator mediator = new MsgMediator();

        WhatssAppCliente cliente = new WhatssAppCliente(mediator);
        WhatssAppLoja loja = new WhatssAppLoja(mediator);

        Pessoa Maria = new Pessoa(mediator);

        mediator.adicionar(cliente);
        mediator.adicionar(loja);
        mediator.adicionar(Maria);

        Maria.enviarMensagem("Olá gostaria de algumas informações da loja");
        loja.receberMensagem("Olá gostaria de algumas informações da loja");

        assertEquals("Olá gostaria de algumas informações da loja", loja.getMensagem() );

    }
}