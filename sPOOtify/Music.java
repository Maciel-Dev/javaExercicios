package sPOOtify;

import java.util.ArrayList;
import java.util.List;

public class Music extends Content {
    
    private List<String> composers = new ArrayList<>();
    private List<String> interpreter = new ArrayList<>();
    private String genre;

    public Music(String title, int seconds, String type, List<String> composer, List<String> interpreter, String genre){
        
        super(title, seconds, type);
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
        System.out.println(this.composers);
        return this.composers;
    }

    public List<String> GetListInterpreter(){
        return this.interpreter;
    }

    public String GetGenre(){
        return this.genre;
    }

}
