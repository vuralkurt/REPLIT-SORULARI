package method;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		// Write a return method to reverse number.

		//Input : 12345

		//Output : 54321
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Sayiyi gir");
		int sayi=scan.nextInt();
		
		while (sayi!=0) {
		System.out.print(sayi%10);
		
		sayi/=10;
			
			
		}
		
	
		
		
	}

}
