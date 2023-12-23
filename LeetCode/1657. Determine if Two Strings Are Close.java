class Solution {

    public boolean areArraysEqual(Integer[] array1, Integer[] array2) {
        // Check if arrays are null or have different lengths
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }

        // Sort the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays element by element
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {

                // System.out.println("========="+array1[i]+" "+array2[i]+"="+(array1[i] != array2[i]));
                return false;
            }
        }
        return true;
    }

    public boolean closeStrings(String word1, String word2) {

        HashMap<Character,Integer> hash1 = new HashMap<>();
        HashMap<Character,Integer> hash2 = new HashMap<>();

        if(word1.length()!=word2.length()){
            return false;
        }

        for(int i=0;i<word1.length();i++){
            if(hash1.get(word1.charAt(i))==null){
                hash1.put(word1.charAt(i),1);
            }else{
                hash1.put(word1.charAt(i),hash1.get(word1.charAt(i))+1);
            }
        }

        for(int i=0;i<word2.length();i++){
            if(hash2.get(word2.charAt(i))==null){
                hash2.put(word2.charAt(i),1);
            }else{
                hash2.put(word2.charAt(i),hash2.get(word2.charAt(i))+1);
            }
        }

        Integer[] val1 = hash1.values().toArray(new Integer[0]);
        Character[] key1 = hash1.keySet().toArray(new Character[0]);
        Character[] key2 = hash2.keySet().toArray(new Character[0]);
        Integer[] val2 = hash2.values().toArray(new Integer[0]);

        System.out.println(key1.length +" + "+key2.length);
        System.out.println(val1[0] +" + "+val2[0]);

        // System.out.println(areArraysEqual(val1,val2) +"+"+ areArraysEqualWithDuplicates(key1,key2));


        return areArraysEqual(val1,val2) && areArraysEqualWithDuplicates(key1,key2);
        
    }

    private static boolean areArraysEqualWithDuplicates(Character[] array1, Character[] array2) {
        System.out.println(array1.length +" + "+array2.length);
        // Check if both arrays are null
        if (array1 == null && array2 == null) {
            return true;
        }

        // Check if only one of the arrays is null
        if (array1 == null || array2 == null) {
            return false;
        }

        // Check if arrays have the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Sort the arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare the sorted arrays element-wise
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }


    

}