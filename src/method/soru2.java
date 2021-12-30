package method;

import java.util.Arrays;
import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a Java program that reverse a sentence by using Array (with all spaces
		 * and special characters).
		 * 
		 * Input : Coding is greate.
		 * 
		 * Output : .etaerg si gnidoC
		 */
		
         Scanner scan=new Scanner (System.in);
		
		System.out.println("cumle gir");
		String cumle=scan.nextLine();
		/*
		String sepet="";
		
		for (int i = cumle.length()-1; i >=0; i--) {
			
			sepet+=cumle.charAt(i);
			
		}
		
		System.out.println(sepet);
		*/
		String aar[]=cumle.split("");
		
		System.out.println(Arrays.toString(aar));
		
		for (int i =  aar.length-1; i >=0; i--) {
			
			System.out.print(aar[i]);
			
		}
		
	}

}
