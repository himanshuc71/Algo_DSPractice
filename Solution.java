public class Solution {
    public static int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];  // m columns n rows
        for (int col = 0; col < m; col++){
            for (int row = 0; row < n; row++){
                if (row == 0 || col == 0)
                    dp[col][row] = 1;
                else
                    dp[col][row] = dp [col][row-1] + dp[col-1][row];
            }
        }
        return dp[m-1][n-1];   // returns the unique bottomrightCorner
    }

    public static void main(String[] args) {
        int result = uniquePaths (3,3);
        System.out.println(result);
    }
}
