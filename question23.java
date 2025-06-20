//remove duplicates from a string

import java.util.HashSet;

public class question23 {
    
    public static String removeDuplicateHashSet(String str){

        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()){
            if(seen.add(c)){
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "grammer";
        String output = removeDuplicateHashSet(input);
        System.out.println("original: " + input);
        System.err.println("without duplicates: " + output);
    }
}
