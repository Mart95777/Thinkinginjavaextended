package operators;

public class Exponents {
	public static void main(String[] args) {
	    // Uppercase and lowercase 'e' are the same:
	    float expFloat = 1.39e-43f;
	    expFloat = 1.39E-43f;
	    System.out.println(expFloat);
	    double expDouble = 47e47d; // 'd' is optional
	    double expDouble2 = 47e47; // Automatically double
	    System.out.println(expDouble);
	    System.out.println("Float:");
	    System.out.println("MAX_VALUE:"+Float.MAX_VALUE);
	    System.out.println("MIN_VALUE:"+Float.MIN_VALUE);
	    System.out.println("MAX_EXPONENT:"+Float.MAX_EXPONENT);
	    System.out.println("MIN_EXPONENT:"+Float.MIN_EXPONENT);
	    System.out.println("MIN_NORMAL:"+Float.MIN_NORMAL);
	    
	    System.out.println("Double:");
	    System.out.println("MAX_VALUE:"+Double.MAX_VALUE);
	    System.out.println("MIN_VALUE:"+Double.MIN_VALUE);
	    System.out.println("MAX_EXPONENT:"+Double.MAX_EXPONENT);
	    System.out.println("MIN_EXPONENT:"+Double.MIN_EXPONENT);
	    System.out.println("MIN_NORMAL:"+Double.MIN_NORMAL);
	}
}
