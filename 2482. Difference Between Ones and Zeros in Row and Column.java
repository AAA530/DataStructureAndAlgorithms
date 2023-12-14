class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        for(int i=0;i<grid.length;i++){
            int t = 0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    t++;
                }
            }
            row.add(t);
        }

        for(int i=0;i<grid[0].length;i++){
            int t = 0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    t++;
                }
            }
            col.add(t);
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j] = 2*row.get(i) - grid.length + 2*col.get(j) - grid[0].length;
            }
        }

        return grid;
    }
}