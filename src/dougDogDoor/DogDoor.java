package dougDogDoor;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private final ArrayList<Bark> allowedBarks = new ArrayList<>();
	
	public DogDoor() {
		this.open = false;
	}
	
	public void open() {
		System.out.println("the dog door opens");
		open = true;
		
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}
	
	public void close() {
		System.out.println("the dog door closes");
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public void addAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}
	
	public ArrayList<Bark> getAllowedBarks() {
		return allowedBarks;
	}

}
