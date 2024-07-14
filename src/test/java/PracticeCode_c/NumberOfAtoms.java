package PracticeCode_c;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/*
 * TC -O(n)
 * SC -O(n * k)  # k is the number of unique elements in the formula.
 */
public class NumberOfAtoms {
	
    public static void main(String[] args) {
        
        System.out.println(countOfAtoms("H2O"));        // Output: "H2O"
        System.out.println(countOfAtoms("Mg(OH)2"));    // Output: "H2MgO2"
        System.out.println(countOfAtoms("K4(ON(SO3)2)2")); // Output: "K4N2O14S4"
    }


    public static String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        Map<String, Integer> current = new TreeMap<>();  // Use TreeMap to keep keys sorted
        int n = formula.length();
        int i = 0;

        while (i < n) {
            char c = formula.charAt(i);
            if (c == '(') {
                // Push the current map to stack and start a new map
                stack.push(current);
                current = new TreeMap<>();
                i++;
            } else if (c == ')') {
                // Find the multiplier after the closing parenthesis
                int j = i + 1;
                int num = 0;
                while (j < n && Character.isDigit(formula.charAt(j))) {
                    num = num * 10 + (formula.charAt(j) - '0');
                    j++;
                }
                num = num == 0 ? 1 : num;
                i = j;
                
                // Pop the stack and multiply the counts in the current map
                if (!stack.isEmpty()) {
                    Map<String, Integer> prev = current;
                    current = stack.pop();
                    for (String key : prev.keySet()) {
                        current.put(key, current.getOrDefault(key, 0) + prev.get(key) * num);
                    }
                }
            } else {
                // Parse the element name
                int j = i + 1;
                while (j < n && Character.isLowerCase(formula.charAt(j))) {
                    j++;
                }
                String element = formula.substring(i, j);
                i = j;
                // Parse the count
                int num = 0;
                while (j < n && Character.isDigit(formula.charAt(j))) {
                    num = num * 10 + (formula.charAt(j) - '0');
                    j++;
                }
                num = num == 0 ? 1 : num;
                current.put(element, current.getOrDefault(element, 0) + num);
                i = j;
            }
        }
        
        // Build the result string using the TreeMap's natural order
        StringBuilder result = new StringBuilder();
        for (String element : current.keySet()) {
            result.append(element);
            int count = current.get(element);
            if (count > 1) {
                result.append(count);
            }
        }
        
        return result.toString();
    }


}