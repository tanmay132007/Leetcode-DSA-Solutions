class Solution {

    int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        return solve(0, 0, m, n);
    }

    int solve(int i, int j, int m, int n) {

        // pohoch gaye 
        if(i == m - 1 && j == n - 1)
            return 1;

        // grid ke bahar 
        if(i >= m || j >= n)
            return 0;

        // Already mill gaya hai 
        if(dp[i][j] != 0)
            return dp[i][j];

        return dp[i][j] =
                solve(i + 1, j, m, n) +
                solve(i, j + 1, m, n);
    }
}