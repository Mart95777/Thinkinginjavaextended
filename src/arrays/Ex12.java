package arrays;

import java.util.Arrays;

import utils.ConvertTo;
import utils.CountingGenerator;
import utils.Generated;

public class Ex12 {
	
	public static void main(String[] args) {
		double[] d = ConvertTo.primitive(Generated.array(Double.class,new CountingGenerator.Double(),3));
		System.out.println("d: "+Arrays.toString(d));
	}

}
