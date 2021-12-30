package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru2 {

	public static void main(String[] args) {
		/*
		 * Soru2: Create a 10-element list. Swap the 8th element with the 3rd element.
		 * INPUT : String[]
		 * names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan",
		 * "Ahmet","Ali"}; Output:
		 * [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		 * 
		 */
		
		String isim[]= {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		
		List<String>isimler=Arrays.asList(isim);
		System.out.println(isimler);
		String a=isimler.get(2);
		//System.out.println(a);
		String b=isimler.get(7);
		isimler.set(2, b);
		isimler.set(7, a);
		System.out.println();
		System.out.println(isimler);
		
		
		
		
	}

}
