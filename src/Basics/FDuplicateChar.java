package Basics;

import java.util.Arrays;

public class FDuplicateChar {
	public static void main(String[] args) {
		String ori = "HellllllojjjjjjkkklllllH";
		char[] newStr = ori.toCharArray();
		Arrays.sort(newStr);

		/*
		 * if (newStr[i] == newStr[i + 1] && (index == 0 || dup[index - 1] !=
		 * newStr[i])) yeh woh rule hai jo humko batata hai ki kab humko koi letter apni
		 * notebook mein likhna hai. Pehla part dekhta hai ki kya bagal wala letter same
		 * hai, aur dusra part dekhta hai ki kya humne woh letter pehle se hi notebook
		 * mein likh liya hai ya nahi. dup[index++] = newStr[i]; iska matlab hai agar
		 * humko duplicate letter mil jaaye aur woh pehle se notebook mein nahi hai, toh
		 * usko notebook mein likh do aur index ko ek number aage badha do taki agli
		 * duplicate letter uske baad wali jagah par likhi jaaye.
		 */

		char[] dup = new char[newStr.length]; // Fixed size, may waste space
		int index = 0; // Track position

		for (int i = 0; i < newStr.length - 1; i++) {
			if (newStr[i] == newStr[i + 1] && (index == 0 || dup[index - 1] != newStr[i])) {

				dup[index] = newStr[i]; // Manually track position
				System.out.println(dup[index]);
				index++;

			}
		}

	}
}
