package lab7_recursion.prog7_4_divide_sort;

import java.util.ArrayList;
import java.util.List;

public class DivideSort {
	
	public static void main(String[] args) {
		DivideSort sort = new DivideSort();
		String myString = "xzylemicable";
		String result = sort.divideSort(myString);
		System.out.println(result);
		
		List<String> myList = new ArrayList<String>();
		myList.add(myString);
		myList.add(result);
		System.out.println(myList);
	}
	
	String divideSort(String s) {
		if(s.length() == 0 || s.length() == 1) return s;
		int mid = s.length() / 2;
		String sLeft = divideSort(s.substring(0,mid));
		String sRight = divideSort(s.substring(mid,s.length()));
		
		var merger = new Merge();
		String str = merger.merge(sLeft, sRight);
		return str;
	}

}
