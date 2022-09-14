package sPOOtify;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    public List<Content> GetMusic(){
        List<Content> musicas = content.stream().filter(content -> content.GetType().contains("Music")).collect(Collectors.toList());
        return musicas;
    }

    public List<Content> getPodcasts(){
		List<Content> podcasts = content.stream().filter(content -> content.GetType().contains("Podcast")).collect(Collectors.toList()); 
		return podcasts;
	}

    public List<Content> getAudioBooks(){
		List<Content> audioBooks = content.stream().filter(content -> content.GetType().contains("AudioBook")).collect(Collectors.toList()); 
		return audioBooks;
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
