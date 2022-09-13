package array;

import java.util.ArrayList;
import java.util.List;

public class Music extends Content {
    
    private List<String> composers = new ArrayList<>();
    private List<String> interpreter = new ArrayList<>();
    private String genre;




    public Music(String title, Float seconds, List<String> composers, List<String> interpreter, String genre){
        
        this.composers = composers;
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

    public List<String> GetComposer(){
        return this.composers;
    }

    public List<String> GetInterpreter(){
        return this.interpreter;
    }

}
