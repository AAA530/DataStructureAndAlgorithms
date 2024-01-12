
class LRUCache {

    class LRUBlock{
        public int priority;
        public int val;

        LRUBlock(int val,int priority){
            this.val = val;
            this.priority = priority;
        }
    }

    public HashMap<Integer,LRUBlock> hm = new HashMap<>();
    public int allowedCapacity =0;
    public int currCapactiy = 0;
    public int leastPriority = 1;

    public LRUCache(int capacity) {
        this.allowedCapacity = capacity;
    }
    
    public int get(int key) {
        if(hm.get(key) != null){
            // hm.put(key,);
            hm.get(key).priority = leastPriority;
            leastPriority++;
            // System.out.println("hm.get("+key+")"+hm.get(key).priority);

            return hm.get(key).val;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(hm.get(key)!= null){
            hm.put(key,new LRUBlock(value,leastPriority));
            leastPriority++;
            return;
        }

        if(this.currCapactiy<allowedCapacity){
            hm.put(key,new LRUBlock(value,leastPriority));
            leastPriority++;
            this.currCapactiy++;
            // System.out.println("currCapactiy"+this.currCapactiy);
            return;
        }

        int deleteKey = -1;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<Integer,LRUBlock> mapElement : hm.entrySet()) {
            int tempKey = mapElement.getKey();
            // System.out.println("hm.get("+tempKey+")"+mapElement.getValue().priority);
            // min = Math.min(min,mapElement.getValue().priority);
            if(mapElement.getValue().priority<min){
                min = mapElement.getValue().priority;
                deleteKey = tempKey;
            }
        }

        hm.remove(deleteKey);
        // System.out.println("deleteKey:"+deleteKey);
        hm.put(key,new LRUBlock(value,leastPriority));
        leastPriority++;
        return;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */