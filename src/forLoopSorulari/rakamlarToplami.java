package forLoopSorulari;

import java.util.Scanner;

public class rakamlarToplami {

	public static void main(String[] args) {
		//Kullan�c�dan �� basamakl� bir say� girmesini ve  bu say�n�n basamaklar�n�n toplam�n� bulmas�n� isteyin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi gir");
		int sayi=scan.nextInt();
		
		int birler=sayi%10;
		
		int onlar=(sayi/10)%10;
		
		int yuzler=sayi/100;
		
		System.out.println("sayilarin  toplami:"+(birler+onlar+yuzler));

	}

}
