package objects;

public class Autobox {
	boolean b;
	Boolean b1;
	char c;
	Character c1;
	byte bt;
	Byte bt1;
	short sh;
	Short sh1;
	int i;
	Integer i1;
	long ln;
	Long ln1;
	float f;
	Float f1;
	double d;
	Double d1;
	
	
	public static void main(String[] args) {
		Autobox atb = new Autobox();
		System.out.println(atb.b);
		System.out.println(atb.b1);
		System.out.println(">"+atb.c+"<");
		System.out.println(">"+atb.c1+"<");
		System.out.println(atb.bt);
		System.out.println(atb.bt1);
		System.out.println(atb.sh);
		System.out.println(atb.sh1);
		System.out.println(atb.i);
		System.out.println(atb.i1);
		System.out.println(atb.ln);
		System.out.println(atb.ln1);
		System.out.println(atb.f);
		System.out.println(atb.f1);
		System.out.println(atb.d);
		System.out.println(atb.d1);
		atb.b1 = true;
		atb.bt1 = 27;
		atb.c1 = 'k';
		atb.d1 = 123.9876543d;
		atb.f1 = 10.7f;
		atb.i1 = 3;
		atb.ln1 = 837561845691845L;
		atb.sh1 = 212;
		
		atb.b = atb.b1;
		atb.bt = atb.bt1;
		atb.c = atb.c1;
		atb.d = atb.d1;
		atb.f = atb.f1;
		atb.i = atb.i1;
		atb.ln = atb.ln1;
		atb.sh = atb.sh1;
		
		System.out.println(atb.b);
		System.out.println(atb.b1);
		System.out.println(">"+atb.c+"<");
		System.out.println(">"+atb.c1+"<");
		System.out.println(atb.bt);
		System.out.println(atb.bt1);
		System.out.println(atb.sh);
		System.out.println(atb.sh1);
		System.out.println(atb.i);
		System.out.println(atb.i1);
		System.out.println(atb.ln);
		System.out.println(atb.ln1);
		System.out.println(atb.f);
		System.out.println(atb.f1);
		System.out.println(atb.d);
		System.out.println(atb.d1);

	}

}
