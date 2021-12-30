package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * Soru1: Write a Java program to get a String from user as input and find the
		 * maximum occurring character in that string. (Ignore case sensitivity) input :
		 * Learning java is easy output: maximum occurring character is : a
		 * 
		 */
		String metin="Learning java is easy ";
		String aar[]=metin.split("");
		
		
		System.out.println(Arrays.toString(aar));
		String enCokTekrarEden="";
		int sayac=0;
		int maxsayac=0;
		for (int i = 0; i < aar.length; i++) {
			
			for (int j = i+1; j < aar.length; j++) {
				
				if (aar[i].equalsIgnoreCase(aar[j])) {
					
					sayac++;
				
					
				}
				
			}
			if (sayac > maxsayac) {
                maxsayac = sayac;
                enCokTekrarEden = aar[i];
            } else if (sayac == maxsayac) {
                enCokTekrarEden +=  aar[i];
            }
			sayac=0;
		}
		
		
		
		 System.out.println(enCokTekrarEden);

	}

}
