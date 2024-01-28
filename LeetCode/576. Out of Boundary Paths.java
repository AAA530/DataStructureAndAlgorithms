class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
        long[][][] dp = new long[m+2][n+2][maxMove+1];
        long mod = 1000000000+7;

        if(maxMove ==0){
            return 0;
        }


        for(int i=0;i<m+2;i++){
            for(int k=0;k<maxMove+1;k++){
                dp[i][0][k] = 1;
                dp[i][n+1][k] = 1;
            }
        }
        
        for(int i=0;i<n+2;i++){
            for(int k=0;k<maxMove+1;k++){
                dp[0][i][k] = 1;
                dp[m+1][i][k] = 1;
            }
        }
        


        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(dp[i][j][1]);
        //     }
        //     System.out.println();
        // }


        // int ans =0;

        for(int k=1;k<maxMove+1;k++){
            for(int i=1;i<m+1;i++){
                for(int j=1;j<n+1;j++){

                    long ans =0;
                    ans += dp[i+1][j][k-1] % mod;
                    ans += dp[i][j+1][k-1] % mod;
                    ans += dp[i-1][j][k-1] % mod;
                    ans += dp[i][j-1][k-1] % mod;

                
                    dp[i][j][k] = ans % mod;  
                

                }
            }

            // System.out.println("k="+k);
            // for(int x=0;x<m;x++){
            //     for(int y=0;y<n;y++){
            //         System.out.print(dp[x][y][k]);
            //     }
            //     System.out.println();
            // }
            // System.out.println();
        }

        return (int)dp[startRow+1][startColumn+1][maxMove];
        
    }
}