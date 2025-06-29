//longest substring without repeating chracter

import java.util.HashSet;

public class question32 {
    public static int lengthOfSubstring(String sc){
        int n =sc.length();
        int maxLength = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for(int right = 0; right < n; right++){
            while(set.contains(sc.charAt(right))){
                set.remove(sc.charAt(left));
                left++;
            }
            set.add(sc.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcaabccb";
        int result = lengthOfSubstring(s);
        System.out.println("length of longest subtring without character: " + result);
    }
    
}
