//find median in a row-wise sorted matrix..
public class question48 {
    public static int findMedian(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<rows;i++){
            if(matrix[i][0] < min) min = matrix[i][0];
            if(matrix[i][cols - 1] > max) max = matrix[i][cols -1];
        }
        int desired = (rows*cols + 1)/2;
        while(min<max){
            int mid = min + (max - min) / 2;
            int count = 0;

            for(int i=0; i<rows; i++){
                count += countSmallerThanOrEqualTo(matrix[i], mid);
            }
            if(count < desired){
                min = mid+1;
            } else{
                max = mid;
            }
        }
        return min;
    }
    private static int countSmallerThanOrEqualTo(int[] row, int target){
        int low = 0, high = row.length;

        while (low < high) {
            int mid = (low+high)/2;
            if(row[mid] <= target){
                low = mid+1;
            } else{
                high = mid;
            }
            
        }
        return low;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {6,7,8}
        };


        System.out.println("median is:" +findMedian(matrix));
    }
    
}
