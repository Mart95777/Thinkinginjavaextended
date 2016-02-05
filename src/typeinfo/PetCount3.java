package typeinfo;
//Using isInstance()
import typeinfo.pets.*;
import java.util.*;

public class PetCount3 {
	  static class PetCounter extends LinkedHashMap<Class<? extends Pet>,Integer> {
	    public PetCounter() {
	      //super(Map.map(LiteralPetCreator.allTypes, 0));
	      List<Class<? extends Pet>> list1 = LiteralPetCreator.allTypes;
	      Map<Class<? extends Pet>,Integer> map1 = new LinkedHashMap<Class<? extends Pet>,Integer>();
	      Integer counter = 0;
	      for (Class<? extends Pet> i : list1){
	    	  map1.put(i, counter++);
	      }
	      
	    }
	    public void count(Pet pet) {
	      // Class.isInstance() eliminates instanceofs:
	      for(Map.Entry<Class<? extends Pet>,Integer> pair
	          : entrySet())
	        if(pair.getKey().isInstance(pet))
	          put(pair.getKey(), pair.getValue() + 1);
	    }	
	    public String toString() {
	      StringBuilder result = new StringBuilder("{");
	      for(Map.Entry<Class<? extends Pet>,Integer> pair
	          : entrySet()) {
	        result.append(pair.getKey().getSimpleName());
	        result.append("=");
	        result.append(pair.getValue());
	        result.append(", ");
	      }
	      result.delete(result.length()-2, result.length());
	      result.append("}");
	      return result.toString();
	    }
	  }	
	  public static void main(String[] args) {
	    PetCounter petCount = new PetCounter();
	    for(Pet pet : Pets.createArray(20)) {
	      System.out.print(pet.getClass().getSimpleName() + " ");
	      petCount.count(pet);
	    }
	    System.out.println();
	    System.out.println(petCount);
	  }
	}