package arrays;

import java.util.Arrays;
import java.util.Collections;

import utils.Generated;
import utils.RandomGenerator;

public class Ex23 {

	public static void main(String[] args) {
		Integer[] a = Generated.array(new Integer[15], new RandomGenerator.Integer());
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}

}
