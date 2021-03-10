package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class MysterySkulls {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public MysterySkulls() {
    }
    
    public ArrayList<Song> getMysterySkullsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Hellbent", "Mystery Skulls");             //Create a song
         Song track2 = new Song("Ghost", "Mystery Skulls");         //Create another song
         Song track3 = new Song("Money", "Mystery Skulls");         //Create another song
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);     
         this.albumTracks.add(track3); 
         return albumTracks;                                                    
    }
}
