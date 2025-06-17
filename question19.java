import java.util.Arrays;

public class question19 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};

        merge(arr1,arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    static void merge(int[] arr1 , int[] arr2){
        int n = arr1.length, m = arr2.length;

     int gap = (n+m+1)/2;

     while (gap>0) {
        int i = 0, j = gap;
        while (j < (n + m)) 
        {
            int a = get(arr1, arr2, j, n);
            int b = get(arr1, arr2, j, n);

            if(a > b){
                set(arr1 , arr2 ,i , n , b);
                 set(arr1 , arr2 ,j , n , a);
            }
            i++; j++;
        }    
        if(gap == 1)break;
        gap = (gap + 1)/2;    
     }

    }
    static int get(int[] arr1, int[] arr2, int index, int n){
        return index < n ? arr1[index] : arr2[index - n];
    }

    static void set(int[] arr1, int[] arr2, int index, int n, int value){
        if(index < n) arr1[index] = value;
        else arr2[index - n] = value;
    }
}
 