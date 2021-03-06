package arrays;
// Using Arrays.equals()
import java.util.*;

public class ComparingArrays {
  public static void main(String[] args) {
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    Arrays.fill(a1, 47);
    Arrays.fill(a2, 47);
    System.out.println(Arrays.equals(a1, a2));
    a2[3] = 11;
    System.out.println(Arrays.equals(a1, a2));
    System.out.println("Arrays with string:");
    String[] s1 = new String[4];
    Arrays.fill(s1, "Hi");
    String[] s2 = { new String("Hi"), new String("Hi"), new String("Hi"), new String("Hi") };
    System.out.println(Arrays.equals(s1, s2));
    System.out.println(s1==s2);
  }
} /* Output:
true
false
true
*///:~
