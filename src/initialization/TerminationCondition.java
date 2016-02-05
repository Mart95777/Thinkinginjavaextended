package initialization;

class Book {
	  boolean checkedOut = false;
	  Book(boolean checkOut) {
	    checkedOut = checkOut;
	  }
	  void checkIn() {
	    checkedOut = false;
	  }
	  protected void finalize() {
		  System.out.println("Finalize always called");
	    if(checkedOut)
	      System.out.println("Error: checked out");
	    else
	    	System.out.println("Everything ok!");
	    // Normally, you'll also do this:
	    // super.finalize(); // Call the base-class version
	  }
	}

	public class TerminationCondition {
	  public static void main(String[] args) {
	    Book novel = new Book(true);
	    // Proper cleanup:
	    novel.checkIn();
	    // Drop the reference, forget to clean up:
	    new Book(true);
	    //novel.checkIn();
	    // Force garbage collection & finalization:
	    System.gc();
	  }
	}
