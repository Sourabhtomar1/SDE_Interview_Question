import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sourabh
 *
 */
public class Digit_frequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		HashMap<Integer, Integer> freq = new HashMap<>();
		
		while(number > 0) {
			
			int rem = number % 10;
			
			freq.put(rem, freq.get(rem) == null ? 1 : freq.get(rem)+1);
			
			number = number / 10;
		}
		
		System.out.println("Enter Number to Get Freq ");
		
		int num = input.nextInt();
		
		System.out.println("Freq of intered number "+freq.get(num));  
		
		

	}

}
