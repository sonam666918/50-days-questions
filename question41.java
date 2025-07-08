//set entire row and column to 0 if any element is 0
public class question41 {
    public static void main(String[] args) {
        int[][] matrix = {
            {8,6,9},
            {0,4,5},
            {1,4,5}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    row[1] = true;
                    col[1] = true;
                }
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
