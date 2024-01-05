class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];

        for(int i=0;i<spells.length;i++){
            int index = binary(potions,spells[i],success);
            ans[i] = potions.length - binary(potions,spells[i],success);
        }
        return ans;
        
    }

    public int binary(int[] potions,int factor,long success){

        int l=0;
        int h = potions.length-1;
        
        // int ans = -1;
        while(l<=h){
            int mid = l + (h-l)/2;
            long product = (long) potions[mid]*factor;

            if(product<success){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }

        return l;

    }
}