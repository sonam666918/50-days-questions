//check if two strings are anagrams.. 

import java.util.Arrays;

public class question25 {
    public static boolean areAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "state";
        String str2 = "taste";

        if(areAnagrams(str1, str2)){
            System.out.println(str1 + "and" + str2 + "are anagrams. ");
        }else{
            System.out.println(str1 + "and" + str2 + "are not anagrams.");
        }
    }


    
}
