package spotifyclone;

public class Song {
    private String title;
    private String artist;
    private int runTime;
    
    Song(String title, String artist , int runTime) {
        this.title = title;
        this.artist = artist;
        this.runTime = runTime;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public int getRunTime() {
        return runTime;
    }
    
    @Override public String toString() {
        return title + " : " + artist + " : " + runTime;
    }
}
