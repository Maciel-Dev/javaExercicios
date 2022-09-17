package sPOOtify;

import java.util.List;

public abstract class Content {
    
    private String title;
    private int seconds;
    private String type = "";

    public Content(String title, int seconds){
        this.title = title;
        this.seconds = seconds;
    }

    public void SetTitle(String title){
        this.title = title;
    }

    public void SetSeconds(int seconds){
        this.seconds = seconds;
    }

    public void SetType(String type){
        this.type = type;
    }

    public String GetTitle(){
        return title;
    }

    public int GetSecondsDuration(){
        return seconds;
    }

    public String GetType(){
        return type;
    }

    public void GetInfo(List<Content> playlist){
    }
}
