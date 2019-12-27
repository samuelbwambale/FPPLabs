package lab2_java_fundamentals.prog2_8_min;

public class Prog2_8 {

	public static void main(String[] args) {
		int[] myArray = { 2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0 };
		int result = minimum(myArray);
		System.out.println("Minimum in array is: " + result);

	}

	static int minimum(int[] arr) {
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}

		return min;
	}

}
