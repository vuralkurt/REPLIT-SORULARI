package method;

import java.util.Scanner;

public class soru3 {
	public static void main(String[] args) {
		/*
		 * Write a method which accepts a String as parameter and prints the sum of the
		 * digits, present in the given string.
		 * 
		 * input : ade1r4d3
		 * 
		 * output : 8
		 * 
		 * Hint : Use Character.isDigit() Integer.valueOf()
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("cumle gir");
		String cumle = scan.nextLine();
		
		cevrim(cumle);
		
		System.out.println(cevrim(cumle));
	}

	private static int cevrim(String cumle) {
		
		int toplam=0;
		String aar[]=cumle.split("");
		
		for (int i = 0; i < aar.length; i++) {
			char krk=aar[i].charAt(0);
			
			if (Character.isDigit(krk)) {
				
				toplam+=Integer.valueOf(aar[i]);
				
			}
			
		}
		return toplam;
	
		
	}

}
