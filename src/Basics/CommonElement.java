package Basics;

import java.util.HashSet;

public class CommonElement {

    public static void main(String args[]) {

        // Initializing arrays
        int[] s1 = {2, 3, 5, 6, 8};
        int[] s2 = {6, 2, 3, 6, 8};

        // Create a HashSet to store elements of the first array
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of s1 into the HashSet
        for (int i = 0; i < s1.length; i++) {
            set.add(s1[i]);
        }

        // Iterate through the second array and check if the element is in the HashSet
        for (int j = 0; j < s2.length; j++) {
            if (set.contains(s2[j])) {
                // Print the common element
                System.out.println("Common element: " + s2[j]);
                // Remove the element from the set to avoid duplicates in the result
                set.remove(s2[j]);
            }
        }
    }
}
