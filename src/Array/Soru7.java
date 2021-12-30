package Array;

public class Soru7 {

	public static void main(String[] args) {
		/*
		 * Soru7: Write a method that accepts an array as parameter and returns sum off
		 * all elements in the array Then print the result in the main method. Eg :
		 * input : {1,2,3,4,5,6,7,8}; output: 36
		 */
		
		int aar[]= {3,6,5,10,4,9,8,7};
		int toplam=0;
		for (int i : aar) {
			
			toplam+=i;
			
		}
		
		System.out.println("Sayilarin toplami:"+toplam);
	}

}
