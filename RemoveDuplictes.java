package week2.Day1;

public class RemoveDuplictes {
	public static void main(String[] args) {

		String str="We are learning the java Basics";
		int count=0;
		String ch1="";
		String[] test=str.split(" ");

		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test.length-1; j++) {
				if(test[i].equalsIgnoreCase(test[j])){
					count++;
					if(count!=0)
						test[j]="";

				}

			}

		}
		for(String str1: test ) {
			ch1=ch1+" "+ str1;

		}
		System.out.println(ch1);
	}
}


