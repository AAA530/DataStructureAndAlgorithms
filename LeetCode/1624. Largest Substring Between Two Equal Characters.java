class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int max = -1;
        int start = 0,end=0;
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))!=null){
                if(i - hm.get(s.charAt(i)) > max ){
                    max = i - hm.get(s.charAt(i));
                    start = hm.get(s.charAt(i));
                    end = i;
                }
            }
            hm.putIfAbsent(s.charAt(i),i);
        }

        if(max==-1){
            return -1;
        }

        return max-1;

    }
}