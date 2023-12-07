class Solution {
    public String largestOddNumber(String num) {

        int max = -9999999;
        String temp = "";

        for(int i=num.length()-1;i>=0;i--){
            int t = num.charAt(i) - '0';
            if(t%2 == 1){
                temp = num.substring(0,i+1);
                return temp;
            }
        }

        return temp;
    }
}