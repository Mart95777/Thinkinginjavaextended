package arrays;

class Aex08<T>{
  T[] array; // OK
  @SuppressWarnings("unchecked")
  public Aex08(int size) {
    array = (T[])new Object[size]; // "unchecked" Warning
  }
}


public class Ex08 {

	public static void main(String[] args) {
		System.out.println("Case with String");
		Aex08<String> a1 = new Aex08<String>(3);
		System.out.println("1) "+a1.getClass());
		System.out.println("2) "+a1.array);
		//below causes runtime exception
		//a1.array[0] = new String("s1");
		// below is compile time: cannot convert Integer to String
		//a1.array[1] = new Integer(5);
		
		System.out.println("Case with Object");
		Aex08<Object> a2 = new Aex08<Object>(3);
		a2.array[0] = new String("s1x");
		// below is ok!
		a2.array[1] = new Integer(5);
		System.out.println(a2);
	}

}
