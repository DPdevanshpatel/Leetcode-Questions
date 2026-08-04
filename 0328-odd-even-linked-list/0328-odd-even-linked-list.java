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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddidx = new ListNode(-1);
        ListNode evenidx = new ListNode(-1);
        ListNode odddummy = oddidx;
        ListNode evendummy = evenidx;

        ListNode temp=head;
        int count=0;
        while(temp!=null){
            if(count%2==0){
                ListNode a = new ListNode(temp.val);
                odddummy.next=a;
                odddummy=a;
            }else{
                ListNode a = new ListNode(temp.val);
                evendummy.next=a;
                evendummy=a;
            }
            count++;
            temp=temp.next;
        }
        odddummy.next=evenidx.next;
        return oddidx.next;
    }
}