

class Solution {

    int[] dp = new int[1001];

    int fun(int i, int[][] nums) {

    
        if (i >= nums.length)
            return 0;

       
        if (dp[i] != -1)
            return dp[i];

        int id = nums.length;



        int l = i + 1;
        int h = nums.length - 1;

        while (l <= h) {

            int mid = (l + h) / 2;

            if (nums[mid][0] > nums[i][1]) {

                
                id = mid;

                
                h = mid - 1;
            }
            else {

                
                l = mid + 1;
            }
        }


        int t = 1 + fun(id, nums);

        int nt = fun(i + 1, nums);

        return dp[i] = Math.max(t, nt);
    }


    public int findLongestChain(int[][] pairs) {

        Arrays.fill(dp, -1);

        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);

        return fun(0, pairs);
    }
}