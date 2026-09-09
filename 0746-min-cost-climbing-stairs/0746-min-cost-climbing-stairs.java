class Solution {
    int [] dp= new int[1000];

    int fun(int[]cost, int index){
        if(index>=cost.length) return 0;
        if(dp[index]!=-1) return dp[index];

        int cost1=cost[index]+fun(cost,index+1);
        int cost2=cost[index]+fun(cost,index+2);
        int ans= Math.min(cost1,cost2);
        dp[index]=ans;
        return ans;
    }
    public int minCostClimbingStairs(int[] cost) {

        for(int i=0;i<dp.length;i++) dp[i]=-1;
        
        return Math.min(fun(cost, 0), fun(cost, 1));
        
    }
}