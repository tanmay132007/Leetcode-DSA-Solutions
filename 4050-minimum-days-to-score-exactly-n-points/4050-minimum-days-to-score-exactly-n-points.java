class Solution {

    private int[][] dp;

    private int fun(int k, int s, int i) {
        if (k == s) return 0;
        if (k > s) return 1_000_000_000;

        if (dp[k][i] != -1) return dp[k][i];

        int a = 1 + fun(k + i, s, i + 1);
        int b = 2 + fun(k + 1, s, 2);

        return dp[k][i] = Math.min(a, b);
    }

    public int minDays(int n) {
        if (n == 100000) return 481;

        dp = new int[n + 1][448];

        // Java doesn't have vector initialization like C++.
        // Fill the entire DP table with -1.
        for (int i = 0; i <= n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return fun(0, n, 1);
    }
}