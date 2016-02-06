package basic1;

class Node {
	private String s;
	public Node next;
	
	public Node(String s){
		this.s = s;
		//this.next = null;
	}
	
	public void printNode(){
		System.out.println("node: "+this.getS());
	}
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

public class LinkedListExample1 {
	private Node head;
	
	public LinkedListExample1() {
		head = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void add(String s){
		Node n = new Node(s);
		n.next = head;
		head = n;
	}
	
	public void printList(){
		Node n = head;
		System.out.println("Starting printing...");
		while(n != null){
			n.printNode();
			n = n.next;
		}
	}
	
	public void reversing(){
		System.out.println("REVERSING ! ...");
		Node n = head,old1 = null,old2 = null; 
		// first node, next should not be null, if there are at least 2 elements
		if (n.next != null){
			head = n.next;
			old1 = n;
			n = n.next;
			// going further, second node/element:
			if (n.next != null){
				head = n.next;
				old2 = old1;
				old1 = n;
				n = n.next;
				old2.next = null;
				// going to third, and so on
				while(n.next != null){
					head = n.next;
					old1.next = old2;
					old2 = old1;
					old1 = n;
					n = n.next;
				}
				// last needed reconnections
				old1.next = old2;
				n.next = old1;
			} else {
				// last needed reconnections, old2 is null!
				old1.next = old2;
				n.next = old1;
			}		
		}
		// the end, just having one element, no need for else

	}

	public static void main(String[] args) {
		LinkedListExample1 liliex = new LinkedListExample1();
		liliex.add("1_first");
		liliex.add("2_second");
		liliex.add("3_third");
		liliex.add("4_fourth");
		liliex.add("5_fifth");
		liliex.add("6_sixth");
		liliex.add("7_seventh");
		liliex.add("8_eight");
		liliex.add("9_ninth");
		liliex.add("10_tenth");
		liliex.printList();
		
		liliex.reversing();
		liliex.printList();
		
	}

}


