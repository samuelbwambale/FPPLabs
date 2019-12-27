package lab2_java_fundamentals.prog2_6_remove_str_dups;

import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		String[] myArray = { "Des Moines", "Cedar Rapids", "Des Moines", "Fairfield"};
		boolean dups = noDuplicates(myArray);
		System.out.println("Are there any duplicates: " + dups);
		String[] result = removeDups(myArray);
		
		System.out.println("The unique elementsa are: " + Arrays.toString(result));
	}
	
	static boolean noDuplicates(String[] arr) {
		boolean dup = true;
		for (int k=0; k< arr.length; k++) {
			for(int q=k+1; q< arr.length; q++) {
				if (arr[k].equals(arr[q])) {
					dup = false;
				}
				
			}
			
		}
		return dup;
		
	}

	static String[] removeDups(String[] arr) {
		int uniqueElements = arr.length;
		for (int i = 0; i < uniqueElements; i++) {
			for (int j = i+1; j < uniqueElements; j++) {
				if (arr[i].equals(arr[j])) {
					arr[j] = arr[uniqueElements - 1];
					uniqueElements--;
					j--;
				} 
			}
		}
		
		String[] newArray = Arrays.copyOf(arr, uniqueElements);
		return newArray;

	}

}
