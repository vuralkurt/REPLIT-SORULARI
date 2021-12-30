package forLoopSorulari;

import java.util.Scanner;

public class obeb_okek {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan 2 tamsayý girmesini ve ardýndan GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasýný isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 */

		Scanner scan = new Scanner(System.in);

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		int enbuyuk = 0;

		if (sayi1 < sayi2) {

			for (int i = 1; i < sayi1; i++) {

				if (sayi1 % i == 0 && sayi2 % i == 0) {
					enbuyuk = i;

				}

			}



		}else for (int i = 1; i < sayi2; i++) {

			if (sayi1 % i == 0 && sayi2 % i == 0) {
				enbuyuk = i;

			}

		}
		System.out.println("GCD:" + enbuyuk);
		System.out.println("LCM:"+(sayi1*sayi2)/enbuyuk);
	}
}
