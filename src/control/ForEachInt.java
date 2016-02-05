package control;

public class ForEachInt {
	
	public static int[] range(int j){
		int[] k = new int[j];
		for(int i=0; i<j;i++){
			k[i] = i;
		}
		return k;
	}
	
	public static int[] range(int j,int m){
		int[] k = new int[m-j];
		for(int i=j, a = 0; i<m;i++,a++){
			k[a] = i;
		}
		return k;
	}
	
	public static int[] range(int j,int m, int n){
		
		int[] k = new int[(m-j)/n];
		for(int i=j,a = 0; i<m;i+=n,a++){
			k[a] = i;
		}
		return k;
	}
	
	public static void main(String[] args) {
	    for(int i : range(10)) // 0..9
	      System.out.print(i + " ");
	    System.out.println();
	    for(int i : range(5, 10)) // 5..9
	      System.out.print(i + " ");
	    System.out.println();
	    for(int i : range(5, 20, 3)) // 5..20 step 3
	      System.out.print(i + " ");
	    System.out.println();
	  }
	}
