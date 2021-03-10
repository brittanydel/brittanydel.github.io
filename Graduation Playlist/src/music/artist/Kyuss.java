package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Kyuss {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    private static String BandName = "Kyuss";
    
    public Kyuss() {
    }
    
    public ArrayList<Song> getKyussSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Gardenia", Kyuss.BandName);            		//Create a song
         Song track2 = new Song("Green Machine", Kyuss.BandName);        		//Create another song
         Song track3 = new Song("Space Cadet", Kyuss.BandName);        			//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Kyuss
         this.albumTracks.add(track2);                                          //Add the second song to song list for he Kyuss 
         this.albumTracks.add(track3);                                          //Add the third song to song list for he Kyuss 
         return albumTracks;                                                    //Return the songs for Kyuss in the form of an ArrayList
    }
}