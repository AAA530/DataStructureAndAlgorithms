class Solution {
    public int[] productExceptSelf(int[] nums) {

        int mul = 1;
        int indexOfZero = -1;
        int numZeros = 0;

        for(int i=0;i<nums.length;i++){
            mul = nums[i] * mul;
            if(nums[i]==0){
                numZeros++;
                indexOfZero = i;
            }
        }
        int[] arr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(numZeros>1){
                arr[i] = 0;
            }else if(numZeros==1 && indexOfZero == i){
                int temp = 1;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]!=0){
                        temp = nums[j] * temp;
                    }
                }

                arr[i] = temp;
            }else{
                arr[i] = mul/nums[i];
            }
        }

        return arr;
        
    }
}