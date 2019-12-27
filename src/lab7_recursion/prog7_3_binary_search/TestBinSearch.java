package lab7_recursion.prog7_3_binary_search;

public class TestBinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinSearch bin = new BinSearch();
		boolean result = bin.search("abcdefg", 'd');
		System.out.println(result);
		boolean result2 = bin.search("abcdefg", 'x');
		System.out.println(result2);

	

	}

}
