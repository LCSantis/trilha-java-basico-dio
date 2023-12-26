package edu.usuario;

import edu.NumeroInvalidoException;
import edu.iphone.Iphone;

public class Usuario extends Iphone {
    public static void main(String[] args) throws NumeroInvalidoException {
        Usuario iphone = new Usuario();

        // ReprodutorMusical:
        /*
        try {
            iphone.selecionarMusica();
        } catch (NumeroInvalidoException e){
            System.out.println("Número Inválido!!!");
        }*/
        //iphone.pausar();
        //iphone.tocar();


        // AparelhoTelefonico:
        //iphone.ligar();
        //iphone.atender();
        //iphone.iniciarCorreioVoz();

        // NavegadorInternet:
        //iphone.exibirPagina();
        //iphone.adicionarNovaAba();
        //iphone.atualizarPagina();
    }
}
