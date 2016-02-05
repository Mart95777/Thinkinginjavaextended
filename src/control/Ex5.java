package control;

/**
 * 
 * @author marcin
 *	Class finding prime numbers
 */
public class Ex5 {

	public static void main(String[] args) {
		int counter = 0;
		for(int i = 3;i<5001;++i){
			counter = 0;
			for(int j=2;j<i-1;++j){
				if(i % j == 0 )
					counter++;
			}
			if(counter == 0)
				System.out.println(i);
		}

	}

}
