class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(Integer val:map.values()){
            if(map2.get(val)!=null){
                return false;
            }
            map2.put(val,1);
        }
        return true;

    }
}