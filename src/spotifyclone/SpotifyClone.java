package spotifyclone;

public class SpotifyClone {
    
    public static Song[] initSongs() {
        String[] titles = {"Decades (2007 Remaster)","Lets Stay Together","Jump For Joy","Victims Of The Revolution","Unstable Condition",
            "Ocean Front Property","Negai (Album-Mix)","A Little Bit More","Good Position","Weekend","Oh Industry","Weekend Story","Love Strings",
            "Straight Lines","There’s No Solution","Continent perdu","Rockall (Live)","Position (Live)","Looking Blindly","Gorgeous"
        };

        String[] artists = {"Joy Division","Al Green","New York Trio","Bad Religion","John Tejada","George Strait","Perfume","Jamie Lidell",
            "Yin Yoga Academy","Kane Brown","Bette Midler","Paragraph270","Mask Of The Wolf","Silverchair","Sum 41","Khunta & Sixko","Molecule",
            "Hot Water Music","Lack Of Interest","Property Prophets"
        };
        
        int[] durations = {374,199,286,197,348,197,298,186,219,226,244,184,254,257,198,281,456,269,44,262};
        
        Song[] allSongs = new Song[titles.length];
        
        for (int i = 0; i < titles.length; i++) {
            Song song = new Song(titles[i],artists[i],durations[i]);
            allSongs[i] = song;
            System.out.println(song.toString());
        }
        
        return allSongs;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Song[] allSongs = initSongs();
    }
    
}
