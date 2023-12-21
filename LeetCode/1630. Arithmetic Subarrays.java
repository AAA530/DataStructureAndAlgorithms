class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans = new ArrayList<Boolean>();

        for(int i=0;i<l.length;i++){
            int[] temp = new int[r[i]+1-l[i]];
            for(int k =0;k<r[i]+1 - l[i];k++){
                temp[k] = nums[l[i]+k];
            }
            Arrays.sort(temp,0,r[i]+1 - l[i]);
            // System.out.println(Arrays.toString(temp));

            if(l[i]==r[i]){
                ans.add(false);
                continue;
            }

            int dif = temp[1] - temp[0];
            boolean flag = true;

            for(int j = 0;j<temp.length-1;j++){
                if(temp[j+1]-temp[j] != dif){
                    flag = false;
                }
            }
            ans.add(flag);
        }

        return ans;
    }
}