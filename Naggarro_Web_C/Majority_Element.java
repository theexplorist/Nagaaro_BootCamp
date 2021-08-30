package Naggarro_Web_C;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 5, 6, 7 };

	}

	public static int Majority_Element(int[] arr) {
		int ele = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (ele == arr[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				ele = arr[i];
				count = 1;
			}

		}

		// exist or not exist
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				count++;

			}

		}
		if (count > arr.length / 2) {
			return ele;
		}
		return -1;

	}
}
