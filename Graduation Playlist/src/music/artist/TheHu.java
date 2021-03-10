package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class TheHu {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheHu () {
    }
    
    public ArrayList<Song> getTheHuSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Wolf Totem", "The Hu");             //Create a song for The Hu
         Song track2 = new Song("Yuve Yuve Yu", "The Hu");         //Create another song for The Hu
         this.albumTracks.add(track1);                                          //Add the first song to song list for The Hu
         this.albumTracks.add(track2);                                          //Add the second song to song list for The Hu
         return albumTracks;                                                    //Return the songs for the  in the form of an ArrayList
    }
}
