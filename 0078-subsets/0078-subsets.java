class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        finds(nums ,0, new ArrayList<>());
        return res;
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