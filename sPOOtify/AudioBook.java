package sPOOtify;

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

    public AudioBook(String title, int seconds, String workTitle, List<String> authors, String pubCompany, String storyTeller, String synpose){
        super(title, seconds);
        this.workTitle = workTitle;
        this.authors = authors;
        this.pubCompany = pubCompany;
        this.storyTeller = storyTeller;
        this.synpose = synpose;
    }

    public void SetWorkTitle(String workTitle){
        this.workTitle = workTitle;
    }

    public void SetAuthors(String authors){
        this.authors.add(authors);
    }

    public void SetPubCompany(String pubCompany){
        this.pubCompany = pubCompany;
    }

    public void SetStoryTeller(String storyTeller){
        this.storyTeller = storyTeller;
    }

    public void SetSynpose(String synpose){
        this.synpose = synpose;
    }

    public String GetWorkTitle(){
        return this.workTitle;
    }

    public List<String> GetAuthors(){
        return this.authors;
    }

    public String GetPubCompany(){
        return this.pubCompany;
    }

    public String GetStoryTeller(){
        return this.storyTeller;
    }

    public String GetSynpose(){
        return this.synpose;
    }

    @Override
    public void GetInfo(List<Content> playlist){
        for(Content content : playlist){
            if(content instanceof AudioBook){
                String titulo = content.GetTitle();
                Integer duracao = content.GetSecondsDuration();
                System.out.println("############### Playlist #################################################################");
                System.out.println("# - AudioBook: " + titulo + "      Duração: " + duracao + " segundos       " + "[Título da obra: " + GetWorkTitle() + "] [Autores: " + GetAuthors().toString().replace("[", "").replace("]", "") + "] [Editora: " + GetPubCompany() + "] [Narrador: " + GetStoryTeller() + "] [Sinopse: " + GetSynpose() + "]");
                System.out.println("##########################################################################################");
            }
        }
    }
}
