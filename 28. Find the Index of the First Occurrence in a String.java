class Solution {
    public int strStr(String haystack, String needle) {
        
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
 
        str1.append(haystack);
        str2.append(needle);
        int ans=0;
        
        while(str1.length()!=0){
            int i =0;
            
            boolean flag = true;
            while(i< str2.length() && i< str1.length()){
                if(str1.charAt(i)!=str2.charAt(i)){
                    flag = false;
                    break;
                }
                i++;
            }

            if(i!= str2.length()){
                flag = false;
            }

            if(flag){
                return ans;
            }

            str1.deleteCharAt(0);
            ans++;
        }

        return -1;

        

    }
}