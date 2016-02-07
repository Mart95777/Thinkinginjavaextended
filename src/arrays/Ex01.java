package arrays;

import java.util.Arrays;

public class Ex01 {
	
	public void f(BerylliumSphere[] ar){
		System.out.println("Beryl... array is: "+ar);
	}
	
	public <T> void f(T[] t){
		System.out.println("T array is: "+Arrays.asList(t));
	}

	public static void main(String[] args) {
		Ex01 ex1 = new Ex01();
		ex1.f(new BerylliumSphere[]{
				new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()
		});
		BerylliumSphere[] ar2 = {
			new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()
		};
		ex1.f(ar2);
		// checking generic
		ex1.f(new Long[]{
				2L,34L,(long) 567
		});

	}

}
