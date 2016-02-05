package reusing;
//Inheritance & upcasting.

class Instrument {
	  public void play(Instrument i) {System.out.println("Playing: "+i);}
	  static void tune(Instrument i) {
	    // ...
	    i.play(i);
	  }
	}

	// Wind objects are instruments
	// because they have the same interface:
public class Wind extends Instrument {
	  public static void main(String[] args) {
	    Wind flute = new Wind();
	    Instrument.tune(flute); // Upcasting
	  }
	}
