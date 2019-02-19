public abstract class Component {

	protected String currentlyPlaying;
	protected boolean powerOnOff;

	public Component(){
		this.currentlyPlaying = currentlyPlaying;
		this.powerOnOff = false;
	}

	public String getCurrentlyPlaying() {
		return currentlyPlaying;
	}

	public void setCurrentlyPlaying(String currentlyPlaying) {
		this.currentlyPlaying = currentlyPlaying;
	}

	public boolean isPowerOnOff() {
		return powerOnOff;
	}

	public void setPowerOnOff(boolean powerOnOff) {
		this.powerOnOff = powerOnOff;
	}
}
