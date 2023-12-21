class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalcost = 0;
        int tempcost = 0;
        int start =0;
        for(int i=0;i<gas.length;i++){
            totalcost += gas[i] - cost[i];
            tempcost += gas[i] - cost[i];
            if(tempcost<0){
                start = i+1;
                tempcost = 0;
            }
        }

        if(totalcost < 0){
            return -1;
        }else{
            return start;
        }
    }
}