class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = Math.min(word1.length(),word2.length());
        int t1=0;
        int t2=0;
        StringBuilder str = new StringBuilder();
        int i=0;
        while(t1<word1.length() && t2<word2.length()){

            if(i%2==0){
                str.append(word1.charAt(t1));
                t1++;
            }else{
                str.append(word2.charAt(t2));
                t2++;
            }
            i++;
        }

        while(t1<word1.length()){
            str.append(word1.charAt(t1));
            t1++;
        }
        while(t2<word2.length()){
            str.append(word2.charAt(t2));
            t2++;
        }
        return str.toString();
    }
}