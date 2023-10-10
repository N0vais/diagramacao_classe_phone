package Iphone;

import Iphone.AparelhoTelefonico.Aparelho;
import Iphone.NavegadorInternet.Navegador;
import Iphone.ReprodutorMusical.Ipod;

public class Iphone {
    //metodo main para rodar o sistema
    public static void main(String[] args) {
        //estanciando o ipod
        Ipod celularIpod = new Ipod();

        System.out.println("<<<<<TOCADOR DE MUSICA>>>>>>>");
        celularIpod.selecionarMusica();
        celularIpod.TocarMusica();
        celularIpod.PausarMusica();
        System.out.println("||||||||||||||||||||||");

        //estanciando a classe aparelho.
        Aparelho celularAparelho = new Aparelho();

        System.out.println("<<<<<<< TELEFONE >>>>>>>>");
        celularAparelho.fazerLigacao();
        celularAparelho.atenderLigacao();
        celularAparelho.iniciarCorreioDeVoz();
        System.out.println("|||||||||||||||||||");

        //estanciando a classe internet.

        Navegador celulaNavegador = new Navegador();

        System.out.println("<<<<<<< NAVEGADOR DE INTERNET >>>>>>");
        celulaNavegador.abrirPagina();
        celulaNavegador.atualizarPagina();
        celulaNavegador.abrirNovaPagina();
        System.out.println("||||||||||||||||||");

    }
}
