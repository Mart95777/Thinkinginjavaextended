package objects;

import java.util.Date;

/**
 * Exercises from Thinking in Java, changed as needed.
 * @author marcin
 * @version 1.0
 */
public class ExerciseOneToThree {
	
	public static void main(String[] args) {
		System.out.print("Hello, it's: ");
	    System.out.println(new Date());
	    
	    B1 b = new B1();
	    System.out.println("b.i: "+ b.getI());
	    System.out.println("b.c: >"+ b.getC()+"<");
	}
	

}

class B1 {
	int i;
	char c;
	
	public B1() {};
	public B1(int i, char c) {
		super();
		this.i = i;
		this.c = c;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	
	
}
