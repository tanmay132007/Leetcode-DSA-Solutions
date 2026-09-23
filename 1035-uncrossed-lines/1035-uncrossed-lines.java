class Solution {
    int[][] dp = new int [1001][1001];
    int fun (int i , int j , int[] s , int[] t){
        if (i >= s.length || j >= t.length) return 0  ;
        if (dp[i][j] != -1 ) return dp[i][j];
        int m = 0 ;
        // if the no is same 

        if(s[i]==t[j]){
            int a = 1+fun(i+1,j+1,s,t);
            m= Math.max(m,a);
        }else{
        // if the no is not match 

        int a = fun(i+1,j,s,t);
        int b = fun(i,j+1,s,t);
        m= Math.max(m,a);
        m= Math.max(m,b);
        }

        dp[i][j]= m ;
        return m ;



    }


    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        for (int i = 0 ; i < dp.length ; i++){
            Arrays.fill(dp[i],-1);
        }
        int d = fun(0,0,nums1,nums2);
        return d ;
        
    }
}

