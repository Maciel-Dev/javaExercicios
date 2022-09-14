package sPOOtify;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        System.out.println("1 - Criar e Preencher Playlist\n2 - Listar Músicas\n3 - Listar Podcasts\n4 - Listar AudioLivros\n5 - Exibir Duração total da Playlist\n0 - Sair");

        String input = inputUser.next();

        //List<Content> Playlist = new ArrayList<>(); //adicionar a uma função com retorno
        Playlist playlist = new Playlist("Teste");

        while(!input.equalsIgnoreCase("0")){
            if(input.equals("1")){
                
                System.out.println("M - Adicionar Música\nP - Adicionar Podcast\nA - Adicionar AudioLivro\nF - Finalizar Criação");
                String userAddContent = inputUser.next();
                if(userAddContent.equalsIgnoreCase("M")){

                    //Listas Auxiliares
                    List<String> ListComposers = new ArrayList<>();
                    List<String> ListInterpreters = new ArrayList<>();

                    System.out.println("Digite o título da Música: ");
                    String title = inputUser.next();
                    System.out.println("Digite o tempo da Música em segundos: ");
                    inputUser.nextLine();
                    int seconds = inputUser.nextInt();
                    System.out.println("Digite o nome do Compositor da Música: ");
                    String composer = inputUser.next();
                    inputUser.nextLine();

                    ListComposers.add(composer);

                    System.out.println("Deseja Adicionar mais Compositores? S - Sim / N - Não");
                    String moreComp = inputUser.nextLine();

                    while(!moreComp.equalsIgnoreCase("N")){
                        if(moreComp.equalsIgnoreCase("S")){

                            System.out.println("Digite o nome do Compositor da Música: ");
                            String newComposer = inputUser.nextLine();
                            ListComposers.add(newComposer);

                        }

                        System.out.println("Deseja Adicionar mais Compositores? S - Sim / N - Não");
                        String newMoreComp = inputUser.nextLine();
                        moreComp = newMoreComp;

                    }

                    System.out.println("Digite o Interprete da Música: ");
                    String interpreter = inputUser.next();
                    ListInterpreters.add(interpreter);

                    System.out.println("Deseja Adicionar mais Intérpretes? S - Sim / N - Não");
                    String moreInterp = inputUser.next();
                    while(!moreInterp.equalsIgnoreCase("N")){
                        if(moreInterp.equalsIgnoreCase("S")){

                            System.out.println("Digite o nome do Intérprete da Música: ");
                            String newInterp = inputUser.next();
                            ListInterpreters.add(newInterp);

                        }

                        System.out.println("Deseja Adicionar mais Intérpretes? S - Sim / N - Não");
                        String newMoreInterp = inputUser.next();
                        moreInterp = newMoreInterp;

                    }

                    System.out.println("Digite o Gênero da Música: ");
                    String genre = inputUser.next();

                    Content musica = new Music(title, seconds, "Music", ListComposers, ListInterpreters, genre);
                    
                    playlist.SetContent(musica);
                }

                else if(userAddContent.equalsIgnoreCase("P")){

                    inputUser.nextLine();
                    System.out.println("Digite o título do Podcast: ");
                    String title = inputUser.nextLine();
                    System.out.println("Digite o tempo em segundos do Podcast: ");
                    int seconds = inputUser.nextInt();
                    System.out.println("Digite o nome do Apresentador: ");
                    inputUser.nextLine();
                    String presenter = inputUser.nextLine();
                    System.out.println("Digite o tema do Podcast: ");
                    String theme = inputUser.nextLine();
                    System.out.println("Digite a resenha do Podcast: ");
                    String review = inputUser.nextLine();

                    Podcast podcast = new Podcast(title, seconds, "Podcast", presenter, theme, review);

                    playlist.SetContent(podcast);


                }

                else if(userAddContent.equalsIgnoreCase("A")){

                    List<String> authors = new ArrayList<>();

                    System.out.println("Digite o título do AudioLivro: ");
                    String title = inputUser.next();
                    System.out.println("Digite o tempo em segundos do AudioLivro: ");
                    inputUser.nextLine();
                    int seconds = inputUser.nextInt();
                    System.out.println("Digite o título da obra do Audiolivro: ");
                    String workTitle = inputUser.next();
                    System.out.println("Digite o Autor da obra do Audiolivro: ");
                    String author = inputUser.next();
                    authors.add(author);
                    inputUser.nextLine();


                    

                    System.out.println("Deseja Adicionar mais Compositores? S - Sim / N - Não");
                    String moreAuthor = inputUser.nextLine();

                    while(!moreAuthor.equalsIgnoreCase("N")){
                        if(moreAuthor.equalsIgnoreCase("S")){

                            System.out.println("Digite o nome do Compositor da Música: ");
                            String newAuthor = inputUser.nextLine();
                            authors.add(newAuthor);

                        }

                        System.out.println("Deseja Adicionar mais Compositores? S - Sim / N - Não");
                        String newMoreAuth = inputUser.nextLine();
                        moreAuthor = newMoreAuth;

                    }

                    System.out.println("Digite o nome da Editora: ");
                    String pubCompany = inputUser.nextLine();
                    System.out.println("Digite o nome do narrador: ");
                    String storyTeller = inputUser.nextLine();
                    System.out.println("Digite a Sinpose do AudioLivro: ");
                    String synpose = inputUser.nextLine();

                    AudioBook audioBook = new AudioBook(title, seconds, "AudioBook", workTitle, authors, pubCompany, storyTeller, synpose);

                    playlist.SetContent(audioBook);
                    
                }

                playlist.GetSeconds();
                playlist.GetMusic();


        }   

            //CASO QUEIRA LISTAR MUSICAS

            else if(input.equals("2")){

                System.out.println("IM HERE");

                for(Content content : playlist.GetMusic()){
                    System.out.println(content);
                }

            }

            else if(input.equals("3")){
                

            }

            else if(input.equals("4")){

            }

            else if(input.equals("5")){
                System.out.println(playlist.GetSeconds() + "segundos");
            }


            //Check the bool condition to continue the program

            System.out.println("1 - Adicionar Conteúdo\n2 - Listar Músicas\n3 - Listar Podcasts\n4 - Listar AudioLivros\n5 - Exibir Duração total da Playlist\n0 - Sair");
            String newInput = inputUser.next();
            input = newInput;

        }

        inputUser.close();
    }

}
    



//