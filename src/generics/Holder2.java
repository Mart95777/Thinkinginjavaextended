package generics;

public class Holder2 {
  private Object a;
  public Holder2(Object a) { this.a = a; }
  public void set(Object a) { this.a = a; }
  public Object get() { return a; }
  public static void main(String[] args) {
    Holder2 h2 = new Holder2(new Automobile());
    Automobile a = (Automobile)h2.get();
    System.out.println("h2(a) is: "+a);
    h2.set("Not an Automobile");
    String s = (String)h2.get();
    System.out.println("h2 is: "+s);
    h2.set(12345); // Autoboxes to Integer
    Integer x = (Integer)h2.get();
    System.out.println("h2(x) is: "+x);
  }
} ///:~
