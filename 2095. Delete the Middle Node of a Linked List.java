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
    public ListNode deleteMiddle(ListNode head) {

        ListNode trev = head;
        int i=0;
        while(trev!=null){
            i++;
            trev=trev.next;
        }

        if(i==1){
            return null;
        }

        int middle= (i)/2;

        ListNode temp = head;
        trev = head;

        while(middle>0 && trev!=null){
            temp = trev;
            trev= trev.next;
            middle--;
        }

        if(trev!=null){
            temp.next = trev.next;
        }else{
            temp.next = null;
        }
        
        return head;
        
    }
}