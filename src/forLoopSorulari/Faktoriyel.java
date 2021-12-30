package forLoopSorulari;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi gir");
		int sayi=scan.nextInt();
		int sonuc=1;
		for (int i = sayi; i > 0; i--) {
			
			sonuc*=i;
			
			
		}
     System.out.println("sonuc:"+sonuc);
	}

}
