package array;

public class Podcast extends Content {
    
    private String presenter;
    private String theme;
    private String review;

    public Podcast(String title, Float seconds, String presenter, String theme, String review){

        super(title, seconds);
        this.presenter = presenter;
        this.theme = theme;
        this.review = review;

    }
}
