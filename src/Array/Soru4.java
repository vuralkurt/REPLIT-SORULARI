package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		/*
		Soru4:
			Create a custom return type method accepts a name as parameter and prints the name as a char array.
			(do not use toCharArray() method)
			Input : John
			Output :[J, o, h, n]
			
		*/
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Metni gir");
		String metin=scan.next();
		
		String aar[]=metin.split("");
		
		System.out.println(Arrays.toString(aar));
		
		

	}

}
