package lab9_stacks_and_queues.prog9_2_symbol_bal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = "" + (char) 0;
	String filename;
	String text;
	char[] left;
	char[] right;

	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}

	public void setText(String text) {
		this.text = text;
	}

	boolean symbolsBalanced(String delimiters) {
		// implement
		Stack<Character> stack = new Stack<Character>();
		int dLen = delimiters.length();
		left = new char[dLen / 2];
		right = new char[dLen / 2];
		int indexLeft = 0, indexRight = 0;
		for (int i = 0; i < dLen; i++) {
			if (i % 2 == 0) {
				left[indexLeft++] = delimiters.charAt(i);
			} else {
				right[indexRight++] = delimiters.charAt(i);
			}
		}
		int textLen = text.length();
		for (int i = 0; i < textLen; i++) {
			char dil = text.charAt(i);
			if (hasIn(left, dil)) {
				stack.push(dil);
			}
			if (hasIn(right, dil)) {
				char dilOut = stack.pop();
				int iRight = getIndexLeftRight(right, dil);
				int iLeft = getIndexLeftRight(left, dilOut);
				if (iRight != iLeft)
					return false;
			}
		}
		if (!stack.empty())
			return false;
		return true;

	}

	public int getIndexLeftRight(char[] arrChar, char c) {
		int index = 0;
		for (int i = 0; i < arrChar.length; i++) {
			if (c == arrChar[i])
				index = i;
		}
		return index;
	}

	boolean hasIn(char[] arrChar, char c) { 
		int len = arrChar.length;
		for (int i = 0; i < len; i++) {
			if (c == arrChar[i])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("prog9_2\\Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
	}

	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\src\\";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		} catch (FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}

}
