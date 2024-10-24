package ArrayList;

import java.util.*;

public class countMatchingRules1773 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        countMatchingRules1773 solution = new countMatchingRules1773();
        String ruleKey = "color";
        String ruleValue = "silver";
        int result = solution.countMatches(items, ruleKey, ruleValue);
        System.out.println(result); 
    }

    public  int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }
        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
