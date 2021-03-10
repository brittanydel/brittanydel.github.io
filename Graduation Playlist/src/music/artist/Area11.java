package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Area11 {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Area11() {
    }
    
    public ArrayList<Song> getArea11Songs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Heaven-Piercing Giga Drill", "Area 11");             //Create a song
         Song track2 = new Song("Knightmare/Frame", "Area 11");         //Create another song
         Song track3 = new Song("Override [B]", "Area 11");         //Create another song
         Song track4 = new Song("GO!! Fighting Action Power", "Area 11");         //Create another song
         Song track5 = new Song("All Your Friends / New Magiks", "Area 11");         //Create another song
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);     
         this.albumTracks.add(track3); 
         this.albumTracks.add(track4);     
         this.albumTracks.add(track5); 
         return albumTracks;                                                    
    }
}
