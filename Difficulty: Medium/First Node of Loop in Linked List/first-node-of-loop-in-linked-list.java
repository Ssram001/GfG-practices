/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
         Node slow=head;
         Node fast=head;
         
         
         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
             if(fast==slow){
                 Node b = head;
                 while(b!=slow){
                     slow=slow.next;
                     b=b.next;
                 }
                 return b.data;
             }
         }
        
        //  while(fast!=null && fast.next!=null&&fast.next.next!=null){
        //      slow=slow.next;
        //      fast=fast.next.next.next;
        //      if(fast==slow) return true;
        //  }
         return -1;
    }
}