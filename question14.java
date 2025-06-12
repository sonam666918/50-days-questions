//subarray with given sum(two pointer/ siding window)
public class question14 {
    public static void findSubarray(int[] arr, int target){
        int start = 0, sum = 0; 
       
        for(int end = 0; end < arr.length; end++){
            sum += arr[end];
            while(sum > target && start < end){
                sum -= arr[start];
            }
            if (sum == target){
                System.out.println("subarray found between index" + start + "and" + end);
                return;
            }
        }
        System.out.println("no subarray found.");
    } 
    public static void main(String[] args) {
        int[] arr = {1,4,5,20,6,9,2,10};
        int target = 25;
        findSubarray(arr, target);
    }
    
}
