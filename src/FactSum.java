import java.util.Scanner;

public class FactSum {

	int n;

	void input () {
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
	}

	void calculateSum () {
		double sum=0.0;
		double numerator = 1.0;
		int gap =3;
		int factTerm =2;
		int plusMinus =1;
		for (int i = 0; i < n; i++) {
			if (i%3==0) {
				plusMinus=1;
			}
			else {
				plusMinus=-1;
			}
			double fact =1.0;

			for (int j = 1; j <=factTerm; j++) {

				fact = fact *j;
			}
			System.out.println((plusMinus * numerator)/ (double) fact);
			
			sum = sum + (plusMinus * numerator)/ (double) fact;

			numerator=numerator*2;
			factTerm = factTerm + gap;
			gap = gap + 2;
		}
		System.out.println("Sum=" + sum);

	}

	public static void main(String[] args) {
		FactSum factsum = new FactSum();
		factsum.input();
		factsum.calculateSum();
	}
}
