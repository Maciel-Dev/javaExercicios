package sPOOtify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScreenMenu {
    
    public void MenuStart(){

        System.out.println(
        "\n1 - Adicionar Conteúdo\n" +
        "2 - Listar Músicas\n" +
        "3 - Listar Podcasts\n" +
        "4 - Listar AudioLivros\n" +
        "5 - Exibir Duração total da Playlist\n" +
        "0 - Sair\n");

    }

    public void RunSpOOtify(String input, Playlist playlist){
        Scanner inputUser = new Scanner(System.in);

        while(!input.equalsIgnoreCase("0")){
            if(input.equals("1")){
                
                System.out.println("M - Adicionar Música\nP - Adicionar Podcast\nA - Adicionar AudioLivro\nF - Finalizar Criação");
                String userAddContent = inputUser.nextLine();
                if(userAddContent.equalsIgnoreCase("M")){

                    //Listas Auxiliares
                    List<String> ListComposers = new ArrayList<>();
                    List<String> ListInterpreters = new ArrayList<>();

                    System.out.println("Digite o título da Música: ");
                    String title = inputUser.nextLine();
                    System.out.println("Digite o tempo da Música em segundos: ");
                    int seconds = inputUser.nextInt();
                    System.out.println("Digite o nome do Compositor da Música: ");
                    inputUser.nextLine();

                    ListComposers.add(inputUser.nextLine());

                    System.out.println("Deseja Adicionar mais Compositores? S - Sim / N - Não");
                    String moreComp = inputUser.nextLine();

                    while(!moreComp.equalsIgnoreCase("N")){
                        if(moreComp.equalsIgnoreCase("S")){

                            System.out.println("Digite o nome do Compositor da Música: ");
                            ListComposers.add(inputUser.nextLine());

                        }

                        System.out.println("Deseja Adicionar mais Compositores? S - Sim / N - Não");
                        String newMoreComp = inputUser.nextLine();
                        moreComp = newMoreComp;

                    }

                    System.out.println("Digite o Interprete da Música: ");

                    ListInterpreters.add(inputUser.nextLine());

                    System.out.println("Deseja Adicionar mais Intérpretes? S - Sim / N - Não");
                    String moreInterp = inputUser.nextLine();
                    while(!moreInterp.equalsIgnoreCase("N")){
                        if(moreInterp.equalsIgnoreCase("S")){

                            System.out.println("Digite o nome do Intérprete da Música: ");
                            ListInterpreters.add(inputUser.nextLine());

                        }

                        System.out.println("Deseja Adicionar mais Intérpretes? S - Sim / N - Não");
                        String newMoreInterp = inputUser.nextLine();
                        moreInterp = newMoreInterp;

                    }

                    System.out.println("Digite o Gênero da Música: ");
                    String genre = inputUser.nextLine();

                    Music musica = new Music(title, seconds, ListComposers, ListInterpreters, genre);

                    System.out.println(musica.GetListComposer());
                    System.out.println(ListComposers);
                    
                    playlist.SetContent(musica);
                }

                else if(userAddContent.equalsIgnoreCase("P")){

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

                    Content podcast = new Podcast(title, seconds, presenter, theme, review);

                    playlist.SetContent(podcast);


                }

                else if(userAddContent.equalsIgnoreCase("A")){

                    List<String> authors = new ArrayList<>();

                    System.out.println("Digite o título do AudioLivro: ");
                    String title = inputUser.nextLine();
                    System.out.println("Digite o tempo em segundos do AudioLivro: ");
                    int seconds = inputUser.nextInt();
                    inputUser.nextLine();
                    System.out.println("Digite o título da obra do Audiolivro: ");
                    String workTitle = inputUser.nextLine();
                    System.out.println("Digite o Autor da obra do Audiolivro: ");
                    authors.add(inputUser.nextLine());

                    System.out.println("Deseja Adicionar mais Autores? S - Sim / N - Não");
                    String moreAuthor = inputUser.nextLine();

                    while(!moreAuthor.equalsIgnoreCase("N")){
                        if(moreAuthor.equalsIgnoreCase("S")){

                            System.out.println("Digite o nome do Compositor da Música: ");
                            authors.add(inputUser.nextLine());

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

                    Content audioBook = new AudioBook(title, seconds, workTitle, authors, pubCompany, storyTeller, synpose);

                    playlist.SetContent(audioBook);
                    
                }

                playlist.GetSeconds();


        }   

            //CASO QUEIRA LISTAR MUSICAS

            else if(input.equals("2")){

                for(Content content : playlist.GetContent()){
                    if(content.getClass().getName().contains("Music")){
                        if(content instanceof Music){
                            content.GetInfo(playlist.GetContent());
                    }
                }
            }
        }

            else if(input.equals("3")){
                for(Content content : playlist.GetContent()){
                    if(content.getClass().getName().contains("Podcast")){
                        if(content instanceof Podcast){
                            content.GetInfo(playlist.GetContent());
                    }
                }
            }
        }

            else if(input.equals("4")){
                for(Content content : playlist.GetContent()){
                    if(content.getClass().getName().contains("AudioBook")){
                        if(content instanceof AudioBook){
                            content.GetInfo(playlist.GetContent());
                    }
                }
            }
        }


            else if(input.equals("5")){
                System.out.println(playlist.GetSeconds() + " segundos");
            }


            //Check the bool condition to continue the program

            System.out.println("\n\n\n\n\n" +
            "1 - Adicionar Conteúdo\n" +
            "2 - Listar Músicas\n" +
            "3 - Listar Podcasts\n" +
            "4 - Listar AudioLivros\n" +
            "5 - Exibir Duração total da Playlist\n" +
            "0 - Sair\n");
            String newInput = inputUser.nextLine();
            input = newInput;

        }

        inputUser.close();
    }

}

