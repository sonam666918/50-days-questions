//matrix multiplication
public class question40{
    public static void main(String[] args) {
        int [][] A ={
            {2,3,4},
            {5,6,7}
        };
        int[][] B = {
            {3,6},
            {6,4},
            {9,8}
        
        };

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        
        int[][] result = new int[rowsA][colsB];
        for(int i = 0; i < rowsA; i++){
            for(int j = 0; j < colsB; j++){
                for(int k = 0; k < colsA; k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        } 
        for(int[] row : result){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}