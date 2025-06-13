//find dupicate nymber in array
public class question16 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,1,7,3,7,9};
        boolean[] visited = new boolean[arr.length];
        System.out.println("duplicate elements are: ");
           for(int i=0; i<arr.length;i++){
            if(visited[i]) continue;
              for( int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.err.println(arr[i]); visited[j]=true;
                }
              }
           }
    }
    
}
