class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i =0;i<=n;i++){  
            arr[i] = numb(i);
        }
        return arr;
    }
    public int numb(int n){
        int ans=0;
        while(n!=0){
            if(n%2==1){
                ans++;
            }
            n = n/2;
        }

        return ans;
    }

}