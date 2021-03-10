package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Nirvana {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    private static String BandName = "Nirvana";
    
    public Nirvana() {
    }
    
    public ArrayList<Song> getNirvanaSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Lithium", Nirvana.BandName);            		//Create a song
         Song track2 = new Song("Dumb", Nirvana.BandName);        				//Create another song
         Song track3 = new Song("Polly", Nirvana.BandName);        			    //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Nirvana
         this.albumTracks.add(track2);                                          //Add the second song to song list for he Nirvana 
         this.albumTracks.add(track3);                                          //Add the third song to song list for he Nirvana 
         return albumTracks;                                                    //Return the songs for Nirvana in the form of an ArrayList
    }
}