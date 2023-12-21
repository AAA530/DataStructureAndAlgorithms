class Solution {
    public int maxProduct(int[] nums) {

        int max = -1;
        int j=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>= max){
                max= nums[i];
                j=i;
            }
        }

        int max2 = -1;
        for(int i =0;i<nums.length;i++){
            if(i!=j){
                max2 = Math.max(max2,nums[i]);
            }
        }

        return (max-1)*(max2-1);
    }
}