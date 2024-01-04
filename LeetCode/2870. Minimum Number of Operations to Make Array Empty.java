class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hm.putIfAbsent(nums[i],0);
            hm.put(nums[i],hm.get(nums[i])+1);
        }
        int ans =0;
        for (Integer value : hm.values()) {
            if(value == 1){
                ans = -1;
                break;
            }
            if(value%3 == 0){
                ans = ans + value/3;
            }else{
                ans = ans + value/3 +1;
            }
        }

        return ans;


    }
}