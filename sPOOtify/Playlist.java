package sPOOtify;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    
    private String title;
    private List<Content> content;

    public Playlist(String name){
        this.title = name;
        content = new ArrayList<>();
    }

    public String GetName(){
        return title;
    }

    public List<Content> GetContent(){
        return content;
    }

    public int GetSeconds(){

        int seconds = 0;

        for(Content content : GetContent()){
            seconds += content.GetSecondsDuration();
        }

        return seconds;
    }

    public void SetContent(Content musica){
        content.add(musica);
    }
    

}
