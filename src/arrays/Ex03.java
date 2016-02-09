package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex03 {
	
	private static double[][] f(int size1, int size2, double range1, double range2){
		double[][] d = new double[size1][size2];
		Random r = new Random();
		for(int i = 0; i<size1;i++){
			for(int j = 0; j<size2;j++){
				d[i][j] = range1 + (range2 - range1) * r.nextDouble();
			}
		}
		return d;
	}
	
	private static void print(double[][] d){
		System.out.println(Arrays.deepToString(d));
	}

	public static void main(String[] args) {
		double[][] d = f(2,3,3,5);
		print(d);
		double[][] e = f(3,3,7,10);
		print(e);
		double[][] g = f(2,2,-3,-1);
		print(g);

	}

}
