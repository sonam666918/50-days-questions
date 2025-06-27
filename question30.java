//valid palindrome after removing at most one character....
public class question30 {
    public static boolean validispalindrome(String sc){
        int left = 0, right = sc.length() - 1;

        while(left < right){
            if(sc.charAt(left) != sc.charAt(right)){
                return (ispalindrome(sc,left + 1,right) || ispalindrome(sc,left,right-1));
            }
            left++;
            right--;
        } 
        return true;
    }
    public static boolean ispalindrome(String sc, int left, int right){
        while (left < right) {
            if(sc.charAt(left)!= sc.charAt(right))return false;
            left++;
            right--;
            
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "level";
        System.out.println(validispalindrome(s1));

         String s2 = "xyz";
        System.out.println(validispalindrome(s2));

         String s3 = "abc";
        System.out.println(validispalindrome(s3));




    }
    
}
