package array;

public abstract class Content {
    
    String title;
    Float seconds;

    public Content(String title, Float seconds){
        this.title = title;
        this.seconds = seconds;
    }

    public void SetTitle(String title){
        this.title = title;
    }

    public void SetSeconds(Float seconds){
        this.seconds = seconds;
    }

    

}
