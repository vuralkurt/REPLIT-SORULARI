package Array;

public class Soru5 {

	public static void main(String[] args) {
		/*
		 * Soru5: Write a java program that calculates the average value of array
		 * elements input[]= {1,2,3,4,5,6,7} Output : 4
		 * 
		 */
		
		int aar[]= {1,2,3,4,5,6,7};
		int toplam=0;
		for (int i : aar) {
			
			toplam+=i;
			
		}
		System.out.println("Sayilarin ortalamasi:"+(toplam/aar.length));
		
	}

}
