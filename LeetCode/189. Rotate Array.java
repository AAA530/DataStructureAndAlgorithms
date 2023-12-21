class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> store = new ArrayList<>();

        k = nums.length-(k%nums.length);
        for(int i=0;i<k;i++){
            store.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if((i+k)<nums.length){
                nums[i] = nums[i+k];
            }else{
                nums[i] = store.get((i+k)%nums.length);
            }
            
        }
        return;
    }
}