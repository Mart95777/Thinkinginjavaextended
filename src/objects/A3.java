package objects;

public class A3 {
	
	private int z;
	
	public static void main(String[] arg) {
		// presenting scoping
		{
			int x = 12;
			System.out.println("1) x = "+x);
			{
				int y = 7;
				System.out.println("2) y = "+y);
				System.out.println("3) x = "+x);
			}
			// y is not available, out of scope
			// uncomment the line below to see it.
			//System.out.println("4) y = "+y);
			System.out.println("5) x = "+x);
		}
		System.out.println("= = = Presenting lack of hiding, that is in C/C++");
		{
			int x = 1;
			{
				// you cannot declare x again here
				// uncomment the line below to see it.
				//int x = 2;
			}
		}
		System.out.println("= = = Presenting scope of object");
		{
			A3 myA = new A3();
			myA.setZ(3);
			System.out.println("z = "+myA.getZ());
		}
		// end of scope myA
		// uncomment the line below to see it.
		//System.out.println("z = "+myA.getZ());
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	

}
