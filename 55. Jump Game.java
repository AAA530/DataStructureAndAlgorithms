class Solution {
    public boolean canJump(int[] nums) {
        
        int max_index_reached = nums[0];
        for(int i=0;(i<=max_index_reached && i<nums.length);i++){
            if(nums[i]+i>max_index_reached){
                max_index_reached = nums[i]+i;
                
            }
        }

        if(max_index_reached >= nums.length-1){
            return true;
        }else{
            return false;
        }

    }
}