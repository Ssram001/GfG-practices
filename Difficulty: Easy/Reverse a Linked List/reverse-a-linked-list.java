/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        
        // METHOD -1
        
        // Node temp = head;
        // ArrayList<Node> arr = new ArrayList<>();
        // while(temp!=null){
        //     arr.add(temp);
        //     temp=temp.next;
        // }
        // int n = arr.size();
        // for(int i=n-1;i>=1;i--){
        //     // Node t1 = arr.get(i);
        //     // Node t2 = arr.get(i-1);
        //     // t1.next = t2;
            
        //     arr.get(i).next = arr.get(i-1);
            
        // }
        // arr.get(0).next = null;
        // return arr.get(n-1);
        
        
        
        // METHOD-2
        // Node curr = head;
        // Node prev = null;
        // Node frd = null;
        // while(curr != null){
        //     frd = curr.next;
        //     curr.next= prev;
        //     prev = curr;
        //     curr = frd;
        // }
        // return prev;
        
        
        // METHOD -3
        if(head.next == null) return head;
        Node a = head.next;
        head.next = null;
        Node  b = reverseList(a);
        a.next = head;
        return b;
    }
}