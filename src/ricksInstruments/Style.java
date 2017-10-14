package ricksInstruments;

public enum Style {
	
	A,F;
	
	public String toString() {
		switch(this) {
		case A : return "A";
		case F : return "B";
		default : return "unmatched";
		}
	}

}
