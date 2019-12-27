package lab6_innerclasses.prog6_4_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	Comparator<String> myComparator;
	StringSort(Comparator<String> myComparator){
		this.myComparator = myComparator;
	}
	
	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, myComparator);
		return arr;
	}

}
