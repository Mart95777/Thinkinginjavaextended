package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class CompBerylliumSphere extends BerylliumSphere implements Comparable<CompBerylliumSphere>{
	@Override
	public int compareTo(CompBerylliumSphere bsc) {
		return (this.getId() < bsc.getId() ? -1 : (this.getId() == bsc.getId() ? 0 : 1));
	}
}

class CompBerylliumSphereComparator implements Comparator<CompBerylliumSphere>{
	@Override
	public int compare(CompBerylliumSphere cbs1, CompBerylliumSphere cbs2){
		return (cbs1.getId() > cbs2.getId() ? -1 : (cbs1.getId() == cbs2.getId() ? 0 : 1));
	}
}

public class Ex21 {

	public static void main(String[] args) {

		System.out.println("Sorting as in Exercise 21, new array of c:");
		//Arrays.sort(a); // cast exception
		
		CompBerylliumSphere[] c = new CompBerylliumSphere[7];
		for (int i = 0; i<c.length;i++){
			c[i] = new CompBerylliumSphere();
		}

		Collections.shuffle(Arrays.asList(c));
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		System.out.println("Shuffle again...");
		Collections.shuffle(Arrays.asList(c));
		System.out.println(Arrays.toString(c));
		Arrays.sort(c, new CompBerylliumSphereComparator());
		System.out.println(Arrays.toString(c));
		
	}

}
