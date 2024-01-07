class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        
        for(int i=0;i<gain.length;i++){
            int temp = gain[i];
            gain[i] = gain[i]+sum;
            sum = sum + temp;
            if(sum>max){
                max = sum;
            }
        }

        if(max <0){
            return 0;
        }else{
            return max;
        }

    }
}