class Solution {
    Set<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        finds(nums ,0, new ArrayList<>());
        return new ArrayList<>(res);


        
    }
    public void finds(int[] nums,int index ,List<Integer> subset){
        if (index == nums.length){
            res.add(new ArrayList<>(subset) );
            return;



        }
        // pic 
        subset.add(nums[index]);
        finds(nums , index+1 , subset );

        // backtracking 
        subset.remove(subset.size()-1);

        // not pic 
        finds(nums , index+1 , subset );

    }
}