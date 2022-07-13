package week2.Day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test ="changeme";

		char[] ch1=test.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			if(i%2!=0) {
				ch1[i]=Character.toUpperCase(ch1[i]);
			}
			System.out.print(ch1[i]);
		}




	}

}
