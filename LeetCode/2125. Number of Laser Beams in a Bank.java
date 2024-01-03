class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int previous = numberOfLasersOnFloor(bank[0]);
        for(int i=1;i<bank.length;i++){
            int b = numberOfLasersOnFloor(bank[i]);
            if(b!=0){
                ans = ans +(previous*b);
                previous = b;
            }
            
        }
        return ans;
    }
    public int numberOfLasersOnFloor(String s){
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                ans++;
            }
        }

        return ans;
    }
}