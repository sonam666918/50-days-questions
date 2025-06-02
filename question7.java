// cyclic rotate an array by one
public class question7 {
    static void rotation(int[] arr){
         
        int lv=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }

        arr[0]=lv;

        System.out.println("New Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
          int[] arr={1,2,3,4,5};
          rotation(arr);
    }
    
}
