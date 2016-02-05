package initialization;

class D {
	void myMethod(){
		System.out.println("Inside myMethod()");
	}
	
	protected void finalize(){
		System.out.println("Inside finalize() for D");
	}
}

public class FinalizeCheckIt {
	
	void innerMethod(){
		D d = new D();
		d.myMethod();
	}

	public static void main(String[] args) {
		FinalizeCheckIt f = new FinalizeCheckIt();
		f.innerMethod();
		System.out.println("After myMethod(), d cannot be called\n-->Note, that garbage collector does not need to be called,\n-->so you do not see finalize");
		
		

	}

}
