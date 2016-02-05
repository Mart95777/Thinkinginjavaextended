package operators;

/**
 * Passing objects to methods
 * 
 *
 */
public class PassObject {
  static void f(Letter y) {
    y.c = 'z';
  }
  static void f1(Letter y) {
	    y.flo = 3.41f;
	  }
  public static void main(String[] args) {
    Letter x = new Letter();
    x.c = 'a';
    System.out.println("1: x.c: " + x.c);
    f(x);
    System.out.println("2: x.c: " + x.c);
    
    x.flo = 9.2f;
    System.out.println("1: x.flo: " + x.flo);
    f1(x);
    System.out.println("2: x.flo: " + x.flo);
  }
}

class Letter {
	  char c;
	  float flo;
}
