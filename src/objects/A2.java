package objects;

public class A2 {

	public static void main(String[] args) {
		System.out.println("=== listing System.out");
		System.getProperties().list(System.out);
		System.out.println("=== listing user.name");
	    System.out.println(System.getProperty("user.name"));
	    System.out.println("=== listing java.library.path");
	    System.out.println(System.getProperty("java.library.path"));

	}

}
