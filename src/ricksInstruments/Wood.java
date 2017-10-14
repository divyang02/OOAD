package ricksInstruments;

public enum Wood {
	
	INDIAN_ROSEWOOD, BRAZALLIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, STIKA;
	
	public String toString() {
		switch(this) {
		case INDIAN_ROSEWOOD : return "Indian Rosewood";
		case BRAZALLIAN_ROSEWOOD : return "Bazallian Rosewood";
		case MAHOGANY : return "Mahogany";
		case MAPLE : return "Maple";
		case COCOBOLO : return "Cocobolo";
		case CEDAR : return "Cedar";
		case ADIRONDACK : return "Adirondack";
		case ALDER : return "Alder";
		case STIKA : return "Stika";
		default : return "";
		}
	}

}
