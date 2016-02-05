package exceptions;

public class Exerc01 {

	public static void main(String[] args) {
		System.out.println("Beginning");
		try{
			throw new Exception("this is message of the exception");
		}catch(Exception e){
			System.out.println("Catching exception: ");
			e.printStackTrace(System.out);
		}finally{
			System.out.println("In finally");
		}
	}
}
