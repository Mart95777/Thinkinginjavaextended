package arrays;
// Autoboxing does not work with arrays

public class Ex11 {

	public static void main(String[] args) {
		// int to Integer
		Integer[] a = new Integer[2];
		a[0] = 3;
		System.out.println("a[0]: "+a[0]);
		a[0] = 4;
		System.out.println("a[0]: "+a[0]);
		// Integer to int
		int[] b = new int[3];
		b[0] = new Integer(3);
		System.out.println("b[0]: "+b[0]);
		b[0] = new Integer(4);
		System.out.println("b[0]: "+b[0]);
		// printing
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("a.getClass(): "+a.getClass());
		System.out.println("b.getClass(): "+b.getClass());
		// checking primitive int array
		int[] c = new int[]{5,7};
		System.out.println("c.getClass(): "+c.getClass());
		// assigning b to a, int to Integer:
		// compile error: type mismatch
		//a = b;

	}

}
