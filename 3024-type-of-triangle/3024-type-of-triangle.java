class Solution {
    public String triangleType(int[] nums) {

        // Cannot form triangle
        if (nums[0] + nums[1] <= nums[2] ||
            nums[0] + nums[2] <= nums[1] ||
            nums[1] + nums[2] <= nums[0]) {
            return "none";
        }

        // All 3 sides same
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }

        // Any 2 sides same
        if (nums[0] == nums[1] ||
            nums[1] == nums[2] ||
            nums[0] == nums[2]) {
            return "isosceles";
        }

        // All sides different
        return "scalene";
    }
}