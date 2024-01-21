class Solution {

    class MiceInfo{
        int distance;
        int x,y;

        MiceInfo(int distance,int x,int y){
            this.distance = distance;
            this.x = x;
            this.y = y;
        }
    }

    public int nearestExit(char[][] maze, int[] entrance) {

        
        Queue<MiceInfo> queue = new LinkedList<>();
        int lenx = maze.length;
        int leny = maze[0].length;

        MiceInfo root = new MiceInfo(0,entrance[0],entrance[1]);
        queue.add(root);

        while(!queue.isEmpty()){
            MiceInfo currSquare = queue.poll();
            int x = currSquare.x;
            int y = currSquare.y;
            if(maze[x][y]=='v'){
                continue;
            }
            maze[x][y] = 'v';

            // System.out.println(x+" "+y);

            if(x+1==lenx || y+1 == leny || x-1 == -1 || y-1 == -1){
                if(currSquare!= root){
                    return currSquare.distance;
                }
            }

            if(x+1!=lenx && maze[x+1][y]=='.'){
                MiceInfo newInfo = new MiceInfo(currSquare.distance+1,x+1,y);
                queue.add(newInfo);
            }

            if(x-1 != -1 && maze[x-1][y]=='.'){
                MiceInfo newInfo = new MiceInfo(currSquare.distance+1,x-1,y);
                queue.add(newInfo);
            }

            if(y+1 != leny && maze[x][y+1]=='.'){
                MiceInfo newInfo = new MiceInfo(currSquare.distance+1,x,y+1);
                queue.add(newInfo);
            }
            if(y-1 != -1 && maze[x][y-1]=='.'){
                MiceInfo newInfo = new MiceInfo(currSquare.distance+1,x,y-1);
                queue.add(newInfo);
            }

        }

        return -1;

    }
}