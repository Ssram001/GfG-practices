/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    static Node reverseList(Node head) {
    // code here

    // METHOD-2
    Node curr = head;
    Node prev = null;
    Node frd = null;
    while(curr != null){
        frd = curr.next;
        curr.next= prev;
        prev = curr;
        curr = frd;
    }
    return prev;
}
    public boolean isPalindrome(Node head) {
        // code here
        
    //     Node temp = head;
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     while(temp!=null){
    //         arr.add(temp.data);
    //         temp=temp.next;
    //     }
    //   int i = 0, j = arr.size()-1;
    //   while(i<j){
    //     //   if(arr.get(i) != arr.get(j)) return false;   // WRONG HUMLOG ARRAYLIST ME JAVA ME 2 VALUE KO DIRECT COMPARE NHI KR SKTE H
    //     //   if(!arr.get(i).equals(arr.get(j))) return false;
    //     // or
    //     int a= arr.get(i) , b = arr.get(j);
    //     if(a!=b) return false;
    //       i++; j--;
    //   }
        // return true;
    
    
    Node slow = head;
    Node fast = head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node head2 = slow.next;
    slow.next = null;
    head2 = reverseList(head2);

   Node i = head;
   Node j = head2;
   while(j!=null){
       if(i.data != j.data) return false;
       i=i.next;
       j=j.next;
   }

    return true;
}
}