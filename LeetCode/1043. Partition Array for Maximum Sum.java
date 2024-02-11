class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {


        int[] dp = new int[arr.length+1];

        for(int i = 1;i<=arr.length;i++){

            int currMax = 0,max=0;

            for(int j = 1;j<=k && j<=i ;j++){
                
                currMax = Math.max(currMax,arr[i-j]);
                max = Math.max(max,dp[i-j]+j*currMax);

            }

            dp[i] = max;

        }

        return dp[arr.length];


        
    }
}