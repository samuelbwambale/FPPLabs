package lab6_innerclasses.prog6_4_comparator;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"123", "12", "12345", "12", "123456789",};
		StringLengthComparator comp = new StringLengthComparator();
		
		StringSort sort = new StringSort(comp);
		sort.stringSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
