package generics;
import typeinfo.pets.*;
import java.util.*;
import utils.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {
	  System.out.println("size of map: "+petPeople.size());
  }
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
