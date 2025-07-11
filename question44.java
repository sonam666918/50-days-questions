//boundary traversal of matrix
public class question44 {
    public static void main(String[] args) {
        int[][] matrix = {
            {9,7,8,6},
            {1,3,4,2},
            {5,6,11,14}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int j = 0; j <cols; j++){
            System.out.print(matrix[0][j] + " ");
        }

        for(int i = 1; i<rows; i++){
            System.out.print(matrix[i][cols-1] + " ");
        }
        if(rows > 1){
            for(int j = cols-2; j>= 0; j--){
                System.out.print(matrix[rows-1][j]+ " ");
            }
             if(cols > 1){
            for(int i = rows-2; i>= 0; i--){
                System.out.print(matrix[i][0]+ " ");
            }
        }
    }
    
}
}