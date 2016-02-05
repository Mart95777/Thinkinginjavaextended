package exceptions;

class MyException1 extends Exception {
	  public MyException1() {}
	  public MyException1(String msg) { super(msg); }
	}

	public class FullConstructorsEx1 {
	  public static void f() throws MyException {
	    System.out.println("Throwing MyException from f()");
	    throw new MyException();
	  }
	  /*
	  public static void g() throws MyException {
	    //System.out.println("Throwing MyException from g()");
	    throw new MyException("Originated in g()");
	  }
	  */
	  public static void main(String[] args) {
		//FullConstructorsEx1 fc1 = new FullConstructorsEx1();
		//fc1 = null;
		//FullConstructorsEx1 fc1 = null;
		//Object fc1 = null;
		int a[] = {1,2,3,4,5};

	    try {
		  //g();
		  //throw new Exception("Exception_1");
		  //fc1.g();
		  System.out.println(a[5]);
	      /*
	    }catch(MyException e) {
	      e.printStackTrace(System.out);
		  */
	    }catch(Exception e1) {
	      e1.printStackTrace(System.out);
	    } finally{
		  System.out.println("In finally");
		}
	  }
	}
