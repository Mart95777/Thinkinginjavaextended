package basic1;

public class PowerNRecursively {
	
	private static long pn(long b, int n){
		long c;
		if (n == 1) return b;
		else if (n % 2 == 0){
			c = pn(b,n/2);
			return c*c;
		}else{
			return b*pn(b,n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Recursively calculating a number to the power n.");
		long b = 2;
		int n = 7;
		
		long result = pn(b,n);
		System.out.println(""+b+" to the power "+n+" is: "+result);

	}

}
