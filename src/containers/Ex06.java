package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex06 {

  static void test(String msg, List<String> list) {
	    System.out.println("--- " + msg + " ---");
    Collection<String> c = list;
    Collection<String> subList = list.subList(1,8);
    // Copy of the sublist:
    Collection<String> c2 = new ArrayList<String>(subList);
    try { c.retainAll(c2); } catch(Exception e) {
      System.out.println("retainAll(): " + e);
    }
    try { c.removeAll(c2); } catch(Exception e) {
      System.out.println("removeAll(): " + e);
    }
    try { c.clear(); } catch(Exception e) {
      System.out.println("clear(): " + e);
    }
    try { c.add("X"); } catch(Exception e) {
      System.out.println("add(): " + e);
    }
    try { c.addAll(c2); } catch(Exception e) {
      System.out.println("addAll(): " + e);
    }
    try { c.remove("C"); } catch(Exception e) {
      System.out.println("remove(): " + e);
    }
    // The List.set() method modifies the value but
    // doesn't change the size of the data structure:
    try {
      list.set(0, "X");
    } catch(Exception e) {
      System.out.println("List.set(): " + e);
    }
    
  }
  
  static void testoptional(String msg, List<String> list) {
	  System.out.println("--- " + msg + " ---");
	    Collection<String> c = list;
	    Collection<String> subList = list.subList(1,8);
	    // Copy of the sublist:
	    Collection<String> c2 = new ArrayList<String>(subList);
	 // optional
	    System.out.println("optional beginning:" + c);
	    try{ c.removeAll(c2); } catch(Exception e) {
	        System.out.println("optional removeAll() in catch!!!: " + e);
	      }
	    System.out.println("optional removeAll():" + c);
	    try{ c.addAll(c2); c.addAll(c2); } catch(Exception e) {
	        System.out.println("optional addAll() in catch!!!: " + e);
	      }
	    System.out.println("optional addAll():" + c);
	    try{ c.remove("D"); } catch(Exception e) {
	        System.out.println("optional remove(\"D\"):  in catch!!!" + e);
	      }
	    System.out.println("optional remove(\"D\"):!" + c);
	    try{ c.retainAll(c2); } catch(Exception e) {
	        System.out.println("optional retainAll() in catch!!!: " + e);
	      }
	    System.out.println("optional retainAll():" + c);
	    try{ c.clear(); } catch(Exception e) {
	        System.out.println("optional clear() in catch!!!: " + e);
	      }
	    System.out.println("optional clear():" + c);
  }
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
	    test("Modifiable Copy", new ArrayList<String>(list));
	    test("Arrays.asList()", list);
	    test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));
	    List<String> list1 = Arrays.asList("A B C D E F G H I J K L".split(" "));
	    // uncomment one of the 2 below to see effects:
	    testoptional("optional",new ArrayList<String>(list1));
	    //testoptional("optional",list1);
	}

}
