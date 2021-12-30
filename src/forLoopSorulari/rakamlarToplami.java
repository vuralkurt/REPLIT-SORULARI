package forLoopSorulari;

import java.util.Scanner;

public class rakamlarToplami {

	public static void main(String[] args) {
		//Kullanýcýdan üç basamaklý bir sayý girmesini ve  bu sayýnýn basamaklarýnýn toplamýný bulmasýný isteyin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi gir");
		int sayi=scan.nextInt();
		
		int birler=sayi%10;
		
		int onlar=(sayi/10)%10;
		
		int yuzler=sayi/100;
		
		System.out.println("sayilarin  toplami:"+(birler+onlar+yuzler));

	}

}
