//compress the string (like leetcode 443)
public class question31 {
    public static void main(String[] args) {
        StringCompressor sc = new StringCompressor();
        char[] input = {'a','a','a','b','b','b','c','c'};
        int len = sc.compress(input);

        System.out.println("compressed length: " + len);
        for(int i=0; i<len; i++){
            System.out.print(input[i] + " ");
        }
    }
    
}
class StringCompressor{
    public int compress(char[] chars){
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            
        while (i < chars.length && chars[i] == currentChar) {
            i++;
            count++;
            
        }
        chars[index++] = currentChar;
        if(count > 1){
            for(char c : String.valueOf(count).toCharArray()){
                chars[index++] = c;
            }
        }
    }
    return index;
}
}