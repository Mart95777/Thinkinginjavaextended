package containers;

import java.util.*;

import utils.Countries;

public class Ex01 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		List<String> b = new LinkedList<String>();
		for (int i = 0; i< Countries.DATA.length;i++){
			a.add(Countries.DATA[i][0]);
			b.add(Countries.DATA[i][0]);
		}
		Collections.sort(a);
		Collections.sort(b);
		System.out.println(a);
		System.out.println(b);
		Collections.shuffle(a);
		Collections.shuffle(b);
		System.out.println(a);
		System.out.println(b);
	}
}
