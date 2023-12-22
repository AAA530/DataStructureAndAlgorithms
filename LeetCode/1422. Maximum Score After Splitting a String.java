class Solution {
    public int maxScore(String s) {

        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)){
                return 1;
            }else if(s.charAt(0)=='1'){
                return 0;
            }else{
                return 2;
            }
        }

        int[] zeros = new int[s.length()];
        int[] ones = new int[s.length()];

        int one =0;
        int zero = 0;

        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            if(s.charAt(i)=='0'){
                zero++;
            }
            if(s.charAt(j)=='1'){
                one++; 
            }
            zeros[i] = zero;
            ones[j]= one;
        }

        // System.out.println(Arrays.toString(zeros));
        // System.out.println(Arrays.toString(ones));

        int max = 0;

        for(int i=1;i<s.length()-1;i++){
            max = Math.max(zeros[i]+ones[i],max);
        }

        return max;

        
    }
}