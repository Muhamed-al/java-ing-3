package Examen.Examen_oolab_2023_2024;

public class Track {
    private String title;
    private int duration;

    public Track(String title , int duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public  String toString(){
        return title + " " + duration;
    }
}
