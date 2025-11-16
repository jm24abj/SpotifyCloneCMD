package spotifyclone;
import java.util.ArrayList;

public class PlayListCollection {
    private ArrayList<PlayList> playLists;
    
    PlayListCollection() {
        playLists = new ArrayList<PlayList>();
    }
    
    public void addPlayList(String name) {
        
    }
    
    public void removePlayList(int index) {
        
    }
    
    public void duplicatePlayList(String name, int index) {
        
    }
    
    public ArrayList<PlayList> getPlayLists() {
        return playLists;
    }
    
    public PlayList getPlayList(int index) {
        return playLists.get(index);
    }
    
    @Override public String toString () { 
        return "";
    }
}
