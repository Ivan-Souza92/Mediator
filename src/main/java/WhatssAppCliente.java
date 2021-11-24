public class WhatssAppCliente extends Cliente{

    public WhatssAppCliente(Mediator mediator){
        super(mediator);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Mensagem recebida: " + mensagem);
    }
}
