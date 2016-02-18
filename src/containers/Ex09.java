package containers;

import java.util.TreeSet;

import utils.RandomGenerator;

public class Ex09 {
	
	public static void main(String[] args) {
		TreeSet<String> a = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		RandomGenerator.String rgenstr = new RandomGenerator.String(4);
		for (int i = 0; i<15;i++){
			a.add(rgenstr.next());
		}
		System.out.println(a);
	}

}
