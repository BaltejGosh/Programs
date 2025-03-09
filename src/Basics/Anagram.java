package Basics;

import java.util.Arrays;

public class Anagram {

    //char array of string because sort method isn't available in the String class
    static boolean areAnagram(char[] string1, char[] string2) {

        int stringLength1 = string1.length;
        int stringLength2 = string2.length;

        // If lengths are different, they can't be anagrams
        if (stringLength1 != stringLength2)
            return false;

        // Sorting the arrays for comparison
        Arrays.sort(string1);
        Arrays.sort(string2);

        // Compare each character in both sorted arrays
        for (int i = 0; i < stringLength1; i++) {
            if (string1[i] != string2[i]) {
                return false;  // Return false if any character doesn't match
            }
        }

        // If all characters match, the strings are anagrams
        return true;
    }

    public static void main(String args[]) {

        char[] string1 = {'s', 'i', 'l', 'e', 'n', 't'};
        char[] string2 = {'l', 'e', 'n', 'k', 's', 'i'};

        // Check if the strings are anagrams and print the result
        if (areAnagram(string1, string2)) {
            System.out.println("both are anagram");
        } else {
            System.out.println("both are not anagram");
        }
    }
}
