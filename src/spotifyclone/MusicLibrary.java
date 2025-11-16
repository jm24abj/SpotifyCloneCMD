package spotifyclone;
import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<Song> songs;
    
    MusicLibrary() {
        songs = new ArrayList<Song>();
    }
    
    public void addSong(Song song) {
        songs.add(song);
    }
    
    public ArrayList<Song> search(String title) {
        return new ArrayList<Song>();
    }
}