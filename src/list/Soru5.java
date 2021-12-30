package list;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		
		/*

		Soru5:
		Write a program that accepts an integer as input and prints first 10 prime numbers
		greater than input Check numbers if they are even or not in a return method.
		Input : 5
		Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		
		*/
		Scanner scan=new Scanner (System.in);
		System.out.println("sayiyi gir");
		int sayac=0;

		for (int i = scan.nextInt()+1; i <= Integer.MAX_VALUE; i++) {

			if (asalMi(i)) {
				System.out.print(i + "-");
				sayac++;
			}
			if (sayac==10) {
				break;
			}
		}

	}

	private static boolean asalMi(int sayi) {
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				return false;
			}

		}
		return true;
	}
		
		
	}


