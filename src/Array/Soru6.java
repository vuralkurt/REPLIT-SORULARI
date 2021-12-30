package Array;

import java.util.Arrays;

public class Soru6 {

	public static void main(String[] args) {
		/*
		 * Soru6: Write a method that accepts an integer array as input and prints the
		 * minimum and the maximum numbers from given array Input : {3,2,5,4,1,6} Output
		 * : min: 1 max: 6
		 * 
		 */
		
		int aar[]= {3,2,5,4,1,6};
		
		Arrays.sort(aar);
		System.out.println("Arrayin en buyuk sayisi:"+(aar.length) + "\t" +"Arrayin en kucuk sayisi:"+aar[0]);
	}

}
