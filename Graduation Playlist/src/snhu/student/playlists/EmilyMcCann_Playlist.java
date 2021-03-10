package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class EmilyMcCann_Playlist {
	
	public LinkedList<PlayableSong> StudentPlaylist(){
		
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	//create list for Cher's songs
	ArrayList<Song> cherTracks = new ArrayList<Song>();
    Cher cher = new Cher();
    cherTracks = cher.getCherSongs();
	
    //add specific Cher songs to playlist
	playlist.add(cherTracks.get(0));
	playlist.add(cherTracks.get(1));
	
	//create list for Adele's songs
    Adele adele = new Adele();
	ArrayList<Song> adeleTracks = new ArrayList<Song>();
    adeleTracks = adele.getAdelesSongs();
	
    //add specific Adele songs to playlist
	playlist.add(adeleTracks.get(0));
	playlist.add(adeleTracks.get(1));
	playlist.add(adeleTracks.get(2));
	
    return playlist;
	}
}
