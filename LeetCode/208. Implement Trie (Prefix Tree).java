
class CustomData{
    public HashMap<Character,CustomData> map;
    public boolean isEnd;
    public CustomData() {
        this.map = new HashMap<>();
        this.isEnd = false;
    }
}

class Trie {

    public CustomData cusData;


    public Trie() {
        this.cusData =  new CustomData();
    }
    
    public void insert(String word) {

        CustomData temp = cusData;
        // System.out.println(cusData.val);

        for(int i = 0;i<word.length();i++){
            // System.out.println(word.charAt(i));
            if(temp.map.get(word.charAt(i))!=null){
                
                temp = temp.map.get(word.charAt(i));
                // System.out.println(temp.val+"=");
                
            }else{
                CustomData newNode = new CustomData();
                // newNode.val = word.charAt(i);
                temp.map.put(word.charAt(i),newNode);
                temp = newNode;
                // System.out.println(temp.val);
            }

            if(i == word.length()-1){
                temp.isEnd = true;
            }
        }
        
    }
    
    public boolean search(String word) {

        CustomData temp = cusData;

        for(int i =0;i<word.length();i++){
            if(temp.map.get(word.charAt(i))!=null){
                temp = temp.map.get(word.charAt(i));
            }else{
                return false;
            }
        }

        return temp.isEnd;
        
    }
    
    public boolean startsWith(String prefix) {
        CustomData temp = cusData;

        for(int i =0;i<prefix.length();i++){
            if(temp.map.get(prefix.charAt(i))!=null){
                temp = temp.map.get(prefix.charAt(i));
            }else{
                return false;
            }
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */