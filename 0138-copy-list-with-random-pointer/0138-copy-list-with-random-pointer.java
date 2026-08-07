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
        Node temp1 = head;
        Node newNode = new Node(-1);
        Node temp2 = newNode;
        
        while(temp1!=null){
            Node a = new Node(temp1.val);
            temp2.next=a;
            temp2=a;
            temp1=temp1.next;
        }
        newNode = newNode.next;
        temp2=newNode;
        temp1=head;

        Node t = head;
        while(temp1!=null){
            temp1=temp1.next;
            t.next=temp2;
            t=temp2;
            temp2=temp2.next;
            t.next=temp1;
            t=temp1;
        }

        temp1=head;
        temp2=newNode;
        t=temp1;

        while(temp1!=null ){
            if(temp1.random==null) temp2.random=null;
            else temp2.random=temp1.random.next;
            temp1=temp2.next;
            if(temp1!=null) temp2=temp1.next;
        }

        temp1=head;
        temp2=newNode;
        while (temp1 != null) {
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if (temp1== null) {
                break;
            }
            temp2.next = temp1.next;
            if(temp2.next==null) break;
            temp2 = temp2.next;
        }
        return newNode;
    }
}