package forLoopSorulari;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {

		//Girilen zaman� saniyeye �eviren bir program yaz�n�z.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("saniye gir");
		int saniye=scan.nextInt();
		
		int saat=saniye/3600;
		
		int saatkalan=saniye%3600;
		
		int dakika=saatkalan/60;
		
		int saniye1=saatkalan%60;
		
		System.out.println(saat+"saat "+dakika+" dakika "+saniye1+"saniye");

	}

}
