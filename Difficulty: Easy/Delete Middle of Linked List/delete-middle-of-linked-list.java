/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        Node temp=head;
        if(head==null || temp.next == null) return null;
        
        Node slow = head;
        Node fast = head;
        Node prev = null;
        
        while(fast!=null && fast.next!=null){ 
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            
        }
        // slow.data=slow.next.data;
        // slow.next=slow.next.next;
        
         prev.next = slow.next;
        
        return head;
    }
}