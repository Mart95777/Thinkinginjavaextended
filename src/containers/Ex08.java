package containers;

class Link<T> {
	T elem;
	Link<T> next;
	
	Link(T elem){
		this.elem = elem;
	}
	@Override
	public String toString(){
		if (elem == null) 
			return "null";
		return elem.toString();
	}
}

class SListIterator<T>{
	Link<T> linkcur;
	
	SListIterator(Link<T> link){
		this.linkcur = link;
	}
	public boolean hasNext(){
		return this.linkcur != null;
	}
	public Link<T> next(){
		if(this.hasNext()) this.linkcur = this.linkcur.next;
		return this.linkcur;
	}
}

class SList<T>{
	private Link<T> head = null;
	SListIterator<T> iterator(){
		return new SListIterator<T>(head);
	}
	
	public void add(T elem){
		Link<T> ln = new Link<T>(elem);
		ln.next = this.head;
		this.head = ln;
	}
	
}

public class Ex08 {

	public static void main(String[] args) {
		SList<String> sl = new SList<String>();
		//SListIterator<String> sli = sl.iterator();
		sl.add("one");
		sl.add("two");
		sl.add("three");
		sl.add("four");
		sl.add("five");
		System.out.println(sl);
		SListIterator<String> sli = sl.iterator();
		while(sli.hasNext()){
			System.out.println(sli.linkcur.elem+",");
			sli.next();
		}
	}

}
