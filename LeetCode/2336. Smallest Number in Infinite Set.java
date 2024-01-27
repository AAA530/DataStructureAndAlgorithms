class SmallestInfiniteSet {

    public TreeSet<Integer> ts; 

    public SmallestInfiniteSet() {
        this.ts = new TreeSet();
        for(int i =1;i<1001;i++){
            ts.add(i);
        }
    }
    
    public int popSmallest() {
        // System.out.println(this.ts.pollFirst());
        return this.ts.pollFirst();
    }
    
    public void addBack(int num) {
        this.ts.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */