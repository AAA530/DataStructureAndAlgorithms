/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {

        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
            
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.size()/2;i++){
            // System.out.println(arr.size()-i-1);
            max = Math.max(max, arr.get(i)+arr.get(arr.size()- 1 - i));
        }

        return max;
        
    }
}