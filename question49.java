//maximum size rectangle of all 1s in binary matrix..
import java.util.Stack;
public class question49 {
    public static int maximumRectangle(int[][] matrix){
        if(matrix.length == 0)return 0;
        int maxArea = 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols];

        for(int[] row: matrix){
            for(int j = 0; j < cols; j++){
                heights[j] = (row[j] == 0) ? 0: heights[j] + 1;
            }
            int area =largestRectangleArea(heights);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }    
    public static int largestRectangleArea(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int len = heights.length;

        for(int i=0;i<=len;i++){
            int h = (i == len) ? 0 : heights[i];
            while(!stack.isEmpty() && h<heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i-stack.peek()-1;
                maxArea = Math.max(maxArea,height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args){
        int[][] matrix = {
            {1, 1, 0, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 0, 0, 1, 0},
            {1, 1, 1, 1, 1}
            
        };
        System.out.println("maximum area of rectangle is: " + maximumRectangle(matrix));
    }
}
