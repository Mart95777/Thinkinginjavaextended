package generics;
import java.util.*;
import typeinfo.pets.*;
import utils.New;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {
	  System.out.println("size of map: "+petPeople.size());
  }
  public static void main(String[] args) {
    // f(New.map()); // Does not compile, But in 1.8 it does?
	  // uncomment
	 f(New.map()); // Does not compile, But in 1.8 it does?
  }
} ///:~
