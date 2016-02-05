package exceptions;

class Exerc02A {
	
	protected void f(){
		System.out.println("Inside f(), ");
	}
}

public class Exerc02 {

	public static void main(String[] args) {
		Exerc02A a = null;
		//Exerc02 ex02 = new Exerc02();
		try{
			a.f();
		}catch(Exception e){
			System.out.println("Catching... ");
			e.printStackTrace(System.out);
		}
	}
}
