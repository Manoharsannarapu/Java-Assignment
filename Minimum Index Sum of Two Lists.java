/*Given two arrays of strings list1 and list2, find the common strings with the least index sum.
A common string is a string that appeared in both list1 and list2.
A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.
Return all the common strings with the least index sum. Return the answer in any order.*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonStrings {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> commonStrings = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        // Store indices of strings from list1 in the hashmap
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        // Check strings from list2 and find common strings with the least index sum
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int indexSum = j + map.get(list2[j]);
                if (indexSum < minIndexSum) {
                    commonStrings.clear();
                    commonStrings.add(list2[j]);
                    minIndexSum = indexSum;
                } else if (indexSum == minIndexSum) {
                    commonStrings.add(list2[j]);
                }
            }
        }

        return commonStrings.toArray(new String[0]);
    }

    public static void main(String[] args) {
        CommonStrings solution = new CommonStrings();

        // Example usage
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        String[] common = solution.findRestaurant(list1, list2);
        for (String str : common) {
            System.out.println(str);
        }
        // Output: "Shogun"
    }
}
