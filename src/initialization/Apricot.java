package initialization;

// Notice, that "this" not needed to be used, inside pit()
// but can still be used ?
public class Apricot {
	  void pick() { 
		  /* ... */ 
		  System.out.println("Inside Pick");
	  }
	  void pit() { 
		  pick(); 
		  this.pick();
		  /* ... */ 
	  }
	  
	  public static void main(String[] args) {
		  Apricot x = new Apricot();
		  x.pit();
		  }
	}
