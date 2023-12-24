class Solution {
    List<Boolean> visited = new ArrayList<>();
    public int findCircleNum(int[][] isConnected) {
        for(int i=0;i<isConnected[0].length;i++){
            visited.add(false);
        }

        int ans =0;
        for(int i=0;i<isConnected[0].length;i++ ){

            System.out.println(visited.toString());
            if(visited.get(i)==false){
                ans++;
                visit(i,isConnected);
            }
        }
        return ans;
    }

    public void visit(int i,int[][] isConnected){
        visited.set(i,true);
        for(int j =0;j<isConnected[i].length;j++){
            if((isConnected[i][j]==1 && i!=j) && (visited.get(j)==false)){
                visit(j,isConnected);
            }
        }

        // visited.set(i,true);
    }
}