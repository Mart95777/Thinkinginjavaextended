package basic1;
/*
 * Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three print “Fizz” instead of the number 
 * and for the multiples of five print “Buzz”. 
 * For numbers which are multiples of both three and five print “FizzBuzz”.
 */

public class FizzBuzz {

	public static void main(String[] args) {
		int reminder3 = -1;
		int reminder5 = -1;
		for(int i = 1;i<101;i++){
			reminder3 = i % 3;
			reminder5 = i % 5;
			if (reminder3 == 0 && reminder5 == 0){
				System.out.println("FizzBuzz");
			} else if (reminder3 == 0){
				System.out.println("Fizz");
			} else if (reminder5 == 0){
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
