//snake pattern printing 
public class question43 {
    public static void main(String[] args) {
        int[][] matrix = {
            {4,5,3,1},
            {2,7,6,8},
            {9,10,22,12}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i = 0; i < rows; i++){
            if(i % 2 == 0){
                for(int j = 0; j < cols; j++){
                    System.out.print(matrix[i][j] + " ");
                }

            } else{
                for(int j = cols - 1; j >= 0; j--){
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }


    }
}
