class Solution {

    int[][]dp= new int[502][502];

    int fun(String s, String t, int i, int j){
        
        if(i>=s.length() || j>=t.length()) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        int m=0;

        if(s.charAt(i)==t.charAt(j)){
            int a=1+fun(s,t,i+1,j+1);
            m=Math.max(m,a);
        }else{
            int a=fun(s,t,i,j+1);
            int b=fun(s,t,i+1,j);
            m=Math.max(m,Math.max(a,b));
        }
        return dp[i][j]=m;
    }
    public int minDistance(String word1, String word2) {
        for(int i=0;i<502;i++) Arrays.fill(dp[i],-1);

        int length=2*fun(word1,word2,0,0);

        int l1=word1.length();
        int l2=word2.length();

        return (l1+l2)-length;
        
    }
}