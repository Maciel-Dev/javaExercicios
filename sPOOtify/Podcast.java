package sPOOtify;

public class Podcast extends Content {
    
    private String presenter;
    private String theme;
    private String review;

    public Podcast(String title, int seconds, String presenter, String theme, String review){

        super(title, seconds);
        this.presenter = presenter;
        this.theme = theme;
        this.review = review;

    }

    public void SetPresenter(String presenter){
        this.presenter = presenter;
    }

    public void SetTheme(String theme){
        this.theme = theme;
    }

    public void SetReview(String review){
        this.review = review;
    }

    public String GetPresenter(){
        return this.presenter;
    }

    public String GetTheme(){
        return this.theme;
    }

    public String GetReview(){
        return this.review;
    }
}
