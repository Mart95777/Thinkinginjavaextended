package containers;

import java.util.PriorityQueue;
import java.util.Random;

class Ex11int implements Comparable<Ex11int> {
	Random rnd = new Random();
	Integer in = rnd.nextInt(100);
	public int compareTo(Ex11int ex11int){
		int i = this.in - ex11int.in;
		return (i<0 ? -1 : (i == 0) ? 0 : 1);
	}
	public String toString(){
		return Integer.toString(in);
	}
}

public class Ex11 {

	public static void main(String[] args) {
		PriorityQueue<Ex11int> pq = new PriorityQueue<Ex11int>();
		for(int i = 0; i< 10; i++) 
			pq.add(new Ex11int());
		System.out.println(pq.size());
		System.out.println(pq);
		for(int i = 0; i<pq.size(); i++){
			System.out.println(pq);
			System.out.print(pq.poll()+", ");
		}
			
	}

}
