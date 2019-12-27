package lab6_innerclasses.prog6_4_comparator;

import java.util.Arrays;

public class MainLambda {
	public static void main(String args[]) {
		String[] arr = {"123", "12", "12345", "12", "123456789",};
		
		
//		with lambda expression
		
		StringSort st1 = new StringSort((o1, o2) -> o1.length() - o2.length());
		st1.stringSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
