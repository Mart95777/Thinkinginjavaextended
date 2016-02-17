package containers;

import java.util.*;
import utils.*;

public class Ex07 {
	
	private static Iterator<String> it;
	private static ListIterator<String> lita;
	private static ListIterator<String> litb;
	
	public static void basicTest(List<String> a,List<String> b) {
		System.out.println("--- printing simple ---");
		System.out.println(a);
		System.out.println(b);
		System.out.println("--- printing with iterator ---");
		it = a.iterator();
		while(it.hasNext()) 
			System.out.print(it.next()+", ");
		System.out.println();
		it = b.iterator();
		while(it.hasNext()) 
			System.out.print(it.next()+", ");
		System.out.println();
		System.out.println("--- inserting b to a in forward order ---");
		lita = a.listIterator();
		litb = b.listIterator();
		while(lita.hasNext()){
			lita.add(litb.next());
			lita.next();
		}
		System.out.println(a);
		System.out.println("--- removing... ---");
		a.removeAll(b);
		System.out.println(a);
		System.out.println("--- adding all... ---");
		a.addAll(b);
		System.out.println(a);
		System.out.println("--- inserting in reverse order ---");
		lita = a.listIterator();
		litb = b.listIterator(b.size());
		String sa,sb;
		while(lita.hasNext()){
			sa = lita.next();
			sb = litb.previous();
			lita.add(sb);
			System.out.println("a: "+sa);
			System.out.println("b: "+sb);
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		basicTest(new ArrayList<String>(Countries.names(15)),new LinkedList<String>(Countries.names(15)));

	}

}
