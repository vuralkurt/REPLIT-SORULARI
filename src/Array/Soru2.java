package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
		Soru2:
			Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
			Input : Coding is greate.
			Output : .etaerg si gnidoC
		
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Metin gir");    
		String metin=scan.nextLine();
		
		String aar[]=metin.split("");
		//System.out.println(Arrays.toString(aar));
		String bos="";
		
		for (int i = aar.length-1; i >=0 ; i--) {
			
			bos+=aar[i];
			
		}
		
		System.out.println(bos);
		
	}

}
