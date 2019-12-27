package lab7_recursion.prog7_3_binary_search;

public class BinSearch {
	
	public boolean search(String str, char c) {
		if(str == null || str.length() == 0) return false;
		
		int mid = str.length() / 2;
		char ch = str.charAt(mid);
		if(ch == c) return true;
		if(ch < c) {
			return search(str.substring(mid + 1), c);
			
		}
		else {
			return search(str.substring(0,mid), c);
		}
	}

}
