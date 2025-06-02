// remove all negative numbers to beginning and positive to end 
public class ques5 {
    public static void main(String[] args) {
        int[] arr = {-1,-30,80,20,50,78,-9};
        int n = arr.length;
        ques5(arr, n);

          for(int i : arr){
            System.out.println(i + " ");
          }
    }

    private static void ques5 (int[]arr,int n){
        int tempAll[] = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]<0){
                tempAll[j++] = arr[i];
            }
        }
           for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                tempAll[j++] = arr[i];
            }
        } 

        for(int i = 0; i < n; i++){
            arr[i] = tempAll[i];
    }
    
    } 

}

