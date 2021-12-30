package Array;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/*
		Soru1:
			Write a return method to reverse number.
			Input : 12345
			Output : 54321
		*/
		
	    
	    
		
	
		
		System.out.println(ters());
		
		

	}

	@SuppressWarnings("resource")
	private static String ters() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi gir");    
		int sayi=scan.nextInt();
		
		    
		    String bos="";
		    int basamak;
		    
           while (sayi>0) {
        	  basamak=sayi%10;
        	  bos+=basamak;
        	  sayi/=10;
        		
			
		}
		return bos;
		
	}

	

}
