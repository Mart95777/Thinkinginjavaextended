package arrays;

import java.util.Arrays;

public class Ex06 {

	private static BerylliumSphere[][] func(int size1, int size2){
		BerylliumSphere[][] d = new BerylliumSphere[size1][size2];
		for(int i = 0; i<size1;i++){
			for(int j = 0; j<size2;j++){
				d[i][j] = new BerylliumSphere();
			}
		}
		return d;
	}
	
	private static void print(BerylliumSphere[][] d){
		System.out.println(Arrays.deepToString(d));
	}

	public static void main(String[] args) {
		BerylliumSphere[][] d = func(2,3);
		print(d);
	}

}
