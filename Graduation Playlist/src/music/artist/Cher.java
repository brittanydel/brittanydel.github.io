package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Cher {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Cher() {
    }
    
    public ArrayList<Song> getCherSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                  //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Strong Enough", "Cher");      //Create a song
         Song track2 = new Song("Believe", "Cher");            //Create another song
         this.albumTracks.add(track1);                         //Add the first song to song list for Cher
         this.albumTracks.add(track2);                         //Add the second song to song list for Cher
         return albumTracks;                                   //Return the songs for Cher in the form of an ArrayList
    }

}
