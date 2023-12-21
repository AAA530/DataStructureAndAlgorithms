class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int i = 0;

        int p1=0,p2=0;

        if(n <= 2){
            return 2;
        }

        while(p2<n){

            p2=p1;

            while(p2<n && nums[p1]==nums[p2] ){
                if(p2-p1<2){
                    nums[i]=nums[p1];
                    i++;
                }
                p2++;
            }
            p1 = p2;

        }

        return i;
        
    }
}