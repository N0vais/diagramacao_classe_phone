package Iphone.NavegadorInternet;

public class Navegador implements Internet{

    @Override
    public void abrirPagina() {
        System.out.println("Estamos abrindo uma pagina (aguarde)!!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Estamos atualizando a pagina (aguarde)!!");
    }

    @Override
    public void abrirNovaPagina() {
        System.out.println("Estamos abrindo uma nova aba no navegador (aguarde)!!");
    }
    
}
