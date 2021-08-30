package Naggarro_Web_C;

public class Minimum_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(MinimumWindow(s, t));

	}

	public static String MinimumWindow(String s, String t) {

		int[] frqt = new int[256];
		int[] frqs = new int[256];
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			frqt[ch]++;

		}

		int count = 0;
		int ws = Integer.MAX_VALUE;
		int start = -1;
		int si = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			frqs[ch]++;
			if (frqt[ch] >= frqs[ch]) {
				
				count++;
			}
  
			if (count == t.length()) {
				System.out.println(count);
				System.out.println(si);
				while (frqs[s.charAt(si)] > frqt[s.charAt(si)]) {
					if (frqt[s.charAt(si)] != 0) {
						frqs[s.charAt(si)]--;
					}
					si++;
				}
				if(ws>i-si+1) {
					ws=i-si+1;
					
					start=si;
				}
				
			}

		}
		if(start==-1) {
			return "";
		}
		
		return s.substring(start,start+ws);

	}

}
