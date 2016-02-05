package generics;

// added class Bike to check another type
class Bike {}

public class Holder3<T> {
  private T a;
  public Holder3(T a) { this.a = a; }
  public void set(T a) { this.a = a; }
  public T get() { return a; }
  public static void main(String[] args) {
    Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
    Automobile a = h3.get(); // No cast needed
    System.out.println("a is: "+a);
    // h3.set("Not an Automobile"); // Error
    // uncomment to see
    //h3.set("Not an Automobile"); // Error
    // h3.set(1); // Error
	// uncomment to see
	// h3.set(1); // Error
    Holder3<Bike> h3a = new Holder3<Bike>(new Bike());
    Bike a1 = h3a.get();
    System.out.println("a1 is: "+a1);
    
  }
} ///:~
