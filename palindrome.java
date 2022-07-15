package week2.Day1;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="mom";
		String rev=" ";
		char[] ch=str.toCharArray();

		for (int i = ch.length-1;i>=0; i--) {

			rev=rev+ch[i];

		}
		System.out.println(rev);

		if(str.equalsIgnoreCase(rev)) {
			System.out.println("is palindrom");
		}else
		{
			System.out.println("not palindrome");
		}
	}
}

