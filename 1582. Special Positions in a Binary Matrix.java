class Solution {
    public int numSpecial(int[][] mat) {

        // Pair p1 = new Pair(3, 4);

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int res = 0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    // Pair p1 = new Pair(i, j);
                    x.add(i);
                    y.add(j);
                    // res++;
                    boolean g = true;
                    for(int k = 0;k<mat.length;k++){
                        if(k!=i && mat[k][j]==1){
                            g=false;
                            break;
                        }
                    }
                    for(int k = 0;k<mat[0].length;k++){
                        if(k!=j && mat[i][k]==1){
                            g=false;
                            break;

                        }
                    }
                    if(g){
                        res++;
                    }
                }
            }
        }

        return res;
    }
}