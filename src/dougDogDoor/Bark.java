package dougDogDoor;

public class Bark {
	
	private String sound;
	
	public Bark(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}
	
	public boolean equals(Bark bark) {
		return this.sound.equals(bark.sound);
	}

}
