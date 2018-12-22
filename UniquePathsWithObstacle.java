public class UniquePathsWithObstacle {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        if(rows == 0)
            return 0;
        int columns = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1)
            return 0;
        int [][] dp = new int[rows][columns];
        dp[0][0] = 1;

        for (int i = 1; i < rows; i++){    // fill first column
            if (obstacleGrid[i][0] == 0)
                dp[i][0] = dp [i-1][0];
            else
                dp[i][0] = 0;
        }
        for (int j = 1; j < columns; j++){ // fill first row
            if (obstacleGrid[0][j] == 0)
                dp[0][j] = dp [0][j-1];
            else
                dp[0][j] = 0;
        }
        for (int row = 1; row < rows; row++){
            for (int col = 1; col < columns; col++){
                if (obstacleGrid[row][col] == 1)   // obstacle
                    dp[row][col] = 0;
                else                         // no obstacle then sum of ways from up and left
                    dp[row][col] = dp[row][col-1] + dp[row-1][col];
            }
        }
        return dp[rows-1][columns-1];   // returns the unique bottomrightCorner
    }
}
