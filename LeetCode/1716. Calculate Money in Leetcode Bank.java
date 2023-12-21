class Solution {
    public int totalMoney(int n) {
        int s = 1+2+3+4+5+6+7;

        int a = n/7;
        int b = n%7;
        int ans = 0;
        // System.out.println(a+" "+b+" "+s);
        if(a !=0){
            ans = s*a + 7*(a-1)*(a)/2;
        }else{
            ans = 0;
        }
        // System.out.println(ans);
        for(int i=1;i<=b;i++){
            ans = ans + a+i;
        }

        return ans;
    }
}