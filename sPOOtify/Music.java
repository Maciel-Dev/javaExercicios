package sPOOtify;

import java.util.ArrayList;
import java.util.List;

public class Music extends Content {
    
    private List<String> composers = new ArrayList<>();
    private List<String> interpreter = new ArrayList<>();
    private String genre;

    public Music(String title, int seconds, List<String> composer, List<String> interpreter, String genre){
        
        super(title, seconds);
        this.composers = composer;
        this.interpreter = interpreter;
        this.genre = genre;

    }

    public void SetComposer(String composer){
        this.composers.add(composer);
    }

    public void SetInterpreter(String interpreter){
        this.interpreter.add(interpreter);
    }

    public void SetGenre(String genre){
        this.genre = genre;
    }


    public List<String> GetListComposer(){
        return this.composers;
    }

    public List<String> GetListInterpreter(){
        return this.interpreter;
    }

    public String GetGenre(){
        return this.genre;
    }

    @Override
    public void GetInfo(List<Content> playlist){
            for(Content content : playlist){
                if(content instanceof Music){
                    String titulo = content.GetTitle();
                    Integer duracao = content.GetSecondsDuration();
                    System.out.println("############### Playlist #################################################################");
                    System.out.println("# - Música: " + titulo + "      Duração: " + duracao + " segundos       " + "[Compositor: " + GetListComposer().toString().replace("[", "").replace("]", "") + "] [Interpretes: " + GetListInterpreter().toString().replace("[", "").replace("]", "") + "] [Gênero: " + GetGenre() + "]");
                    System.out.println("##########################################################################################");
                }
            }
        }

    }
