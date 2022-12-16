package ProgrammingNumberSeries;

import java.util.Scanner;

public class PrimeNumber {
//	public void primeNumberLogic() {
//	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int count = 0;
		int n = scr.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % 2 == 0)
				count++;
		}
		System.out.println((count > 2) ? "not prime" : "prime");
	}
}
