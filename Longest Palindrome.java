/*Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.*/
import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        // Count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOddCount = false;

        // Iterate over the character counts
        for (int count : charCount.values()) {
            // Add the count of characters with an even count
            length += count / 2 * 2;
            
            // Check if there is at least one character with an odd count
            if (count % 2 != 0) {
                hasOddCount = true;
            }
        }

        // Add 1 if there is at least one character with an odd count
        if (hasOddCount) {
            length += 1;
        }

        return length;
    }

    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();

        String s = "abccccdd";
        System.out.println(solution.longestPalindrome(s)); // Output: 7

        String s2 = "abc";
        System.out.println(solution.longestPalindrome(s2)); // Output: 1
    }
}
