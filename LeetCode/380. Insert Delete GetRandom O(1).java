import java.util.Random;

class RandomizedSet {

    HashMap<Integer,Integer> rand = new HashMap<>();
    List<Integer> helper = new ArrayList<>();
    Random randomNumber = new Random(); 

    public RandomizedSet() {
    }
    
    public boolean insert(int val) {

        if(rand.get(val)==null){
            helper.add(val);
            rand.put(val,helper.size()-1);
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean remove(int val) {
        if(rand.get(val)==null){
            return false;
        }else{
            int index = rand.get(val);
            
            int last_ele = helper.get(helper.size()-1);
            helper.set(index,last_ele);
            helper.remove(helper.size()-1);
            rand.put(last_ele,index);
            rand.remove(val);
            return true;
        }
    }
    
    public int getRandom() {


        int upperbound = rand.size();
        int int_random = randomNumber.nextInt(upperbound); 
        // System.out.println("int_random"+int_random);

        return helper.get(int_random);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */