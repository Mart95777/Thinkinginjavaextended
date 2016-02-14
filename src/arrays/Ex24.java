package arrays;

import java.util.Arrays;

// must implement comparable! so we create A24 like A19
class A24 implements Comparable<A24> {
	int ifield;

	public A24(int ifield) {
		super();
		this.ifield = ifield;
	}

	@Override
	public int compareTo(A24 o) {
		// TODO Auto-generated method stub
		return (this.ifield < o.ifield ? -1 : (this.ifield < o.ifield ? 0 : 1));
	}
	
	@Override
    public boolean equals(Object obj) {
		System.out.println(obj.getClass().getSimpleName());
		System.out.println("class name equals: " + (obj.getClass().getSimpleName()=="A24"));
		System.out.println("field equals: " + (this.ifield == ((A24)obj).ifield));
		return (this.ifield == ((A24)obj).ifield) ? true : false;
	}	
}


public class Ex24 {

	public static void main(String[] args) {
		A24[] a = new A24[9];
		for(int i =0; i < a.length; i++){
			a[i] = new A24(i);
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++){
			System.out.print(""+a[i].ifield+",");
		}
		System.out.println("");
		int index = Arrays.binarySearch(a, new A24(7));
		System.out.println("Index is: "+index);
	}

}
