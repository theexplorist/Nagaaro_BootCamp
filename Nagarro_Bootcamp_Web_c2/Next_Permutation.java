package Nagarro_Bootcamp_Web_c2;

import java.util.Arrays;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 9, 6, 2, 8, 3 };
		NextPermutation(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void NextPermutation(int[] arr) {
		  if(arr==null || arr.length<2){
	            return;
	        }


		int p = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		int q = 0;
		for (int i = arr.length - 1; i > p; i--) {

			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		if(p==0 && q==0) {
			reverse(arr, 0, arr.length-1);
			return;
		}

		swap(arr, p, q);
		reverse(arr, p+1, arr.length-1);

	}

	public static void reverse(int[] arr, int l, int r) {
		while (l < r) {
			swap(arr, l, r);
			l++;
			r--;

		}
	}

	public static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

}