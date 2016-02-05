package holding;
//Arrays.asList() makes its best guess about type.

import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
  public static void main(String[] args) {
    List<Snow> snow1 = Arrays.asList(
      new Crusty(), new Slush(), new Powder());
    System.out.print("snow1: ");
    for (Snow i : snow1){
    	System.out.print(i+", ");
    }
    System.out.println(".");

    // Won't compile:
    // compiles in 1.8? 
     List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
     
     System.out.print("snow2: ");
     for (Snow i : snow2){
     	System.out.print(i+", ");
     }
     System.out.println(".");
    // Compiler says:
    // found   : java.util.List<Powder>
    // required: java.util.List<Snow>

    // Collections.addAll() doesn't get confused:
    List<Snow> snow3 = new ArrayList<Snow>();
    Collections.addAll(snow3, new Light(), new Heavy());
    System.out.print("snow3: ");
    for (Snow i : snow3){
    	System.out.print(i+", ");
    }
    System.out.println(".");

    // Give a hint using an
    // explicit type argument specification:
    List<Snow> snow4 = Arrays.<Snow>asList(
       new Light(), new Heavy());
    System.out.print("snow4: ");
    for (Snow i : snow4){
    	System.out.print(i+", ");
    }
    System.out.println(".");
  }
}