package Nagarro_Doubt_Class;

import Nagaaro_Qps_3.Happy_Number_Leetcode;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,4,3,2,1};
		for (int pass = 1; pass < arr.length; pass++) {
			for (int j = 0; j <= arr.length-pass-1; j++) {
				if(arr[j]>arr[j+1]) {
					int  temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}	Happy_Number_Leetcode.is_Happy_number(12);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
