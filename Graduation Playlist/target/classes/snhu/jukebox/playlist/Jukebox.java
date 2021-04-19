package snhu.jukebox.playlist;

import java.net.URI;
import java.util.LinkedList;
import java.util.Queue;

public class Jukebox {
    
    static Queue<PlayableSong> playlist = new LinkedList<PlayableSong>();
    PlayableSong current;
    
    Jukebox() {
    }

    public Queue<PlayableSong> play(String studentPlaylistRequested) {
    	StudentList studentProfile = new StudentList();
    	Student student = studentProfile.GetStudentProfile(studentPlaylistRequested);
    	
    	playlist = student.getPlaylist();
        current = playlist.poll();
        if(current != null) {
            current.play();
        }
        
        return playlist;
    }
    
    public void playNext() {
        if(current instanceof Song) {
            // If we are currently playing a song, get the next one
            getNextSong();
        } 
    }
    
    public void getNextSong() {
        current = playlist.poll();
        if(current != null) {
            current.play();
        }
    }
   
    
public static void getPlaylistLink(String args[]){
	
	// Open the student playlist in web browser
		
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=cedrrjoV04s&list=PLkNCcacMgA2MQlW9SEHbnpEbrviB0Fd7v");
			java.awt.Desktop.getDesktop().browse(uri);
			System.out.println("Playlist opened in browser");
	    
		}
		catch (Exception e) {
			e.printStackTrace();
			}
		}

}