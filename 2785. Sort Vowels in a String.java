class Solution {
    public String sortVowels(String s) {

        ArrayList<Integer> list_to_sort = new ArrayList<Integer>();
        ArrayList<Integer> index = new ArrayList<Integer>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' ){
                list_to_sort.add((int) s.charAt(i));
                index.add(i);
            }
        }

        Collections.sort(list_to_sort);
        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<list_to_sort.size();i++){
            sb.setCharAt(index.get(i), (char) list_to_sort.get(i).intValue());
        }

        return sb.toString();

        
    }
}