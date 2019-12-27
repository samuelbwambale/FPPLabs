package lab7_recursion.prog7_1_exponential;

public class Exponential {

	public static void main(String[] args) {
		Exponential exp = new Exponential();
		double result = exp.power(2, 20);
		System.out.println(result);
		System.out.println(Math.pow(2, 10));

	}

	double power(double x, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return x;

		return x * power(x, n - 1);
	}

}
