// check if array is sorted and reversed 
public class question9 {
    public static void main(String[] args) {
        int arr[] = {3,5,6,2,1,8};
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;

            }
        }
        if(count == 1){
            System.out.println("array is sorted and rotated");
        }else{
            System.out.println("array is not sorted and rotated");
        }
    }
    
}
