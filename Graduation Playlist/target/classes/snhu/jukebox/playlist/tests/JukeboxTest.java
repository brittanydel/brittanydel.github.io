package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetPorchesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Porches PorchesBand = new Porches();
		 ArrayList<Song> porchesTracks = new ArrayList<Song>();
		 assertEquals(2, porchesTracks.size());
	}
}
