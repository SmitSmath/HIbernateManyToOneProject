package ProgrammingNumberSeries;

public class FibonnacciSeries {
	public static void main(String[] args) {
		int fn = 0, sn = 1, nextNumber = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(fn + " ");
			nextNumber = fn + sn;
			fn = sn;
			sn = nextNumber;

		}

	}
}
