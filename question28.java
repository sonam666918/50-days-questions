//convert string to integer
public class question28 {

    public static int Atoi(String sc){ 
        if(sc == null || sc.length() == 0) return 0;

        sc = sc.trim();
        if(sc.length() == 0) return 0;

        int sign = 1, i = 0;
        long result = 0;

        if(sc.charAt(i) == '+' || sc.charAt(i) == '-'){
            sign = (sc.charAt(i) == '-') ? -1 : 1;
            i++;
        }while(i < sc.length() && Character.isDigit(sc.charAt(i))){
            result = result * 10 + (sc.charAt(i) - '0');

            if(sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
             if(sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
             i++;
        }
        return(int)(sign * result);
    } 
    public static void main(String[] args) {
        String input = "-67";
        System.out.println("converted integer: " + Atoi(input));
    }
}
       