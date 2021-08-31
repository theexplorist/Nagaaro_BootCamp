package Nagarro_Web_1c;

public class Search_in_Rotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Search(int[] arr, int item) {
		{

			int lo = 0;
			int hi = arr.length - 1;

			while (lo <= hi) {

				int mid = (lo + hi) / 2;
				if (arr[mid] == item) {
					return mid;
				} else if (arr[lo] <= arr[mid]) {
					if (arr[lo] <= item && item < arr[mid]) {
						hi = mid - 1;

					} else {
						lo = mid + 1;
					}

				} 
				else {
                    if(arr[hi]>=item && item>arr[mid]) {
                    	lo=mid+1;
                    }
                    else {
                    	hi=mid-1;
                    }
				}

			}
			return -1;

		}
	}

}
