package operators;

/**
 * This class shows how referencing a variable works.
 * Shows copying of reference.
 */
public class Assignment {

	public static void main(String[] args) {
		Tank t1 = new Tank();
	    Tank t2 = new Tank();
	    t1.level = 9;
	    t2.level = 47;
	    System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
	    t1 = t2;
	    System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
	    t1.level = 27;
	    System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
	    
	    t1 = new Tank();
	    System.out.println("Showing the same with float");
	    t1.flo = 9.345f;
	    t2.flo = 47.91234f;
	    System.out.println("1: t1.flo: " + t1.flo + ", t2.flo: " + t2.flo);
	    t1 = t2;
	    System.out.println("2: t1.flo: " + t1.flo + ", t2.flo: " + t2.flo);
	    t1.flo = 27.3f;
	    System.out.println("3: t1.flo: " + t1.flo + ", t2.flo: " + t2.flo);

	}

}

class Tank {
	  int level;
	  float flo;
	}
