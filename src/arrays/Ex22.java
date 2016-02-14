package arrays;

import java.util.Arrays;

import utils.Generated;
import utils.RandomGenerator;

public class Ex22 {

	  public static void main(String[] args) {
		    String[] sa = Generated.array(new String[30], new RandomGenerator.String(5));
		    // without sort -> exception!
		    //Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		    System.out.println(Arrays.toString(sa));
		    int index = Arrays.binarySearch(sa, sa[10], String.CASE_INSENSITIVE_ORDER);
		    System.out.println("Index: "+ index + "\n"+ sa[index]);
		  }

}
