import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;




public class CDTest {

	CD cd;

	@Before
	public void before(){
		cd = new CD();
	}


	@Test
	public void canGetCurrentlyPlayingNull() {
		assertEquals(null, cd.getCurrentlyPlaying());
	}

	@Test
	public void canSetCurrentlyPlaying() {
		cd.setCurrentlyPlaying("Hurt");
		assertEquals("Hurt", cd.getCurrentlyPlaying());
	}

	@Test
	public void canGetPowerStartsOff(){
		assertEquals(false, cd.isPowerOnOff());
	}

	@Test
	public void canTurnPowerOn(){
		cd.power(true);
		assertEquals(true, cd.isPowerOnOff());
	}
	@Test
	public void canTurnPowerOff(){
		cd.power(false);
		assertEquals(false, cd.isPowerOnOff());
	}

}
