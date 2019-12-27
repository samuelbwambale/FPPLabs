package lab6_innerclasses.prog6_4_comparator;

import java.util.Arrays;
import java.util.Comparator;


public class MainAnonymous {
	public static void main(String args[]) {
		String[] arr = {"123", "12", "12345", "12", "123456789",};

		StringSort sort = new StringSort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		sort.stringSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
//		with lambda expression
		
		StringSort st1 = new StringSort((o1, o2) -> o1.length() - o2.length());
		st1.stringSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}


/*
 * */
 