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
   public ListNode reverse(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        ListNode curr= temp.next;
        ListNode prev=null;
        while(curr!=null){
            curr= temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        
        if(head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode second = reverse(slow.next);
        ListNode start = head;
        while(second!=null){
            if(start.val!=second.val){
                return false;
            }
            start=start.next;
            second=second.next;
        }
        return true;
    }
}