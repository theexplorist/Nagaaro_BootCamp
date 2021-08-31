package Naggarro_Web_C;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {

		int net = 0;
		int curr=0;
		int si=0;
		for (int i = 0; i < cost.length; i++) {
			net += (gas[i] - cost[i]);
			curr+=(gas[i] - cost[i]);
			if(curr<0) {
				si=i+1;
				curr=0;
			}
			

		}
		if (net < 0) {
			return -1;
		}
		 return si;
	}

}
