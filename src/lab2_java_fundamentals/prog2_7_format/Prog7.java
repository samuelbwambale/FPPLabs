package lab2_java_fundamentals.prog2_7_format;

import lab2_java_fundamentals.prog2_2_random.RandomNumbers;

public class Prog7 {

	public static void main(String[] args) {
		for(int i = 0; i<4; i++) {
			print2Problems();
		}
	}

	static int getRandom() {
		return RandomNumbers.getRandomInt(1, 99);
	}
	
	static void print2Problems() {
		String output = "";
		output = String.format("%16d %12d %n %n", getRandom(), getRandom());
		output += String.format("%13s %2d %9s %2d %n", "+", getRandom(), "+", getRandom());
		output += String.format("%16s %12s", "____", "____");
		System.out.println(output);
		System.out.println('\n');
		System.out.println('\n');
	}

}
