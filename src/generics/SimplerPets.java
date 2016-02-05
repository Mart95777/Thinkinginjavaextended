package generics;
import typeinfo.pets.*;
import java.util.*;
import utils.New;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Testing...
    System.out.println("size: "+petPeople.size());
    // Rest of the code is the same...
  }
} ///:~
