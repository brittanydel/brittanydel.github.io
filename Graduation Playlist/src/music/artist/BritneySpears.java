package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BritneySpears {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BritneySpears() {
    }
    
    public ArrayList<Song> getBritneySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Oops!...I Did It Again", "Britney Spears");            //Create a song
         Song track2 = new Song("... Baby One More Time", "Britney Spears");            //Create another song
         Song track3 = new Song("Im Not a Girl, Not Yet a Woman", "Britney Spears");    //Create another song
         this.albumTracks.add(track1);                                                  //Add the first song to song list for Britney Spears
         this.albumTracks.add(track2);                                                  //Add the second song to song list for Britney Spears
         this.albumTracks.add(track3);                                                  //Add the third song to song list for Britney Spears

         return albumTracks;                                                            //Return the songs for Britney Spears in the form of an ArrayList
    }
	
}
