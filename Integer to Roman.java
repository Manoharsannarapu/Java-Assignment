/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.*/
public class IntegerToRoman {
    public String intToRoman(int num) {
        // Create the mapping of integer values to Roman numeral symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        // Iterate over the symbols and subtract the corresponding values from num
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                romanNumeral.append(symbols[i]);
                num -= values[i];
            }
        }

        return romanNumeral.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman solution = new IntegerToRoman();

        int num = 3;
        System.out.println(solution.intToRoman(num)); // Output: "III"

        int num2 = 58;
        System.out.println(solution.intToRoman(num2)); // Output: "LVIII"
    }
}
