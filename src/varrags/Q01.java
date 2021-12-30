package varrags;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * VARARGS Soru 1: Birden fazla tamsayý kabul eden bir dönüþ metodu yazýnýz.
		 * parametresi ve tam sayýlarýn toplamýný yazdýrýr Yöntem adý = yöntemi
		 * çaðýrýrsanýz toplam bunun gibi 
		 * toplam(1,2,3) çýktý =6;
		 *  toplam(1,2,3,4,5) çýktý=15;
		 *   toplam(1,2) çýktý=3
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
