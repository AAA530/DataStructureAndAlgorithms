class Solution {
    public List<Integer> sequentialDigits(int low, int high) {


        List<Integer> ans = new ArrayList<Integer>();

        StringBuilder str = new StringBuilder();
        // while()

        int num = 12;
        addNums(12,low,high,ans);
        addNums(23,low,high,ans);
        addNums(34,low,high,ans);
        addNums(45,low,high,ans);
        addNums(56,low,high,ans);
        addNums(67,low,high,ans);
        addNums(78,low,high,ans);
        addNums(89,low,high,ans);


        // addNums()
        Collections.sort(ans);
        return ans;

    }

    public void addNums(int start,int low,int high,List<Integer> ans){

        if(start>=low && start<=high){
            ans.add(start);
        }
        StringBuilder str = new StringBuilder();

        str.append(Integer.toString(start));
        while(str.charAt(str.length()-1) != '9' ){
            str.append((char)((int)str.charAt(str.length()-1) + 1));
            if(Integer.parseInt(str.toString())<low){
                // 
            }else if(Integer.parseInt(str.toString())<=high){
                ans.add(Integer.parseInt(str.toString()));
            }else{
                return;
            }
            
        }
    }
}