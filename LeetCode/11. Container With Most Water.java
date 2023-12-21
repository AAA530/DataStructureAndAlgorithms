class Solution {
    public int maxArea(int[] height) {
        int answer = -1;

        int i=0,j=height.length -1;
        while(i<j){
            int vol = (j-i)*(Math.min(height[i], height[j]));
            if(vol > answer){
                answer = vol;
            }
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }

        }
        return answer;
    }
}