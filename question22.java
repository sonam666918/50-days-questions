//check for palindrome

import java.util.Scanner;

public class question22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String input = scanner.nextLine();

        if(isPalindrome(input)){
            System.out.println("\"" + input + "\" is a palindrome.");
        }else{
            System.out.println("\"" + input + "\" is not a palindrome");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str){
        StringBuilder cleaned = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        String forward = cleaned.toString();
        String reversed = cleaned.reverse().toString();

        return forward.equals(reversed);
    }
    
}
