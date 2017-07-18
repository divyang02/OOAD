package dougDogDoor;

import java.util.Iterator;

public class BarkRecognizer {
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}
	
	public void recognize(Bark bark) {
		System.out.println("bark recognizer hear a bark '" + bark.getSound() + "'" );
		//System.out.println("\n " + door.getAllowedBarks().size());
		for(Bark i : door.getAllowedBarks()) {
			if(i.equals(bark)) {
				door.open();
				return;
			}
		}
		System.out.println("\n\n this dog is not allowe");
	}

}
