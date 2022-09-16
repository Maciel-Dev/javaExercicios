package sPOOtify;

public abstract class Content {
    
    private String title;
    private int seconds;

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

    public String GetTitle(){
        return title;
    }

    public int GetSecondsDuration(){
        return seconds;
    }
}
