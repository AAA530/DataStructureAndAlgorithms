class Solution {
    public String decodeString(String s) {

        StringBuilder in = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        int n=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                n = Integer.parseInt(in.toString());
                // System.out.println(n);
                int bracketNumber = 0;
                String inBracket = "";
                for(int j =i+1;j<s.length();j++){
                    if(s.charAt(j)==']' && bracketNumber == 0){
                        inBracket = decodeString(s.substring(i+1,j));
                        // System.out.println(inBracket);
                        i = j;
                        break;
                    }
                    if(s.charAt(j)=='['){
                        bracketNumber++;
                    }
                    if(s.charAt(j)==']'){
                        bracketNumber--;
                    }
                }
                for(int k = 0;k<n;k++){
                    ans.append(inBracket);
                }
                // decodeString()

                in.setLength(0);
            }else if(s.charAt(i)-'0'<=9 && s.charAt(i)-'0' >= 0){
                in.append(s.charAt(i));
            }else{
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}