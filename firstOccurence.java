// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class firstOccurence {
    public static int strStr(String haystack, String needle) {
        int hlength = haystack.length();
        int nlength = needle.length();
        
        if (nlength == 0) return 0;
        
        for (int i = 0; i <= hlength - nlength; i++) {
            boolean found = true;
            for (int j = 0; j < nlength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) return i;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Haystack ");
        String haystack = br.readLine();
        System.out.println("Enter the needle ");
        String needle = br.readLine();
        int index = strStr(haystack, needle);
        System.out.println(index);
    }
}
