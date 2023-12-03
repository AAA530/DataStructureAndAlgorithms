class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int graphLength = rooms.size()-1;

        List<Integer> sol = new ArrayList();

        for(int i=0;i<rooms.size();i++){
            sol.add(-1);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while(!queue.isEmpty()){
            int ele = queue.peek();
            queue.remove();
            sol.set(ele,1);
            for(int i=0;i<rooms.get(ele).size();i++){
                
                if(sol.get(rooms.get(ele).get(i)) == -1){
                    queue.add(rooms.get(ele).get(i));
                }
            }
            
        }

        for(int i=0;i<rooms.size();i++){
            if(sol.get(i)==-1){
                return false;
            }
        }
        return true;
    }
}