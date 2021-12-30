package list;

public class Soru3 {

	public static void main(String[] args) {
		/*
		 * Soru3: Get a sentence from the user. Accept the sentence received from the
		 * user as a parameter, Invert sentence using Array and write a Method that
		 * returns the result as a String to the main method. Note: Upper and lower case
		 * letters, spaces and special characters will not be changed. 
		 * Input : It is very nice to write code. 
		 * Output :.edoc etirw ot ecin yrev si tI
		 * 
		 */
		
		String metin="It is very nice to write code.";
		
		String aar[]=metin.split("");
		System.out.println(aar.length);
		String ters="";
		for (int i = aar.length-1; i >=0 ; i--) {
			
			ters+=aar[i];
			
		}
		System.out.println(ters);
	}

}
