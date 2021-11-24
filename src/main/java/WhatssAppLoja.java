public class WhatssAppLoja extends Cliente{

    private String msg;

    public WhatssAppLoja(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receberMensagem(String mensagem) {
        this.msg = mensagem;
        System.out.println("Loja recebeu: " + mensagem);
    }

    public String getMensagem(){
        return this.getMensagem();
    }
}
