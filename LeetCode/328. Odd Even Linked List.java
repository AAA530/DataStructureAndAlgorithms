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
    public ListNode oddEvenList(ListNode head) {

        if(head==null){
            return head;
        }

        ListNode temp = head;
        ListNode prev = head;
        ListNode second = head.next;

        while(temp.next!=null && temp.next.next!=null){
            ListNode tempNext = temp.next;
            temp.next = temp.next.next;
            temp = tempNext;
        }
        temp.next = null;
        temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = second;
        return head;
        
        
    }
}