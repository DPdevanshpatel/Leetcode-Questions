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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        ListNode curr = temp.next;
        ListNode prev = null;

        while(curr!=null){
            curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode sec = reverse(slow.next);
        ListNode first = head;
        int sum=head.val;
        while(sec!=null){
            sum=Math.max(first.val+sec.val,sum);
            first=first.next;
            sec=sec.next;
        }
        return sum;
    }
}