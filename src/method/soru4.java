package method;

import java.util.Arrays;
import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		
		/*
		 * Create a custom return type method accepts a name as parameter and prints the
		 * name as a char array.
		 * 
		 * (do not use toCharArray() method)
		 * 
		 * Input : John
		 * 
		 * Output :[J, o, h, n]
		 */
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("cumle gir");
		String cumle = scan.nextLine();
		
		String aar[]=cumle.split("");
		
		System.out.println(Arrays.toString(aar));
		

	}

}
