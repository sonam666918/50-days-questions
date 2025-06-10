// find all pair with a given sum
import java.lang.management.ManagementFactory;
import java.util.HashSet;

public class question13 {
    
    public static void findpairs(int[] arr, int target){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> output = new HashSet<>();

        for(int num : arr){
            int complement = target - num;
            if(seen.contains(complement)){
                int min = Math.min(num, complement);
                int max = Math.max(num, complement);
                String pair = min + " , " + max;
                if(!output.contains(pair)){
                    System.out.println("("+ min + " , " + max + ")");
                    output.add(pair);
                }
            }
            seen.add(num);
        }
    } 

    public static void main(String[] args) {
        int[] arr = {1,4,6,-1,5};
        int target = 5;
        findpairs(arr, target);
    }
}
