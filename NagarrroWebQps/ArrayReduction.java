package NagarrroWebQps;
import java.util.Arrays;

public class ArrayReduction {

	private static int search(int[] arr, int value) {
		// TODO Auto-generated method stub

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 10, 40, 30, 20};
		
		int[] copyArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copyArr);
		//System.out.println(Arrays.toString(copyArr));
		
		for(int i = 0; i < arr.length; i++) {
			int val = arr[i];
			//int index = search(copyArr, val);
			int index = Arrays.binarySearch(copyArr, val);
			arr[i] = index;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
