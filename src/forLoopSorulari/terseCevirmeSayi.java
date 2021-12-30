package forLoopSorulari;

import java.util.Scanner;

public class terseCevirmeSayi {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("sayi gir");
		int sayi=scan.nextInt();
		
		String sepet="";
		
		while(sayi>0) {
			
		int	sonuc=sayi%10;
		String sonucc=String.valueOf(sonuc);
		sepet+=sonucc;
		sayi/=10;
			
			
		}
		
		System.out.println(sepet);

	}

}
