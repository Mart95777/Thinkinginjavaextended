package initialization;

class A {
	static{
		System.out.println("Static block A");
	}
	{
		System.out.println("Instance block A");
	}
	public A(){
		System.out.println("Constructor default A");
	}
}

class B extends A {
	static{
		System.out.println("Static block B");
	}
	{
		System.out.println("Instance block B");
	}
	public B(){
		System.out.println("Constructor default B");
	}
}

class C extends B {
	static{
		System.out.println("Static block C");
	}
	{
		System.out.println("Instance block C");
	}
	public C(){
		System.out.println("Constructor default C");
	}
}

public class CheckStaticInstanceBlock {

	public static void main(String[] args) {
		C c = new C();
		new C();
	}

}
