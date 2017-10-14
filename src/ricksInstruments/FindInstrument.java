package ricksInstruments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindInstrument {
	
	public static void main(String args[]) {
		Inventory inventory = new Inventory();
		InitializeInventory(inventory);
		
		Map properties = new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backwood", Wood.MAPLE);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);
		
		List matchingInstruments = inventory.search(clientSpec);
		if(!matchingInstruments.isEmpty()) {
			for(Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument)i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println("We have a " + spec.getProperty("instrumentType") + " with the following properties:");
				for(Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String)j.next();
					if(propertyName.equals("instrumentType")) continue;
					System.out.println("   " + propertyName + ": " + spec.getProperty(propertyName) );
				}
				System.out.println("You can have this " + spec.getProperty("instrumentType") + " for $" + instrument.getPrice() + "\n-----");
			}
		} else {
			System.out.println("sorry we have nothig for you...");
		}
	}

	private static void InitializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		Map properties = new HashMap();
	    properties.put("instrumentType", InstrumentType.GUITAR);
	    properties.put("builder", Builder.COLLINGS);
	    properties.put("model", "CJ");
	    properties.put("type", Type.ACOUSTIC);
	    properties.put("numStrings", 6);
	    properties.put("topwood", Wood.INDIAN_ROSEWOOD);
	    properties.put("backwood", Wood.STIKA);
	    inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

	    properties.put("builder", Builder.MARTIN);
	    properties.put("model", "D-18");
	    properties.put("topwood", Wood.MAHOGANY);
	    properties.put("backwood", Wood.ADIRONDACK);
	    inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

	    properties.put("builder", Builder.FENDER);
	    properties.put("model", "Stratocastor");
	    properties.put("type", Type.ELECTRIC);
	    properties.put("topwood", Wood.ALDER);
	    properties.put("backwood", Wood.ALDER);
	    inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
	    inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));
	 
	    properties.put("builder", Builder.GIBSON);
	    properties.put("model", "Les Paul");
	    properties.put("topwood", Wood.MAPLE);
	    properties.put("backwood", Wood.MAPLE);
	    inventory.addInstrument("70108276", 2295.95, 
	      new InstrumentSpec(properties));

	    properties.put("model", "SG '61 Reissue");
	    properties.put("topwood", Wood.MAHOGANY);
	    properties.put("backwood", Wood.MAHOGANY);
	    inventory.addInstrument("82765501", 1890.95, 
	      new InstrumentSpec(properties));

	    properties.put("instrumentType", InstrumentType.MANDOLIN);
	    properties.put("type", Type.ACOUSTIC);
	    properties.put("model", "F-5G");
	    properties.put("backwood", Wood.MAPLE);
	    properties.put("topwood", Wood.MAPLE);
	    properties.remove("numStrings");
	    inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));

	    properties.put("instrumentType", InstrumentType.BANJO);
	    properties.put("model", "RB-3 Wreath");
	    properties.remove("topwood");
	    properties.put("numStrings", 5);
	    inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
		
	}

}
