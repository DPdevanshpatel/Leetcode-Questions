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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode dummy = new ListNode(-1);
        ListNode tt = dummy;

        ListNode temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }

        while(!st.isEmpty()){
            tt.next = st.pop();
            tt=tt.next;
        }
        tt.next=null;
        return dummy.next;
    }
}