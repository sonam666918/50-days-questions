public class kth_array {
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,6,7,8,43,65,86,1,9};
        int k = 3;
        sort(arr);

        System.out.println("The " + k + "th smallest number is: " + arr[ k-1 ]);
        System.out.println("The "+k+ "th largest number is: " +arr[arr.length - k]);
    }
}
    

