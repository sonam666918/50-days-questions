//count islands 
public class question47 {

    public static int numIsland(char[][] grid){
        int count = 0;
        int rows = grid.length, cols = grid[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i , j);
                    count++;
                }
            }
        }
     return count;
    }

        
        public static void dfs(char[][] grid, int i, int j){
            int rows = grid.length, cols = grid[0].length;

            if(i<0 || j<0 || i>=rows || j >= cols|| grid[i][j] == '0')return;

            grid[i][j] ='0';
            dfs(grid, i + 1, j);
            dfs(grid, i - 1, j);
            dfs(grid, i, j + 1);
            dfs(grid, i, j - 1);
        }
    public static void main(String[] args) {
        char[][] grid = {
            {'0','0','0','1','1'},
            {'0','0','0','1','1'},
            {'0','0','1','0','0'},
             {'1','1','0','0','0'},
        };
        System.out.println("number of island: " + numIsland(grid));

        
    }
    
}
