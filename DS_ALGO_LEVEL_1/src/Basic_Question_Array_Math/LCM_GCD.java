package Basic_Question_Array_Math;

import java.util.Scanner;

public class LCM_GCD {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int gcd = _gcd(a,b);
		
		System.out.println(gcd);
		
		int lcm = _lcm(a,b);
		
		System.out.println(lcm);
	}

	private static int _lcm(int a, int b) {
		// TODO Auto-generated method stub
		
		return a*b/_gcd(a,b);
		
	}

	private static int _gcd(int a, int b) {
		// TODO Auto-generated method stub
		
		if(a==0) {
			return b;
		}
		return _gcd(b%a,a);
	}
	
	

}
