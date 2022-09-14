package sPOOtify;

public abstract class Content {
    
    private String title;
    private int seconds;
    private String type = "";

    public Content(String title, int seconds, String type){
        this.title = title;
        this.seconds = seconds;
        this.type = type;
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

}
