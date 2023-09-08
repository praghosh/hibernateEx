package hackerearth;

import java.util.Scanner;

public class CountSubArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();
			int [] arr = new int [N];
			for (int j = 0; j < N; j++) {
				arr[j]=sc.nextInt();

			}

			System.out.println(printSubarray(arr));

		}
		sc.close();
	}

	private static long printSubarray(int[] arr) {
		// TODO Auto-generated method stub
		int N = arr.length;
		boolean [] isOddSetByte = new boolean [N];

		int oddCount=0;
		boolean isOdd =false;
		for (int i = 0; i < N; i++) {

			isOddSetByte [i] =isSetByteOdd (arr[i]);

			if (isOddSetByte [i]) {  // If any array member has odd count
				isOdd =!isOdd;       // Status will be reversed.
			}

			if (isOdd) {
				oddCount++; // Number of sub-arrays starting from the beginning
				// whose xor value has odd number of se bits.
			}
		}
		long totalCount =oddCount;

		for (int i = 1; i < N; i++) {
			// Start from the first item and count all odd counts
			// Starting from there. Then move to next item in the array.
			// Thus we can consider all subarray.
			int currentItemRemaining = N -i +1;

			if (isOddSetByte[i-1]) {
				oddCount=currentItemRemaining-oddCount; 

			}

			totalCount = totalCount + oddCount;

		}


		return totalCount;
	}

	private static boolean isSetByteOdd(int i) {

		int count =0;

		while (i!=0) {

			if ((i&1)==1) {
				count++;
			}
			i=i>>1;
		}
		if (count%2==0)  {
			return false;
		}

		return true;
	}

}
