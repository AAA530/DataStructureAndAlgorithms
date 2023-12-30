class Solution {
    public int[] plusOne(int[] digits) {
        int ans = 0;
        // System.out.println(digits.length);
        for(int i = digits.length -1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }else{
                digits[i]=0;
                if(i==0){
                    // digits[i]++;
                    int[] ne = new int[digits.length+1];
                    ne[0] = 1;
                    for(int j =1,k=0;j<digits.length;j++,k++){
                        ne[j] = digits[k];
                    }
                    return ne;
                }
                
            }
        }

        return digits;


    }
}