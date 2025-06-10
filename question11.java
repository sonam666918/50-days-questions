//rearrange array in alternating positive and negative items
import java.util.*;
public class question11 {
    public static void rearrange(int[] arr){
        LinkedList<Integer> pos = new LinkedList<>();
        LinkedList<Integer> neg = new LinkedList<>();
        for(int num : arr){
            if(num>=0) pos.add(num);
            else neg.add(num);

        }
          int i = 0, p = 0, n = 0;
          boolean turnPositive = true;

          while(p<pos.size() && n<neg.size()){
            arr[i++] = turnPositive ? pos.get(p++) : neg.get(n++);
            turnPositive = !turnPositive;
          }

          while (p< pos.size())  arr[i++] = pos.get(p++); 
            while (n< neg.size())  arr[i++] = neg.get(n++); 
        }
        public static void main(String[] args) {
            int[] arr = {1,2,3,-6,-1,3,5};
            rearrange(arr);
            System.out.println(Arrays.toString(arr));
        }
    
    
}
