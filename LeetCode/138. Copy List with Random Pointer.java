/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head==null){
            return null;
        }

        Node temp = head;

        List<Node> l = new ArrayList<>();
        while(temp!=null){
            Node new_node = new Node(temp.val);
            l.add(new_node);
            temp = temp.next;
        }

        Node old_node = head;
        int i = 0;

        while(old_node!=null){
            Node new_node = l.get(i);
            if(i!=l.size()-1){
                new_node.next = l.get(i+1);
            }
            old_node = old_node.next;
            i++;
        }

        old_node = head;
        i = 0;
        while(old_node!=null){

            if(old_node.random!=null){
                int random_index = find_index(head,old_node.random);
                l.get(i).random = l.get(random_index);

                old_node = old_node.next;
            }else{
                old_node = old_node.next;
            }

            i++;
        }
        return l.get(0);
    }

    public int find_index(Node head,Node find){

        int i=0;

        while(head!=find){
            head = head.next;
            i++;
        }

        return i;

    }
}