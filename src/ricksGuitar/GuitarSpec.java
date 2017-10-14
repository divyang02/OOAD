package ricksGuitar;

public class GuitarSpec {
	
	private String model;
	private Builder builder;
	private Type type;
	private Wood topwood, backwood;
	private int numStrings;
	
	public GuitarSpec(String model, int numStrings, Builder builder, Type type, Wood topwood, Wood backwood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backwood = backwood;
		this.topwood = topwood;
		this.numStrings = numStrings;
	}
	
	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackwood() {
		return backwood;
	}

	public Wood getTopwood() {
		return topwood;
	}
	
	public int getNumStrings() {
		return numStrings;
	}
	
	public boolean matches(GuitarSpec otherSpec) {
		if(builder != otherSpec.getBuilder()) return false;
		
		if((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(otherSpec.getModel()))) return false;
		
		if(type != otherSpec.getType()) return false;
		
		if(numStrings != otherSpec.getNumStrings()) return false;
		
		if(backwood != otherSpec.getBackwood()) return false;
		
		if(topwood != otherSpec.getTopwood()) return false;
		
		return true;
	}

}
