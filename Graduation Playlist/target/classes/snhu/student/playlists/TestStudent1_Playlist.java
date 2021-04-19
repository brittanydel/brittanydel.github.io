package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestStudent1_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
		
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	//List of Porches' Songs
	ArrayList<Song> porchesTracks = new ArrayList<Song>();
    Porches porches = new Porches();
    porchesTracks = porches.getPorchesSongs();
	
    //add Porches' songs to playlist
	playlist.add(porchesTracks.get(0));
	playlist.add(porchesTracks.get(1));
	
	//List Orville Peck's Songs
    OrvillePeck orvillePeck = new OrvillePeck();
	ArrayList<Song> orvillePeckTracks = new ArrayList<Song>();
    orvillePeckTracks = orvillePeck.getOrvillePeckSongs();
	
    //add OrvillePeck songs to playlist
	playlist.add(orvillePeckTracks.get(0));
	playlist.add(orvillePeckTracks.get(1));
	playlist.add(orvillePeckTracks.get(2));
	
    return playlist;
	}
}
