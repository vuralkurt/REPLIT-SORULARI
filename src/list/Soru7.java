package list;

import java.util.ArrayList;
import java.util.List;

public class Soru7 {

	public static void main(String[] args) {
		/*
		Soru7:
			write a Java program to removes a specific element from an array and put the remaining
			 elements in a new array and prints the new array
			Input :{1,2,3,4,5,6}
			element:6
			Output : [1,2,3,4,5]
		
		*/
		int aar[]= {1,2,3,4,5,6};
		
		List<Integer>list=new ArrayList<>();
		for (int i = 0; i < aar.length; i++) {
			
			list.add(aar[i]);
			
		}
		list.remove(5);
		System.out.println(list);
		
		

	}

}
