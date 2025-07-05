//search in a row wise and column wise sorted matrix....
public class question38 {
    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,40},
            {30,40,50,60},
            {34,35,33,36},
            {11,13,14,12}
        };

        int target = 20;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0, j = cols - 1;

        boolean found = false;
        while(i < rows && j >= 0){
            if(matrix[i][j] == target){
            System.out.println("found at ("+ i + ", "+ j +")");
            found = true;
            break;
        }else if(matrix[i][j] > target){
            j--;
        } else{
            i++;
        }
    }
    if(found){
        System.out.println("not found");
    }
    
}
}