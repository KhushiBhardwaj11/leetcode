class Solution {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;
        for (int i = 0; i < n; i++) {
            if (maxReach < i) {
                // If the current index is beyond the maximum reachable index,
                // we can't proceed further.
                return false;
            }
            System.out.println("i: " + i + ", maxReach: " + maxReach);
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= n - 1) {
                // If we can reach or go beyond the last index, return true.
                return true;
            }
        }
        return true; // We can reach the last index.
    }
    
    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 1, 4};
        boolean result = canJump(nums);
        System.out.println(result);
    }
}
