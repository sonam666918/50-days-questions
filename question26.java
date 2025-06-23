//count and say problem..
public class question26 {
    public static String countAndSay(int n) {
        String result = "1";

        for(int i = 1; i < n; i++){
            StringBuilder sc = new StringBuilder();
            int count = 1;

            for(int j = 0; j < result.length(); j++){
                if(j < result.length() - 1 && result.charAt(j) == result.charAt(j+1)){
                    count++;
                } else{
                    sc.append(count).append(result.charAt(j));
                    count = 1;
                }
            }
            result = sc.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(countAndSay(n));
    }
    
}
