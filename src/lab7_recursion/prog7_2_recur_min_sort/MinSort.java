package lab7_recursion.prog7_2_recur_min_sort;

public class MinSort {
	
	public static void main(String[] args) {
		MinSort ms = new MinSort();
		String result = ms.sort("wazibe");
		System.out.println(result);
		
	}

	public Character rmin(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		char ch = str.charAt(0);
		if (str.length() == 1)
			return ch;
		char c = rmin(str.substring(1));
		return (ch < c ? ch : c);
	}
	
	public String sort(String str) {
		if(str == null || str.length() == 0) {
			return null;
			}
		if(str.length() == 1) return str;
		char ch = rmin(str);
		int minpos = str.indexOf(ch);
		char start = str.charAt(0);
		String s2="";
		for(int i=1; i<str.length(); i++) {
			if(i==minpos) {
				s2=s2+start;
			}else {
				s2=s2+str.charAt(i);
			}
		}
		String t = str.charAt(minpos)+sort(s2);
		return t;
		
		
	}

}
