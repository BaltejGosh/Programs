package Basics;

public class PrintPrimeNumber {
	public static void main(String[] args) {
		int m = 9;
		for (int n = 2; n <= m; n++) {
			for (int i = 2; i <= n - 1; i++) {
				if (n % i != 0) {
					System.out.println(n);
				}
			}

		}
	}
}
