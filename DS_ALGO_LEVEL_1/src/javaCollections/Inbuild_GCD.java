package javaCollections;

import java.math.BigInteger;

public class Inbuild_GCD {
	
	public static void main(String[] args) {
		
		BigInteger a = new BigInteger("55");
		
		BigInteger b = new BigInteger("5");
		
		int ans = a.gcd(b).intValue();
		
		System.out.println("GCD IS "+ans);
	}

}
