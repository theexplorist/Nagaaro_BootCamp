class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {

		int l = 0, r = 0;

		int[] arr = new int[128];
		int maxL = 0, count = 0;
		while (r < s.length()) {

			if (arr[s.charAt(r)] == 0) {
				
				count++;
			}
            
            arr[s.charAt(r)]++;

            System.out.println(count);
            
			while (count > k) {
                System.out.println(l + " ***");
				char c = s.charAt(l);
				arr[c]--;
				l++;

				if (arr[c] == 0) {
					count--;
				}
                
			}

			maxL = Math.max(maxL, r - l + 1);
            System.out.println(maxL);
			r++;
		}
		return maxL;
	}
}
