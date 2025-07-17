//boolean matrix problem (set row/column to 1 if any element is 1)
public class question50 {
    public static void modifyMatrix(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowFlag = new boolean[rows];
        boolean[] colFlag = new boolean[cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == 1){
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(rowFlag[i] || colFlag[j]){
                    matrix[i][j] = 1;
                }
            }
        }
    }
    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            } 
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0,0,1},
            {1,0,0},
            {0,0,0}
        };
        System.out.println("original matrix: ");
        printMatrix(matrix);

        modifyMatrix(matrix);

        System.out.println("mofified matrix: ");
        printMatrix(matrix);
    }
    
}
