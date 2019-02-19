public class Radio extends Component implements IPower {

	private String channel;

	public Radio() {
		this.channel = channel;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public void power(boolean onOff){
		this.powerOnOff = onOff;
	}
}
