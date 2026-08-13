/* structure of list node:

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
       

        // Node dummy = new Node(0);// TLE ERROR
        // Node tail = dummy;

        // Node t1 = head1;

        // while (t1 != null) {

        //     Node t2 = head2;

        //     while (t2 != null) {
        //         if (t1.data == t2.data) {
        //             tail.next = new Node(t1.data);
        //             tail = tail.next;
        //             break;
        //         }
        //         t2 = t2.next;
        //     }

        //     t1 = t1.next;
        // }

        // return dummy.next;






        // Node dummy = new Node(0);// IT IS ONLY USED FOR SORTED LIST
        // Node tail = dummy;

        // while (head1 != null && head2 != null) {

        //     if (head1.data == head2.data) {
        //         tail.next = new Node(head1.data);
        //         tail = tail.next;

        //         head1 = head1.next;
        //         head2 = head2.next;
        //     }
        //     else if (head1.data < head2.data) {
        //         head1 = head1.next;
        //     }
        //     else {
        //         head2 = head2.next;
        //     }
        // }

        // return dummy.next;
    



    
// TLE ERROR
        // Node dummy = new Node(0);
        // Node tail = dummy;

        // Node curr1 = head1;

        // while (curr1 != null) {

        //     Node curr2 = head2;

        //     while (curr2 != null) {
        //         if (curr1.data == curr2.data) {
        //             tail.next = new Node(curr1.data);
        //             tail = tail.next;
        //             break;
        //         }
        //         curr2 = curr2.next;
        //     }

        //     curr1 = curr1.next;
        // }

        // return dummy.next;
    




      

        HashSet<Integer> set = new HashSet<>();

        // Store all values of head2
        Node temp = head2;
        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }

        // Create result list
        Node dummy = new Node(0);
        Node tail = dummy;

        temp = head1;

        while (temp != null) {
            if (set.contains(temp.data)) {
                tail.next = new Node(temp.data);
                tail = tail.next;
            }
            temp = temp.next;
        }

        return dummy.next;
    

    }
}