package ricksInstruments;

public enum InstrumentType {
	GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;
	
	public String toString() {
		switch(this) {
		case GUITAR : return "guitar";
		case BANJO : return "banjo";
		case DOBRO : return "dobro";
		case FIDDLE : return "fiddle";
		case BASS : return "bass";
		case MANDOLIN : return "mandolin";
		default : return "unspecified";
		}
		
	}

}
