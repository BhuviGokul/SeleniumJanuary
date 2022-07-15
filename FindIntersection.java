package week2.Day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val={3,2,11,4,6,7};
		int[] val2={1,2,8,4,9,7};

		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < val2.length; j++) {
				if(val[i]==val2[j]) {
					System.out.println(val[i]);
				}
			}
		}

	}

}
