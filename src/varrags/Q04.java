package varrags;

public class Q04 {

	int yil;
	int km=2010;
	String renk="bordo";
	String model="bmw";
	boolean satilikMi;
	
	public Q04() {
		
	}

	public Q04(int yil,String renk,String model) {
		this.yil=yil;
		this.renk=renk;
		this.model=model;
	}
	public static void main(String[] args) {
		/*
		 * CONSTRUCTOR Soru 4: Create 2 constructors one is with parameters, the other
		 * one is without parameter. By using that constructors create at least 2
		 * objects then print their features on the console.
		 * 
		 * CONSTRUCTOR Soru 4: Biri parametreli, diðeri parametresiz 2 constructor
		 * oluþturun. Bu yapýcýlarý kullanarak en az 2 objectleri oluþturun ve
		 * özelliklerini konsolda yazdýrýn.
		 */

		Q04 yeni = new Q04();
		
		Q04 yeni2=new Q04(2015,"beyaz","mercedes");
		
		/*
		 * System.out.print(yeni.km+"\t"); System.out.print(yeni.yil+"\t");
		 * System.out.print(yeni.renk+"\t"); System.out.print(yeni.model+"\t");
		 * System.out.print(yeni.satilikMi+"\t");
		 */
		System.out.println(yeni.yil+" "+yeni.renk+" "+yeni.model);
		System.out.println(yeni2.yil+" "+yeni2.renk+" "+yeni2.model);
		
		
	}

}
