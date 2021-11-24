public class Pessoa extends Cliente{
    public Pessoa(Mediator m) {
        super(m);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("A loja recebeu: " + mensagem);
    }
}
