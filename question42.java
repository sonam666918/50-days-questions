// print diagonal of a matrix
public class question42{
    public static void main(String[] args) {
        int[][] matrix = {
            {4,5,6},
            {3,2,1},
            {7,8,9}
        };
        int n = matrix.length;
        System.err.println("main diagonal: ");
        for(int i = 0; i < n; i++){
            System.out.println(matrix[i][i] + " ");
        }
        System.out.println();

        System.out.println("secondary diagonal: ");
        for(int i = 0; i < n; i++){
            System.out.println(matrix[i][n-1-i] + " ");
        }

        System.out.println();
    }
}