package varrags;

public class Constructors03 {

	/*
	 * CONSTRUCTOR Soru 3: Create a student's variables in the main method and use
	 * this assign variables create a method named Changename, student as parameter
	 * get the information and change all the information in the method and add the
	 * new information have it print The line where we call the Rename method in the
	 * Main method is immediately then reprint student information Create a method
	 * named changesurname, this method is "lastname" as parameter get the variable.
	 * In the method, ask the user to enter a new last name and change the old last
	 * name (i.e. can).
	 * 
	 * YAPILANDIRICI Soru 3: Ana metotta bir öðrenci deðiþkeni oluþturun ve bu
	 * deðiþkenleri atamak için Changename adýnda bir metot oluþturun, parametre
	 * olarak öðrenci bilgiyi alýn ve metottaki tüm bilgileri deðiþtirin ve yeni
	 * bilgileri ekleyin yazdýrsýn çaðýrdýðýmýz satýrý Main yöntemindeki Rename
	 * yöntemi hemen ardýndan öðrenci bilgilerini yeniden yazdýrýr changeurname adlý
	 * bir yöntem oluþturun, parametre deðiþkeni alýrken bu yöntem "lastname" olur.
	 * Yöntemde, kullanýcýdan yeni bir soyadý girmesini ve eski soyadýný
	 * deðiþtirmesini isteyin (yani can).
	 * 
	 */
	String name = "Ali";
	String surname = "Veli";
	int age = 49;
	String country = "Elli";

	
	public static void yaz(Constructors03 obj) {
		
		System.out.println("Adi    : " + obj.name + "\nSoyadi : " + obj.surname + "\nYasi   : " + obj.age
				+ "\nUlke   : " + obj.country);
	}

	public Constructors03() {

	}

	public Constructors03(String name, String surname, int age, String country) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.country = country;

	}

	public static void main(String[] args) {

		Constructors03 me = new Constructors03("Vural","Kurt",41,"Vouvry");
		Constructors03 you = new Constructors03();
		yaz(me);
		System.out.println("\n==============\n");
		yaz(you);

	}

}
