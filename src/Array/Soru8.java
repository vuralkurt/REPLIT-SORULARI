package Array;

import java.util.Arrays;

public class Soru8 {

	public static void main(String[] args) {
		/*
		 * Soru8: Write a return method that accepts 2 integer Arrays as parameters And
		 * adds 2 array into a new Array and prints it. Input1={1,2,3,4} Input2={5,6}
		 * Output={1,2,3,4,5,6}
		 */
		
		int aar1[]= {1,2,3,4};
		int aar2[]= {5,6};
		
		String bos="";
		 
		for (int i = 0; i < aar1.length; i++) {
			
			bos+=aar1[i];
			
		}
		for (int i = 0; i < aar2.length; i++) {
			
			bos+=aar2[i];
			
		}
		
		System.out.println(bos);
		
		String aar3[]=bos.split("");
		System.out.println(Arrays.toString(aar3));
		
	}

}
