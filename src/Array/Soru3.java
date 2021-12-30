package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		/*
		Soru3:
			Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
			input : ade1r4d3
			output : 8
			Hint :
			Use Character.isDigit()
			Integer.valueOf()
		
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Metin gir");    
		String metin=scan.nextLine();
		
		String aar[]=metin.split("");
		System.out.println(Arrays.toString(aar));
		int sepet=0;
		
		
		for (int i = 0; i < aar.length; i++) {
			
			if (Character.isDigit(aar[i].charAt(0))) {
				
				sepet+=Integer.valueOf(aar[i]);
							
				
			}
			
		}
		System.out.println(sepet);
		
		
		
		
		
	}

}
