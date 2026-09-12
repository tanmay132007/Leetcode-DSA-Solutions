class Solution {
    int [][] dp= new int [505][505];
    public int maxSumAfterPartitioning(int[] arr, int k) {
        for (int i = 0; i < 505; i++) Arrays.fill(dp[i], -1);
        

        return solve(0,0,arr,0,k);

        
    }
    public int solve (int p , int i ,int[] arr,int m ,  int k ){
        //array out of bound 
        if (i >= arr.length){
            return 0;
        }
        if(dp[i][p]!=-1) return dp[i][p];

        int ans = 0 ; 

        m = Math.max(m ,arr[i]);
        int l = i - p + 1;

        if (k == l ){
            int c1 = (m*l)+solve(i+1,i+1,arr,0,k);
            ans = Math.max(ans , c1 );


        }else {
            int c1 = (m*l)+solve( i+1 , i+1 , arr , 0 , k);
            int c2 =solve(p , i+1 , arr , m , k );
            ans = Math.max(ans , c1 );
            ans = Math.max(ans , c2 );

        }
        return dp[i][p] = ans;



    }
}