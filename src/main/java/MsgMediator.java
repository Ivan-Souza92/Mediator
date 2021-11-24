import java.util.ArrayList;

public class MsgMediator implements Mediator{

    protected ArrayList<Cliente> contatos;

    public MsgMediator() {
        contatos = new ArrayList<Cliente>();
    }

    public void adicionar(Cliente cliente) {
        contatos.add(cliente);
    }
    @Override
    public void enviar(String mensagem, Cliente cliente) {
        for (Cliente contato : contatos) {
            if (contato != cliente) {
                definirContato(contato);
                contato.receberMensagem(mensagem);
            }
        }
    }

    private void definirContato(Cliente contato) {
        if (contato instanceof WhatssAppCliente) {
            System.out.println("Definindo contato Cliente");
        } else if (contato instanceof WhatssAppLoja) {
            System.out.println("WhatssApp Loja");
        } else if (contato instanceof Pessoa) {
            System.out.println("Contato Pessoa");
        }
    }
}
