package lab2_java_fundamentals.prog2_3_round;

public class Prog3 {

	public static void main(String[] args) {

		float a = 1.27f;
		float b = 3.881f;
		float c = 9.6f;
		int sum = (int) (a + b + c);
		System.out.println("The sum of the floats as an integer is: " + sum);

		int roundedSum = (int) Math.round(a + b + c);
		System.out
				.println("The sum of the floats obtained by rounding the sum to the nearest integer is: " + roundedSum);

	}

}
