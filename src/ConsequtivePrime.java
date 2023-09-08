
public class ConsequtivePrime {
	
	boolean isPrime (int N) {
	 
		for(int i=2; i<N;  i++) {
			
			if (N%i==0) {
				return false;
			}
		}
		return true;
	}

	// Print six consecutive prime
	void printSixComposite () {
	
		int count=0; 
		int uptoNumber = 100;
		for (int i = 2; i <= uptoNumber; i++) {
			
			 if (isPrime(i) || i==uptoNumber) {
				 if (count>=5) {
					 for (int j = count; j >0;  j--) {
							
						 System.out.print ((i-j) + " ");
					 }
					 System.out.println();
				 }			 
				 count=0; //when number is prime
			 }
			 else {
				 count++;//when number is composite
			 }
			 
		}		
	}
	public static void main(String[] args) {
		System.out.println( new ConsequtivePrime ().isPrime(2));
		System.out.println( new ConsequtivePrime ().isPrime(3));
		System.out.println( new ConsequtivePrime ().isPrime(15));
		System.out.println( new ConsequtivePrime ().isPrime(17));
		System.out.println( new ConsequtivePrime ().isPrime(20));
		new ConsequtivePrime ().printSixComposite ();
	}
}
