package edu.iphone;

import edu.NumeroInvalidoException;
import edu.smartphone.features.internet.NavegadorInternet;
import edu.smartphone.features.musical.ReprodutorMusical;
import edu.smartphone.features.telefone.AparelhoTelefonico;
import java.util.Scanner;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
            Scanner scanner = new Scanner(System.in);

            public void selecionarMusica() throws NumeroInvalidoException {
                int selecionada;

                String[] musicas = {"Far Away - Nickelback",
                        "In The End - Linkin Park",
                        "November Rain - Guns N' Roses",
                        "Bring Me To Life - Evanescence"};

                System.out.println("Vamos ouvir música!\n" +
                        "-------------------");
                for(int i = 0; i < musicas.length; i++) {
                    System.out.println((i + 1)+ ". " + musicas[i]);
                }
                System.out.print("----------------------------\n" + "Número da música escolhida: ");
                selecionada = scanner.nextInt();
                if (selecionada > musicas.length || selecionada < 1) throw new NumeroInvalidoException();
                System.out.println("\nReproduzindo música: ".concat(musicas[selecionada - 1]) + "\n");

            }

            public void tocar() {
                String tocar;

                System.out.print("Para tocar a música digite a letra 'T': ");
                tocar = scanner.next().toUpperCase().strip();

                if (tocar.equalsIgnoreCase("T")) {
                    System.out.println("Tocando música.");
                }
            }
            public void pausar() {
                String pausar;

                System.out.print("Para pausar a música digite a letra 'P': ");
                pausar = scanner.next().toUpperCase().strip();

                if (pausar.equalsIgnoreCase("P")) {
                    System.out.println("Música pausada.");
                }
            }

            public void ligar() {
                String telefone;

                System.out.print("Digite o número de telefone para ligar: ");
                telefone = scanner.next().toUpperCase().strip();

                System.out.println("Ligando para o número ".concat(telefone));
            }
            public void atender() {
                String atender;

                System.out.print("Telefone tocando. Deseja atender? [S / N]:  ");
                atender = scanner.next().toUpperCase().strip();
                if(atender.equalsIgnoreCase("S")) {
                    System.out.println("Chamada atendida.");
                } else {
                    System.out.println("Chamada rejeitada.");
                }
            }
            public void iniciarCorreioVoz() {
                String ouvir;

                System.out.print("Você possui uma mensagem de voz, deseja ouvir? [S / N]: ");
                ouvir = scanner.next().toUpperCase().strip();

                if (ouvir.equalsIgnoreCase("S")) {
                    System.out.println("Ouvindo correio de voz...");
                }
            }

            public void exibirPagina() {
                String opcao;

                enum PaginaWeb {
                    GOOGLE("Google", "https://www.google.com"),
                    TERRA("Terra", "https://www.terra.com.br"),
                    AMAZON("Amazon", "https://www.amazon.com");

                private String nome;
                private String endereco;

                PaginaWeb(String nome, String endereco) {
                    this.nome = nome;
                    this.endereco = endereco;
                }

                public String getNome() {
                    return nome;
                }

                public String getEndereco() {
                    return endereco;
                }
                }
                System.out.println("Páginas da web:");
                for(PaginaWeb site : PaginaWeb.values()){
                    System.out.println(site.getNome());
                }
                System.out.print("Digite a opção que deseja abrir: ");
                opcao = scanner.next().toUpperCase().strip();

                switch (opcao){
                    case "GOOGLE" :{
                        System.out.println("Abrindo a página: " + PaginaWeb.GOOGLE.getEndereco());
                        break;
                    }
                    case "TERRA" :{
                        System.out.println("Abrindo a página: " + PaginaWeb.TERRA.getEndereco());
                        break;
                    }
                    case "AMAZON" :{
                        System.out.println("Abrindo a página: " + PaginaWeb.AMAZON.getEndereco());
                        break;
                    }
                    default:
                        System.out.println("Página não encontrada.");
                }
            }
            public void adicionarNovaAba() {
                System.out.print("Deseja adicionar nova aba no navegador? [S / N]: ");
                String adicionar = scanner.next().toUpperCase().strip();
                if (adicionar.equalsIgnoreCase("S")) {
                    System.out.println("Nova aba inicializada.");
                }
            }
            public void atualizarPagina() {
                System.out.print("Deseja atualizar a página? [S / N]: ");
                String atualizar = scanner.next().toUpperCase().strip();
                String mensagem = atualizar.equalsIgnoreCase("S") ? "Página atualizada." : "";
                System.out.println(mensagem);
            }
}

