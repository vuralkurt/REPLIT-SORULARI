package forLoopSorulari;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dakika giriniz");
		
		int dakika=scan.nextInt();
		
		
		int kalan=dakika%525600;
		
		
		System.out.println(dakika/525600+"yildir"+kalan/(60*24)+"gundur");

	}

}
