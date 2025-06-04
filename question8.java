//Kadane's algorithm - Maximum subarray Sum
public class question8 {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};
        int maxSum = Integer.MIN_VALUE;
        for(int str=0; str<n; str++){
            int currSum=0;
            for(int end = str; end<n; end++){
                currSum += arr[end];
                for(int i=str; i<=end; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
            System.out.println("Maximum Subarray: " + maxSum);
        }
    }

    
}
