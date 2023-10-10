package Iphone.AparelhoTelefonico;

public class Aparelho implements Telefone{

    @Override
    public void fazerLigacao() {
        System.out.println("Estou fazendo uma ligação!!!!");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Estou iniciando o correide voz!!!!");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("(Telefone esta tocando) atender a ligaçao!!!!");
    }
    
}
