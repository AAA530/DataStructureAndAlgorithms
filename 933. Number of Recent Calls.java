class RecentCounter {

    List<Integer> req = new ArrayList<>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        this.req.add(t);
        int ans = 0;
        for(int i =req.size()-1;i>=0;i--){
            if(req.get(i)>=t-3000){
                ans++;
            }else{
                break;
            }
        }

        return ans;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */