package list;

import java.util.ArrayList;
import java.util.List;

public class Soru6 {

	public static void main(String[] args) {
		/*
		 * Soru6: Write a program to find the common elements between two String Arrays
		 * (without case sensitivity) Input1 : {John,Brad,Ange,Sofia,Emily} Input2 :
		 * {sofia,brad,grace,emily,hazel} Output : [sofia,brad,emily]
		 * 
		 */
		
		String aar1[]= {"John","Brad","Ange","Sofia","Emily"};
		
		String aar2[]={"sofia","brad","grace","emily","hazel"};
		
		List<String>list=new ArrayList<>();
		
		for (int i = 0; i < aar1.length; i++) {
			
			for (int j = 0; j < aar2.length; j++) {
				
				if (aar1[i].equalsIgnoreCase(aar2[j])) {
					
					list.add(aar2[j]);
					
				}
				
			}
			
		}
		System.out.println(list);

	}

}
