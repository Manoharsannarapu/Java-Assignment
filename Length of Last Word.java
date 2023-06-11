/*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.*/
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // Trim any leading or trailing spaces
        s = s.trim();

        // Split the string into words using space as the delimiter
        String[] words = s.split(" ");

        // Check if there are any words
        if (words.length == 0) {
            return 0;
        }

        // Return the length of the last word
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        // Example usage
        String s = "Hello World";
        int length = solution.lengthOfLastWord(s);
        System.out.println(length);
        // Output: 5
    }
}
