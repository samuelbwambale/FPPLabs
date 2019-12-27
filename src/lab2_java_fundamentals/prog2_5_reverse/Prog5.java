package lab2_java_fundamentals.prog2_5_reverse;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type any word");
		String text = sc.nextLine();
		sc.close();
		String output = "";
		for(int i = text.length() - 1; i >= 0; --i) {
			output = output + text.charAt(i);
		
		}
		System.out.println("Typed string in reverse order is: " + output);

	}

}
