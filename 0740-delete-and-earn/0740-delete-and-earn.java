class Solution {

    int[]dp=new int[20005];

    int fun(List<Integer>nums,int i,HashMap<Integer,Integer>m1){

        if(i==nums.size()-1) return nums.get(i)*m1.get(nums.get(i));

        if(i>=nums.size()) return 0;

        if(dp[i]!=-1) return dp[i];

        int m=0;

        if(i+1<nums.size() && nums.get(i+1)==nums.get(i)+1){
            int a=(nums.get(i)*m1.get(nums.get(i)))+fun(nums,i+2,m1);
            m=Math.max(m,a);
        }

        if(i+1<nums.size() && nums.get(i+1)!= nums.get(i)+1){
            int a=(nums.get(i)*m1.get(nums.get(i)))+fun(nums,i+1,m1);
            m=Math.max(m,a);
        }

        int a=fun(nums,i+1,m1);
        m=Math.max(m,a);

        return dp[i]=m;
    }
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int a:nums) m1.put(a,m1.getOrDefault(a,0)+1);

        List<Integer> input=new ArrayList<>(m1.keySet());

        Collections.sort(input);

        Arrays.fill(dp,-1);

        return fun(input,0,m1);
    }
}