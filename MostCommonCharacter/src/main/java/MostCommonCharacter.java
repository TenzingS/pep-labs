import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        Set<Entry<Character, Integer>> entrySet = map.entrySet();
         
        int maxCount = 0;
         
        char maxChar = 0;
         
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
            }
        }
            return maxChar;
    }
}
