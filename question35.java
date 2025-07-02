//check if one string is a subsequence of another
public class question35 {
    
    public static boolean isSubsequence(String s, String t){
        int i = 0, j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();

    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","abhgdc"));
        System.out.println(isSubsequence("dhg", "abhgdc"));
    }
}
