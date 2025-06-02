public class nationalflag {
    public static void main(String[] args) {
        int[] arr = {2,0,1,2,0,1};
        System.out.println("Original Array");
          for(int i : arr){
            System.out.println(i + " ");
          }
          sortColours(arr);
          System.out.println("\nSorted Array");
          for(int i : arr){
            System.out.println(i + " ");
          }
    }

    static void sortColours(int[] arr){
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high){
            switch (arr[mid]) {
                case 0:
                int temp0 =  arr[low];
                 arr[low] = arr[mid];
                 arr[mid] =  temp0;
                 low++;
                 mid++;
                    break;
                    case 1:
                    mid++;
                       break;
                    case 2:
                    int temp2 = arr[high];
                     arr[high] = arr[mid];
                     arr[mid] = temp2;
                     high--;
                    break;
            }
        }
    }
    
    
}
