class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        List<Integer> arr_g = new ArrayList<Integer>();
        List<Integer> arr_m = new ArrayList<Integer>();
        List<Integer> arr_p = new ArrayList<Integer>();

        for(int i=0;i<garbage.length;i++){
            String t = garbage[i];
            int g=0,m=0,p=0;
            for(int j=0;j<t.length();j++){
                if(t.charAt(j)=='G'){
                    g++;
                }
                if(t.charAt(j)=='M'){
                    m++;
                }
                if(t.charAt(j)=='P'){
                    p++;
                }
            }
            arr_g.add(g);
            arr_m.add(m);
            arr_p.add(p);
        }


        int len_g=0,len_p=0,len_m=0;

        for(int i=0;i<garbage.length;i++){
            if(arr_g.get(i) !=0){
                len_g = i;
            }
            if(arr_p.get(i) !=0){
                len_p = i;
            }
            if(arr_m.get(i) !=0){
                len_m = i;
            }
        }




        List<Integer> dp_g = new ArrayList<Integer>();
        List<Integer> dp_p = new ArrayList<Integer>();
        List<Integer> dp_m = new ArrayList<Integer>();

        dp_g.add(arr_g.get(0));
        dp_p.add(arr_p.get(0));
        dp_m.add(arr_m.get(0));


        for(int i =1;i<=len_g;i++){
            dp_g.add(dp_g.get(i-1)+travel[i-1]+arr_g.get(i));
        }

        for(int i =1;i<=len_m;i++){
            dp_m.add(dp_m.get(i-1)+travel[i-1]+arr_m.get(i));
        }

        for(int i =1;i<=len_p;i++){
            dp_p.add(dp_p.get(i-1)+travel[i-1]+arr_p.get(i));
        }

        return dp_g.get(len_g)+dp_p.get(len_p)+dp_m.get(len_m);


    }
}