/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        Node temp =head;
        int count=0;
        Node prev=null;
        while(temp!=null){
            prev=temp;
            temp=temp.next;
            count++;
        }
         temp =head;
        if(head==null || head.next==null) return null;
        // prev.next=null;
        for(int i=1;i<count-1;i++){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}