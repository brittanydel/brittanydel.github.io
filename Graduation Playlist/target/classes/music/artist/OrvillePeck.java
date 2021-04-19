package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class OrvillePeck {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public OrvillePeck() {
    }
    
    public ArrayList<Song> getOrvillePeckSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Dead of Night", "Orville Peck");         				//Create a song
         Song track2 = new Song("Queen of the Rodeo", "Orville Peck");        //Create another song
         Song track3 = new Song("Roses are Falling", "Orville Peck");        //Create another song
         this.albumTracks.add(track1);                                  //Add the first song to song list
         this.albumTracks.add(track2);                                  //Add the second song to song list
         this.albumTracks.add(track3);                                  //Add the second song to song list
         return albumTracks;                                            //Return the songs for Orville Peck in the form of an ArrayList
    }
}