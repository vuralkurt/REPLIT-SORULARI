package varrags;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * VARARGS Soru 1: Birden fazla tamsay� kabul eden bir d�n�� metodu yaz�n�z.
		 * parametresi ve tam say�lar�n toplam�n� yazd�r�r Y�ntem ad� = y�ntemi
		 * �a��r�rsan�z toplam bunun gibi 
		 * toplam(1,2,3) ��kt� =6;
		 *  toplam(1,2,3,4,5) ��kt�=15;
		 *   toplam(1,2) ��kt�=3
		 * 
		 */
		
		topla(20,4,5,6);
		
		System.out.println(topla(20,4,5,6));
		
		
	}

	private static int topla(int ...sayilar) {
		
		int toplam=0;
		
		for (int i : sayilar) {
			toplam+=i;
		}
		return toplam;
		
	}

}
