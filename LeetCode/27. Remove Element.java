class Solution {
    public int removeElement(int[] nums, int val) {

        int[] temp = new int[nums.length];

        int k = 0,j=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==val){
            }else{
                System.out.println(nums[i]);
                temp[j]=nums[i];
                j++;
                k++;
            }
        }
        for(int i=0;i<j;i++){
            nums[i]=temp[i];
        }
        return k;
    }
}