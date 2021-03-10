package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;


public class SmashingPumpkins {

	// Basic public member variables
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    // Create a private member to hold the artist name. Simplifies changing artist names later. 
    private static String artistName = "Smashing Pumpkins, The";
    
    public SmashingPumpkins() {	
    	albumTitle = "Mellon Collie and the Infinite Sadness"; // Set album title
    }
    
    // No need to repeat the artist's name in the method name, that's going to be clear by the class name.
    public ArrayList<Song> getSongs() {
    	
    	 albumTracks = new ArrayList<Song>(); // Album instantiation
    	
    	 // Create song entries for each chosen song from the album
    	 Song track1 = new Song("Zero", artistName);            
    	 Song track2 = new Song("Bullet with Butterfly Wings", artistName);
    	 Song track3 = new Song("Porcelina of the Vast Oceans", artistName);
    	 Song track4 = new Song("1979", artistName);
    	 Song track5 = new Song("Stumbleine", artistName);
    	 Song track6 = new Song("We Only Come Out At Night", artistName);
    	 Song track7 = new Song("By Starlight", artistName);
    	 
    	 // Add each song to the arraylist for the album's tracks
         this.albumTracks.add(track1);
         this.albumTracks.add(track2);
         this.albumTracks.add(track3);
         this.albumTracks.add(track4);
         this.albumTracks.add(track5);
         this.albumTracks.add(track6);
         this.albumTracks.add(track7);
         
         return albumTracks; // Return the tracks for this album/artist in the form of an ArrayList
         
    }
	
}
