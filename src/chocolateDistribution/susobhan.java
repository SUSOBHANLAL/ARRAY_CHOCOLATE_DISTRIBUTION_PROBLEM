package chocolateDistribution;

import java.util.Arrays;

public class susobhan {
	public static void main(String args[]) {
		int arr[] = {7,3,2,4,9,12,56};
		int k = 3;
		int n = arr.length;
		Arrays.sort(arr);
		
		int diff=0;
		int minsum=Integer.MAX_VALUE;
		for(int i =0;i<=(n-k);i++) {
			diff=arr[i+(k-1)]-arr[i];
			
			if(minsum>diff) {
				minsum=diff;
			}
		}
		System.out.print(minsum);
	}

}
