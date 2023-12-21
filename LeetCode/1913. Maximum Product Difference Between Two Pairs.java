class Solution {
    public int maxProductDifference(int[] nums) {

        int max=Integer.MIN_VALUE;
        int max_index=0;
        int min=Integer.MAX_VALUE;
        int min_index = 0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>=max){
                max = nums[i];
                max_index = i;
            }

            if(nums[i]<=min){
                min = nums[i];
                min_index = i;
            }
        }

        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(i!= max_index){
                max2 = Math.max(max2,nums[i]);
            }

            if(i!= min_index){
                min2 = Math.min(min2,nums[i]);
            }
            
        }

        return ((max*max2) - (min*min2));
        
    }
}