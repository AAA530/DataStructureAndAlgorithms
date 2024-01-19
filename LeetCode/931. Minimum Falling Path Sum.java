class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int n = matrix.length-1;

        int[][] dp = new int[n+1][n+1];

        for(int i=0;i<=n;i++){
            for(int j =0;j<=n;j++){
                if(i==n){
                    dp[i][j] = matrix[i][j];
                }else{
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for(int i=n-1;i>=0;i--){
            for(int j =0;j<=n;j++){
                if(j==0){
                    dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j],dp[i+1][j+1]);
                }else if(j==n){
                    dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j],dp[i+1][j-1]);
                }else{

                    // System.out.println("i:"+i+"j:"+j);
                    dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j+1],Math.min(dp[i+1][j],dp[i+1][j-1]));
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i =0;i<=n;i++){
            ans = Math.min(ans,dp[0][i]);
        }

        return ans;


    }
}