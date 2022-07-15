package week2.Day1;

import java.util.Iterator;

public class ReverseEvenword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Iam a Automation Tester";

		String[] test=str.split(" ");

		for (int i = 0; i < test.length; i++) {
			if(i%2==0) {
				System.out.print(test[i]+" ");
			}else
			{
				char[] ch=str.toCharArray();

				for (int j = ch.length-1;j>=0; j--) {

					System.out.print(ch[j]);
				}
			System.out.println(" ");
			}

		}
	}
}

