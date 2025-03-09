package Basics;

public class PalindromeExample {
	public static void main(String[] args) {
		/*
		 * String str = "madam"; // String to check str = str.toLowerCase(); // Convert
		 * to lowercase for case insensitivity
		 * 
		 * int n = str.length(); // Get the length of the string
		 * 
		 * // Ek hi loop se palindrome check karenge for (int i = 0; i < n / 2; i++) {
		 * // Compare karte hai front aur back ke characters if (str.charAt(i) !=
		 * str.charAt(n - 1 - i)) { System.out.println(str + " is not a palindrome.");
		 * return; // Agar mismatch mile to return karo } }
		 * 
		 * System.out.println(str + " is a palindrome.");
		 */
		// another way
		System.out.println("---------------");

		String nameOriginal = "MADAM";
		String rev = "";

		for (int i = nameOriginal.length() - 1; i >= 0; i--) {
		//	System.out.println(nameOriginal.charAt(i));
			rev = rev + nameOriginal.charAt(i);

		}

		System.out.println(rev);
		if (rev.equals(nameOriginal)) {
			System.out.println("string is palindorme and i am successfull");
		}

	}

	// another way

}
