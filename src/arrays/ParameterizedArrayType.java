package arrays;

import java.util.Arrays;

class ClassParameter<T> {
  public T[] f(T[] arg) { return arg; }
}

class MethodParameter {
  public static <T> T[] f(T[] arg) { return arg; }
}

public class ParameterizedArrayType {
  public static void main(String[] args) {
    Integer[] ints = { 1, 2, 3, 4, 5 };
    Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
    Integer[] ints2 = new ClassParameter<Integer>().f(ints);
    Double[] doubles2 = new ClassParameter<Double>().f(doubles);
    System.out.println("ints2: "+Arrays.deepToString(ints2));
    System.out.println("doubles2: "+Arrays.deepToString(doubles2));
    ints2 = MethodParameter.f(ints);
    doubles2 = MethodParameter.f(doubles);
    System.out.println("ints2: "+Arrays.deepToString(ints2));
    System.out.println("doubles2: "+Arrays.deepToString(doubles2));
  }
} ///:~
