package forLoopSorulari;

import java.util.Scanner;

public class tekrarlayanKarakter {

	public static void main(String[] args) {
		/*
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazýniz.(mülakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str=“Javaisalsoeasy”
		 * 
		 * Output: a s
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("metin gir");
		String cumle=scan.nextLine();
		
		String sepet="";
		for (int i = 0; i < cumle.length()-1; i++) {
			
			String harf=String.valueOf(cumle.charAt(i));
			
			if (cumle.indexOf(harf)!=cumle.lastIndexOf(harf) && !sepet.contains(harf)) {
				
				sepet+=cumle.charAt(i);
				
				
			}
		}
		System.out.println(sepet);
		
		
		
		
		
	}

}
