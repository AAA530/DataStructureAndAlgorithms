class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> a = new HashSet<Integer>(); 
        for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
        }

        Set<Integer> b = new HashSet<Integer>(); 
        for(int i=0;i<nums2.length;i++){
            b.add(nums2[i]);
        }

        Set<Integer> difference_a = new HashSet<Integer>(a); 
        Set<Integer> difference_b = new HashSet<Integer>(b); 

        difference_a.removeAll(b);
        difference_b.removeAll(a);

        List<Integer> a_list = new ArrayList<>(difference_a);
        List<Integer> b_list = new ArrayList<>(difference_b);

        List<List<Integer>> listOfLists = new ArrayList<>();

        listOfLists.add(a_list);
        listOfLists.add(b_list);

        return listOfLists;
    }
}