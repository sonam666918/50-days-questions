//search in 2D matrix
public class question46 {
    public static boolean searchMatrix(int[][] matrix , int target){
        int row = 0;
        int col = matrix[0].length - 1;
        
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            } else if (matrix[row][col] > target){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }    

    public static void main(String[] args) {
        int[][] matrix ={
            {7,8,9,6},
             {2,6,3,4},
            {1,14,2,6},
           {10,11,13,12}        
        };
        int target = 11;
        System.out.println("Found : " + searchMatrix(matrix, target));
    }
}
