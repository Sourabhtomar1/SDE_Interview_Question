/**
 * 
 */
package javaCollections;

import java.util.Arrays;

/**
 * @author Sourabh
 *
 */
public class Inbuild_BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,3,5,6};
		
		int key = 4;
		
		int index = Arrays.binarySearch(arr, key);
		
		System.out.println("Index of "+key+" is "+(-index-1));

	}

}
