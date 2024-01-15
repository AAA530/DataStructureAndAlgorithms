class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        
        // SortedSet<Integer> allPlayers = new TreeSet<Integer>();
        // SortedSet<Integer> loserSet = new TreeSet<Integer>();
        HashMap<Integer,Integer> loser = new HashMap<>();

        for(int i =0;i<matches.length;i++){
            // allPlayers.add(matches[i][0]);
            // allPlayers.add(matches[i][1]);
            // loserSet.add(matches[i][1]);




            if(loser.get(matches[i][1])!=null){
                // int temp = loser.get(matches[i][1]);
                // System.out.println(temp);
                loser.put(matches[i][1],loser.get(matches[i][1])+1);
            }
            loser.putIfAbsent(matches[i][1],1);
            loser.putIfAbsent(matches[i][0],0);
            // System.out.println(loser.get(matches[i][1]));
        }

        List<List<Integer>> ans = new ArrayList<>();
        SortedSet<Integer> noLosses = new TreeSet<Integer>();
        SortedSet<Integer> oneLoss = new TreeSet<Integer>();
        for(Map.Entry<Integer,Integer> mapElement : loser.entrySet()) {
            Integer key = mapElement.getKey();
            Integer value = mapElement.getValue();
            if(value==1){
                oneLoss.add(key);
            }else if(value==0){
                noLosses.add(key);
            }
        }

        List<Integer> ans1 = new ArrayList<>(noLosses);
        List<Integer> ans2 = new ArrayList<>(oneLoss);
        

        ans.add(ans1);
        ans.add(ans2);

        return ans;


        
    }
}