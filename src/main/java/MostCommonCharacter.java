import java.util.HashMap;
import java.util.Map;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Iterate through each character in the string and populate the map
        for (char c : str.toCharArray()) {
            // Increment the count if the character is already in the map
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Variables to track the most common character and its frequency
        char mostCommonChar = ' ';
        int maxCount = 0;

        // Iterate through the map to find the character with the highest count
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommonChar;
        
    }
}
