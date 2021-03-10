package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	
	@Test
	public void testGetNirvanaAlbumSize() throws NoSuchFieldException, SecurityException {
		 Nirvana nirvana = new Nirvana();
		 ArrayList<Song> nirvanaTracks = new ArrayList<Song>();
		 nirvanaTracks = nirvana.getNirvanaSongs();
		 assertEquals(3, nirvanaTracks.size());
	}

	
	@Test
	public void testGetKyussAlbumSize() throws NoSuchFieldException, SecurityException {
		 Kyuss kyuss = new Kyuss();
		 ArrayList<Song> kyussTracks = new ArrayList<Song>();
		 kyussTracks = kyuss.getKyussSongs();
		 assertEquals(3, kyussTracks.size());
	}
	
	@Test
	public void testGetCherAlbumSize() throws NoSuchFieldException, SecurityException {
		 Cher cher = new Cher();
		 ArrayList<Song> cherTracks = new ArrayList<Song>();
		 cherTracks = cher.getCherSongs();
		 assertEquals(2, cherTracks.size());
	}
	
	@Test
	public void testGetBritneySpearsAlbumSize() throws NoSuchFieldException, SecurityException {
		 BritneySpears britneySpears = new BritneySpears();
		 ArrayList<Song> britneySpearsTracks = new ArrayList<Song>();
		 britneySpearsTracks = britneySpears.getBritneySongs();
		 assertEquals(3, britneySpearsTracks.size());
	}
	
	@Test
	public void testGetPumpkinsAlbumSize() throws NoSuchFieldException, SecurityException {
		SmashingPumpkins pumpkins = new SmashingPumpkins();
		ArrayList<Song> pumpkinsTracks = new ArrayList<Song>();
		pumpkinsTracks = pumpkins.getSongs();
		assertEquals(7, pumpkinsTracks.size());
	}
}
