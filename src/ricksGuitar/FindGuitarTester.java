package ricksGuitar;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec("Stratocastor", 6, Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		List matchingGuitars = inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin you might like this ...");
			for(Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("We have a " + 
				 spec.getBuilder() + " " + spec.getModel() + " " +
				 spec.getType() + " guitar:\n" +
				 spec.getNumStrings() + "-Strings\n" +
				 spec.getBackwood() + " back and sides\n" + 
				 spec.getTopwood() + "top.\nYou can have it for only $" +
				 guitar.getPrice() + "!\n -------");
			}
			
		} else {
			System.out.println("we dont have what you need");
		}
	}
	
	

	private static void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
	}

}
