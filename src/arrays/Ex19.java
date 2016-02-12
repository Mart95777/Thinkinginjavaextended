package arrays;

import java.util.Arrays;

class A19{
	int ifield;

	public A19(int ifield) {
		super();
		this.ifield = ifield;
	}
}

class A19a{
	int ifield;

	public A19a(int ifield) {
		super();
		this.ifield = ifield;
	}
	
	@Override
    public boolean equals(Object obj) {
		System.out.println(obj.getClass().getSimpleName());
		System.out.println("class name equals: " + (obj.getClass().getSimpleName()=="A19a"));
		System.out.println("field equals: " + (this.ifield == ((A19a)obj).ifield));
		// so this below does not work
		// return (obj.getClass().getSimpleName()=="A19a" && this.ifield == ((A19a)obj).ifield) ? true : false;
		return (this.ifield == ((A19a)obj).ifield) ? true : false;
	}	
}

public class Ex19 {

	public static void main(String[] args) {
		A19[] a = new A19[2];
		for(int i =0; i < a.length; i++){
			a[i] = new A19(i);
		}
		A19[] b = new A19[2];
		for(int i =0; i < b.length; i++){
			b[i] = new A19(i);
		}
		System.out.println(Arrays.equals(a,b));
		System.out.println("Now correcting the problem in A19a class:");
		A19a[] c = new A19a[2];
		for(int i =0; i < c.length; i++){
			c[i] = new A19a(i);
		}
		A19a[] d = new A19a[2];
		for(int i =0; i < d.length; i++){
			d[i] = new A19a(i);
		}
		System.out.println("Corrected equals gives: "+Arrays.equals(c,d));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}

}
