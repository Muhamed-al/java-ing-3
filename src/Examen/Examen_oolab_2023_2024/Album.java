package Examen.Examen_oolab_2023_2024;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String title;
    private Category category;
    private final int maxTracks;
    private List<Track> tracks;

    public Album(String title , Category category , int maxTracks){
        this.title = title;
        this.category = category;
        this.maxTracks = maxTracks;
        this.tracks = new ArrayList<>();
    }

    public boolean isFinished(){
        return tracks.size() == maxTracks;
    }

    public boolean isTrueTrack(Track t){
        return  tracks.contains(t);
    }

    public void addTrack(Track t) throws AlbumException{
        if (isFinished()){
            throw new AlbumException("Album est plein");
        }
        if (isTrueTrack(t)){
            throw  new AlbumException("Trackj already exist");
        }
        tracks.add(t);
    }

    public  int totalDuration(){
        if (!isFinished()){
            return -1;
        }
        int total = 0;
        for (Track t : tracks){
            total += t.getDuration();
        }
        return total;
    }



}
