package spotifyclone;
import java.util.ArrayList;

public class PlayList {
    private String name;
    private ArrayList<Song> tracks;
    
    PlayList(String name) {
        this.name = name;
        tracks = new ArrayList<Song>();
    }
    
    public void addSong(Song song) {
        
    }
    
    public void addSong(Song song, int position) {
        
    }
    
    public void removeSong(int position) {
        
    }
    
    public void moveSong(int fromPosition, int toPosition) {
        
    }
    
    public int getRunTime() {
        return 0;
    }
    
    public ArrayList<Song> getTrackList() {
       return tracks;
    }
    
    @Override public String toString() {
        return "";
    }
}
