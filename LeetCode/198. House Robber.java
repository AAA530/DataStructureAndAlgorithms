class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length]; // dp[i] = max amount robbed till ith house 
        dp[0] = nums[0];    // Base case(1)
        if(nums.length<=1){
            return dp[0];
        }
        dp[1] = Math.max(nums[0],nums[1]);  // Base case(2)

        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);    // Transition
        }

        return dp[nums.length-1];

    }
}