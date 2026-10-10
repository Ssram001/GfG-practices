/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
                // code here
        Node f=null;
        Node c=head;
        Node p=null;
        
        while(c!=null){
            f=c.next;
            c.next=p;
            c.prev=f;
            p = c;
            c=f;
        }
        return p;
        
    }
}