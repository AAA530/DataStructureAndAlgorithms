class Solution {
    public int findMinFibonacciNumbers(int k) {

        List<Integer> dp = new ArrayList<Integer>();

        dp.add(0);
        dp.add(1);

        int i =2;

        while(dp.get(i-1)+dp.get(i-2)<=k){
            dp.add(dp.get(i-1)+dp.get(i-2));
            i++; 
        }

        int len = dp.size()-1;
        int ans = 0;


        while(k!=0){
            if(k - dp.get(len)>=0){
                k = k - dp.get(len);
                ans++;
            }else{
                len--;
            }
        }

        return ans;
        
    }
}