package objects;

public class StaticKeywordExample {
	static int i = 10;
	
	public static void main(String[] args) {
		StaticKeywordExample ske1 = new StaticKeywordExample();
		StaticKeywordExample ske2 = new StaticKeywordExample();
		
		System.out.println("ske1: "+ske1.i);
		System.out.println("ske2: "+ske2.i);
		StaticKeywordExample.i++;
		System.out.println("ske1: "+ske1.i);
		System.out.println("ske2: "+ske2.i);
		Incrementable.increment();
		System.out.println("ske1: "+ske1.i);
		System.out.println("ske2: "+ske2.i);
	}

}

class Incrementable {
	static void increment() {StaticKeywordExample.i++;}
}
