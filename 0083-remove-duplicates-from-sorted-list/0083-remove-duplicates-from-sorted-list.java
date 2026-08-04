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
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null) return null;
        ListNode temp=head;
        ListNode curr=head.next;
        if(curr==null) return temp;
        while(curr!=null && temp!=null){
            if(temp.val==curr.val){
                temp.next=curr.next;
                // temp=curr.next;
                curr=temp.next;
            }else{
                temp=temp.next;
                curr=curr.next;
            }
        }

        return head;
    }
}