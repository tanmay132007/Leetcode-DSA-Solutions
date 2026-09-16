class Solution {

    int[][] dp = new int[1001][1001];

    public int longestPalindromeSubseq(String s) {

        String t = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < 1001; i++) {
            Arrays.fill(dp[i], -1);
        }

        return fun(0, 0, s, t);
    }

    int fun(int i, int j, String s, String t) {

        if (i >= s.length() || j >= t.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {

            return dp[i][j] = 1 + fun(i + 1, j + 1, s, t);

        } else {

            int a = fun(i + 1, j, s, t);
            int b = fun(i, j + 1, s, t);

            return dp[i][j] = Math.max(a, b);
        }
    }
}

