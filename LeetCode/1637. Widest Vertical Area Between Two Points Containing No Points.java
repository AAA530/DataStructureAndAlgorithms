class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {

        int[] arr = new int[points.length];

        for(int i=0;i<points.length;i++){
            arr[i] = points[i][0];
        }

        Arrays.sort(arr,0,points.length);

        int ans = 0;
        for(int i=1;i<points.length;i++){
            ans = Math.max(arr[i]-arr[i-1],ans);
        }

        return ans;

        
    }
}