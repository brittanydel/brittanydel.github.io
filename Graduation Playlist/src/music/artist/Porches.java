package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Porches {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Porches() {
    }
    
    public ArrayList<Song> getPorchesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Hour", "Porches");         				//Create a song
         Song track2 = new Song("Permanent Loan", "Porches");        //Create another song
         this.albumTracks.add(track1);                                  //Add the first song to song list
         this.albumTracks.add(track2);                                  //Add the second song to song list
         return albumTracks;                                            //Return the songs for Porches in the form of an ArrayList
    }
}