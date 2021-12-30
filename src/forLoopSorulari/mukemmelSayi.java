package forLoopSorulari;

import java.util.Scanner;

public class mukemmelSayi {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("sayi gir");
		int sayi=scan.nextInt();
		int bolenlerTop=0;
		for (int i = 1; i <sayi; i++) {
			
			if(sayi%i==0) {
				bolenlerTop+=i;
			}
		} if (bolenlerTop==sayi) {
			System.out.println("sayi mukemmel");
			
		}else System.out.println("sayi mukemmel degildir");
		
		
		
		

	}

}
