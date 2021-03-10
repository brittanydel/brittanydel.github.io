package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class FiveFingerDeathPunch {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public FiveFingerDeathPunch () {
    }
    
    public ArrayList<Song> getFiveFingerDeathPunchSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Blue on Black", "Five Finger Death Punch");             //Create a song for FFDP
         Song track2 = new Song("Jekyll and Hyde", "Five Finger Death Punch");         //Create another song for FFDP
         Song track3 = new Song("Under and Over it","Five Finger Death Punch");			//create third song for FFDP
         this.albumTracks.add(track1);                                          //Add the first song to song list for FFDP
         this.albumTracks.add(track2);                                          //Add the second song to song list for FFDP
         this.albumTracks.add(track3);											//Add the third song to song list for FFDP
         return albumTracks;                                                    //Return the songs for the  in the form of an ArrayList
    }
}
