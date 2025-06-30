//group anagram together

import java.util.*;
import java.util.HashMap;

public class question33 {

    public static List<List<String>> groupAnagrams(String[] str){
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word : str){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        String[] input = {"listen","silent","add","dad","act","cat","tac"};
        List<List<String>> result = groupAnagrams(input);
        System.out.println(result);
    }
    
}
