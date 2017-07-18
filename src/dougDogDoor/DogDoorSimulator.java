package dougDogDoor;

public class DogDoorSimulator {
	/**public static void main(String args[]) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		System.out.println("fido barks to go outside...");
		recognizer.recognize("woof");
		//remote.pressButton();
		System.out.println("fido has gone outside...");
		//remote.pressButton();
		System.out.println("fido is all done");
		//remote.pressButton();
		//System.out.println("fido is back inside");
		//remote.pressButton();
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {}
		
		System.out.println("but he is stuck outside..");
		System.out.println("fido sarts barking..");
		//System.out.println("gina grabs the remote control...");
		recognizer.recognize("woof");
		//remote.pressButton();
		System.out.println("fido is back inside :)......");
	}**/
	
	
	public static void main(String args[]) {
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("roowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		//simulate hardware hearing a bark
		System.out.println("bruce starts barking");
		recognizer.recognize(new Bark("roowlf"));
		
		System.out.println("\nbruce has gone outside");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {};
		
		System.out.println("\nbruce is all done");
		System.out.println("\n but he is stuck outside..");
		
		//simulate the hardware hearing a bark but not bruce's
		Bark smallDogBark = new Bark("yip");
		System.out.println("\na small dog starts barking");
		recognizer.recognize(smallDogBark);
		
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {};
		
		//simulate hardware hearing bruce bark again
		System.out.println("\nbruce starts barking again");
		recognizer.recognize(new Bark("woof"));
		
		System.out.println("\n\nBRUCE IS BACK INSIDE.....     :)    .....");
	}

}
