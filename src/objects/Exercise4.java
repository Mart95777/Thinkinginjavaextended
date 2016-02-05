package objects;

public class Exercise4 {
	
	int i;
	double d;
	boolean b;
	
	public static void main(String[] args) {
		Exercise4 ex4 = new Exercise4();
		System.out.println("i: "+ex4.i);
		System.out.println("d: "+ex4.d);
		System.out.println("b: "+ex4.b);
		ex4.i = 7;
		ex4.d = 123.789;
		ex4.b = true;
		System.out.println("i: "+ex4.i);
		System.out.println("d: "+ex4.d);
		System.out.println("b: "+ex4.b);
		
		A1 a = new A1();
		System.out.println("Printing more complex access");
		System.out.println("z: "+a.b.z);
		
		System.out.println("Storage method example");
		int len = ex4.storage("123456789");
		System.out.println("storage in bytes: "+len);
	}
	
	int storage(String s) {
		return s.length() * 2;
	}

}

class A1 {
	B b;
	
	public A1(){
		b = new B();
	}
}

class B {
	int z;
}
