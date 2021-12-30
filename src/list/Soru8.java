package list;

import java.util.Arrays;
import java.util.Scanner;

public class Soru8 {

	public static void main(String[] args) {
		/*
		 * Soru8: Write a java program which accept a sentence as parameter, than
		 * reverses sentence by using StringBuilder and checks if sentence is palindrome
		 * or not (without case sensitivity).Use StringBuilder. Input : I love Java.
		 * Output: Reversed sentence : avaJ evol I. It is not a palindrome"
		 * 
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Metni gir");
		String metin=scan.nextLine();
		
		String aar[]=metin.split("");
		String bos="";
		
		for (int i = aar.length-1; i >= 0; i--) {
			
			bos+=aar[i];
			
		}
		System.out.println(bos);
		
		if (bos.equals(metin)) {
			System.out.println("Metin polidrom");
			
		}else System.out.println("Metin polidrome degil");

	}

}
