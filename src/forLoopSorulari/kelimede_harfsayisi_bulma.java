package forLoopSorulari;

import java.util.Scanner;

public class kelimede_harfsayisi_bulma {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim ve bir karakter girmesini isteyin, ardýndan döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandýðýný kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("cumle gir");
		String cumle = scan.nextLine();
        
		System.out.println("karakteri gir");
		char krk = scan.next().charAt(0);

		int sayac = 0;

		for (int i = 0; i < cumle.length() - 1; i++) {

			if (krk == cumle.substring(i).charAt(0)) {

				sayac++;
			}
		}

		System.out.println(sayac + " tane harften vardir.");
	}
}
