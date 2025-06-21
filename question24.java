import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class question24 {
    public static void main(String[] args) {
        String input = "DSA";
        System.out.println(generatePermutations(input));

    }
     private static List<String> generatePermutations(String str){
        List<String> permutations = new ArrayList<>();
        permutations.add(str);

        for(int i = 0; i < str.length(); i++){
          List<String> newPermutations = new ArrayList<>();
          for(String perm : permutations){
            for(int j = 0; j < perm.length(); j++){
                String swapped = swap(perm , i, j);
                if(!newPermutations.contains(swapped)){
                    newPermutations.add(swapped);
                }
            }
          }
          permutations.addAll(newPermutations);
        }
        Collections.sort(permutations);
        return permutations;
     }
     private static String swap(String str, int i, int j){
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
     }
}
