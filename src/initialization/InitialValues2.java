package initialization;

public class InitialValues2 {

	boolean bool = true;
	char ch = 'x';
	byte b = 47;
	short s = 0xff;
	int i = 999;
	long lng = 1;
	float f = 3.14f;
	double d = 3.14159;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MethodInit {
	  int i = f();
	  int f() { return 11; }
}
class MethodInit2 {
	  int i = f();
	  int j = g(i);
	  int f() { return 11; }
	  int g(int n) { return n * 10; }
}
class MethodInit3 {
	//! int j = g(i); // Illegal forward reference
	// uncomment line below to see
	//int j = g(i); 
	int i = f();
	int f() { return 11; }
	int g(int n) { return n * 10; }
}
