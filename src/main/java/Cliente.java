public abstract class Cliente {
    protected Mediator mediator;

    public Cliente(Mediator m) {
        mediator = m;
    }

    public void enviarMensagem(String mensagem) {
        mediator.enviar(mensagem, this);
    }

    public abstract void receberMensagem(String mensagem);
}