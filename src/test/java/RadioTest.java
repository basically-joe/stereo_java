import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

	Radio radio;


	@Before
	public void before() {
		radio = new Radio();
	}

	@Test
	public void canGetCurrentlyPlayingNull() {
		assertEquals(null, radio.getCurrentlyPlaying());
	}

	@Test
	public void canSetCurrentlyPlaying() {
		radio.setCurrentlyPlaying("Hurt");
		assertEquals("Hurt", radio.getCurrentlyPlaying());
	}

	@Test
	public void canGetPowerStartsOff(){
		assertEquals(false, radio.isPowerOnOff());
	}

	@Test
	public void canTurnPowerOn(){
		radio.setPowerOnOff(true);
		assertEquals(true, radio.isPowerOnOff());
	}
	@Test
	public void canTurnPowerOff(){
		radio.setPowerOnOff(false);
		assertEquals(false, radio.isPowerOnOff());
	}

	@Test
	public void canGetChannel(){
		assertEquals(null, radio.getChannel());
	}

	@Test
	public void canSetChannel(){
		radio.setChannel("Radio 1");
		assertEquals("Radio 1", radio.getChannel());
	}

}
