class Solution {
    public int helper(int start, int end, int nums[]) {
        int dp[] = new int[nums.length + 2];
        for (int i = end - 1; i >= start; i--) {
            int pick = nums[i] + dp[i + 2];
            int notpick = dp[i + 1];
            dp[i] = Math.max(pick, notpick);
        }
        return dp[start];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];  // Important edge case!
        return Math.max(helper(0, n - 1, nums), helper(1, n, nums));
    }
}
