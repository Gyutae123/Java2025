package remoteControl;

public class TV implements RemoteControl{
	int volume;
	public void TurnOn() {
		System.out.println("Turn on TV!");
	}
	
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("TV volume: " + volume);
	}
}
