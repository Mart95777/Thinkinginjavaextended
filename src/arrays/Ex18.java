package arrays;

import java.util.Arrays;

public class Ex18 {

	public static void main(String[] args) {
		BerylliumSphere[] a = new BerylliumSphere[5];
		for (int i = 0; i < a.length; i++){
			a[i] = new BerylliumSphere();
		}
		System.out.println(Arrays.toString(a));
		BerylliumSphere[] b = new BerylliumSphere[7];
		System.out.println(Arrays.toString(b));
		// generating in b
		for (int i = 0; i < b.length; i++){
			b[i] = new BerylliumSphere();
		}
		System.out.println(Arrays.toString(b));
		// testing copying
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println(Arrays.toString(b));
	}

}
