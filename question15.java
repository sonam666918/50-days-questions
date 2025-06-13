//missing number in an array[1 to n]

import java.util.Arrays;

public class question15 {
    public static int findMissingNumber(int[] arr,int n){
        boolean[] present = new boolean[n+1];
        Arrays.fill( present, false);

        for(int num : arr){
            present[num] = true;
        }

        for(int i = 1; i <=n; i++){
            if(!present[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = 6;
        int missing = findMissingNumber(arr, n);
        System.out.println("Missing number: " + missing);
    }
    
}
