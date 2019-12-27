package lab2_java_fundamentals.prog2_2_random;

import lab2_java_fundamentals.prog2_2_random.RandomNumbers;

public class Prog2 {
	
	public static void main(String[] args) {
		
		// get a random number x in the range 1 .. 9 and compute π to the power x
		int x = RandomNumbers.getRandomInt(1,9);
		double piPowerX = Math.pow(Math.PI,x);
		System.out.println("π to the power x is: " + piPowerX);
		
		// get a random number y in the range 3 .. 14 and compute y to the power π
		int y = RandomNumbers.getRandomInt(3,14);
		double yPowerPi = Math.pow(y, Math.PI);
		System.out.println("y to power π is: " + yPowerPi);

	}
	
}
