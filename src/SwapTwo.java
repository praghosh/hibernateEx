import java.util.*;
public class SwapTwo {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			
			int N = sc.nextInt();
			String firstString = sc.next();
			String secondString = sc.next();			
			
					
			char[] S = firstString.toCharArray();
			char  [] P = secondString.toCharArray();
			 
			int N1,N2; // Dividing the arrays in odd and even.
			
			if (N%2==0)  {
				N1=N/2;
				N2=N/2;
			}
			else {
				N1=(N/2) +1;
				N2=N/2;
			}
			int A [] = new int [N1];  // Even position starting from  0
			int C []= new int [N1];
			
			int B [] = new int [N2];  // Odd position from 1
			int D []= new int [N2];
			
			for (int j = 0; j < N; j++) {
				 
				if (j%2==0) {
					A[j/2] = S[j];
					C[j/2]= P[j];
				}
				else {
					B[j/2] = S[j];
					D[j/2]= P[j];
				}
			}
			Arrays.sort(A);
			Arrays.sort(B);
			Arrays.sort(C);
			Arrays.sort(D);
//			System.out.println( Arrays.toString (A) );
//			System.out.println( Arrays.toString (B) );
//			System.out.println( Arrays.toString (C) );
//			System.out.println( Arrays.toString (D) );
			boolean matched=true;
			
			for (int j = 0; j < N; j++) {
				 
				if (j%2==0) {
					
					if (A[j/2] !=  C[j/2]) {
						matched=false;
						break;
					}
					
				}
				else {
					if (B[j/2] !=  D[j/2]) {
						matched=false;
						break;
					}			 
				}
			}
			
			if (matched) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
				 
		
	}

}
