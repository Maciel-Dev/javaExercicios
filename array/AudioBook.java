package array;

import java.util.ArrayList;
import java.util.List;

public class AudioBook extends Content {
    
    public String workTitle;
    public List<String> authors = new ArrayList<>();
    public String pubCompany;
    public String storyTeller;
    public String synpose;

    //Fazer uma forma de Set para autores
    //Adicionar na lista

    public AudioBook(String title, Float seconds, String workTitle, List<String> authors, String pubCompany, String storyTeller, String synpose){
        super(title, seconds);
        this.workTitle = workTitle;
        this.authors = authors;
        this.pubCompany = pubCompany;
        this.storyTeller = storyTeller;
        this.synpose = synpose;
    }

}
