package control;

public class Ex2 {
	static int generateInt(){
		double d = 100 * Math.random();
		return (int)d;
	}

	
	public static void main(String[] args) {
		int myInt = 0;
		int myInt2 = 0;
		for (int i = 0; i<25;++i){
			myInt = generateInt();
			myInt2 = generateInt();
			if(myInt>myInt2)
				System.out.println("myInt: "+myInt+" grater!");
			else if (myInt<myInt2)
				System.out.println("myInt: "+myInt+" smaller!");
			else
				System.out.println("myInt: "+myInt+" equal!");
				
		}

	}

}
