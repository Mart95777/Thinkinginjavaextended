package initialization;

class Banana { 
	void peel(int i) { 
		/* ... */ 
		System.out.println("peeled which?");
	} 
}

public class BananaPeel {
  public static void main(String[] args) {
    Banana a = new Banana(),
           b = new Banana();
    a.peel(1);
    b.peel(2);
  }
}
