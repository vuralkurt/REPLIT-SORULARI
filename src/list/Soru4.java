package list;

import java.util.ArrayList;
import java.util.List;

public class Soru4 {

	public static void main(String[] args) {
		/*
		 * Soru4: Write a program that deletes the letters 'a' from the names in the
		 * list given as input. INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
		 * OUTPUT : [Veli,Omer]
		 * 
		 */

		String aar[] = { "Ali", "Veli", "Ayse", "Fatma", "Omer","a" };
		List<String> list = new ArrayList<>();
		for (String w : aar) {

			if ( !w.contains("A") && !w.contains("a")) {

				list.add(w);
			}

		}
		System.out.println(list);
	}

}
