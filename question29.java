public class question29 {
    public static int substringSearch(String str, String strSub){
        if(strSub.isEmpty()) return 0;
        for(int i = 0; i <=(str.length() - strSub.length()); i++){
            if((str.substring(i,i+ strSub.length())).equals(strSub)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "dislike";
        String strSub = "like";

        System.out.println(substringSearch(str, strSub));
    }
    
}
