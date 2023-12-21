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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        if(head == null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode nextHead = head.next;
        ListNode previous = head;

        while(temp!=null && temp.next!=null){
            System.out.println(temp.val);
            ListNode t = temp.next;
            previous.next = t;
            temp.next = t.next;
            t.next = temp;
            previous = temp;
            temp = temp.next;
        }

        return nextHead;
        
    }
}