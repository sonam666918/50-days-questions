//find union and intersection of two arrays
public class Question6 {
    static void union(int[] arr1, int[] arr2){
        int a1 = arr1.length;
        int a2 = arr2.length;
        int[] arr3 = new int[ a1+a2 ];
        for(int i=0; i<arr3.length; i++){
            if(i<a1){
                arr3[i]=arr1[i];
            }
            else if(i>=a1 || i<=a2){
                arr3[i]=arr2[i-a1];
            }
        }
        for(int i=0; i<=arr3.length; i++)
        System.out.println(arr3[i]);
    }
    


static void intersection(int[] arr1, int[] arr2){
     for(int i=0; i<arr1.length; i++){
         for(int j=0; j<arr2.length; j++){
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                break;
            }
         }
     }

}

public static void main(String[] args) {
    int[] arr1 = {0,1,2,3,4,5};
     int[] arr2 = {4,5,6,7,8,9};
     System.out.println("Union of arrays: ");
     union(arr1, arr2);

     System.out.println("Intersection of arrays: ");
     intersection(arr1, arr2);

}
}
