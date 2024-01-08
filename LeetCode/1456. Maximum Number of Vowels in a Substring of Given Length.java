class Solution {
    public int maxVowels(String s, int k) {
        int max = Integer.MIN_VALUE;
        int count =0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }

        max = count;
        for(int i=k,j=0;i<s.length();i++,j++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                count--;
            }

            max = Math.max(max,count);
        }

        return max;

        
    }
}