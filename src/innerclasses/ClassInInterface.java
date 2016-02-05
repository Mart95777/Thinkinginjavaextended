package innerclasses;
//{main: ClassInInterface$Test}

public interface ClassInInterface {
	  void howdy();
	  public static class Test implements ClassInInterface {
	    public void howdy() {
	      System.out.println("Howdy!");
	    }
	    public static void main(String[] args) {
	      new Test().howdy();
	    }
	  }
	}
