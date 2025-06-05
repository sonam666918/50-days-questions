//leaders in an array
public class question10 {
    public static void main(String[] args) {
        int arr[] = {16,5,3,2,19,8};
        int n = arr.length;
        int rightMax = arr[n-1];

        System.out.println(rightMax);

        for(int i = n-2; i>=0; i--){
            if(arr[i] > rightMax){
                rightMax = arr[i];
                   System.out.println(rightMax);
            }
        }
    }
    
}
