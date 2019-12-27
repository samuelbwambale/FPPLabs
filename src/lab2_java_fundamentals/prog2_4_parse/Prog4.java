package lab2_java_fundamentals.prog2_4_parse;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = Data.records;
		String[] arr = myString.split(":|,");
		for (int i = 0; i < arr.length; i = i + 5) {
			System.out.println(arr[i]);
		}

	}

}
