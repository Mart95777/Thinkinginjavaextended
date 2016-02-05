package control;

public class BreakAndContinue {
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
	    for(int i = 0; i < 100; i++) {
	      if(i == 74) break; // Out of for loop
	      if(i % 9 != 0) continue; // Next iteration
	      System.out.print(i + " ");
	    }
	    System.out.println();
	    // Using foreach:
	    for(int i : range(100)) {
	      if(i == 74) break; // Out of for loop
	      if(i % 9 != 0) continue; // Next iteration
	      System.out.print(i + " ");
	    }
	    System.out.println();
	    int i = 0;
	    // An "infinite loop":
	    while(true) {
	      i++;
	      int j = i * 27;
	      if(j == 1269) break; // Out of loop
	      if(i % 10 != 0) continue; // Top of loop
	      System.out.print(i + " ");
	    }
	  }
	} 
