package week1.Assignments;

public class ChangeOddIndexToUpperCase {
	
	
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test ="changeme";
		
		char[] ch1=test.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
			if(i%2!=0) {
				ch1[i]=Character.toUpperCase(ch1[i]);
				
			}
		}
		for (int i = 0; i < ch1.length; i++) {
			System.out.println(ch1[i]);
		}
		
	}

	
}
