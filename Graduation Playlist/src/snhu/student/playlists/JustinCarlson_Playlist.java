package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

// Class that represents the playlist for Justin Carlson
public class JustinCarlson_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
		// instantiate a list of PlayableSong objects
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();

		// Define the list of Nirvana songs and add all of them to an ArrayList
		ArrayList<Song> nirvanaTracks = new ArrayList<Song>();
	    Nirvana nirvanaBand = new Nirvana();
	    
	    nirvanaTracks = nirvanaBand.getNirvanaSongs();
	    nirvanaTracks.forEach(track -> {
	    	playlist.add(track);
	    });
	    
	    // Define the list of Kyuss songs and add all of them to an ArrayList
		ArrayList<Song> kyussTracks = new ArrayList<Song>();
		Kyuss kyuss = new Kyuss();
		
	    kyussTracks = kyuss.getKyussSongs();
	    kyussTracks.forEach(track -> {
	    	playlist.add(track);
	    });
	    
	    // Add the "Yuve Yuve Yu" song by The Hu to my playlist
	    ArrayList<Song> theHuTracks = new ArrayList<Song>();
	    TheHu theHu = new TheHu();
	    
	    theHuTracks = theHu.getTheHuSongs();
	    playlist.add(theHuTracks.get(1));
	    
	    // Add the "Money" song by Mystery Skulls to my playlist
	    ArrayList<Song> mysterySkullsTracks = new ArrayList<Song>();
	    MysterySkulls mysterySkulls = new MysterySkulls();
	    
	    mysterySkullsTracks = mysterySkulls.getMysterySkullsSongs();
	    playlist.add(mysterySkullsTracks.get(2));    
		
	    // return the playlist to the caller
	    return playlist;
	}
}
