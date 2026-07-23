/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode temp1 = headA;
        int count1=0;
        while(temp1!=null){
            temp1=temp1.next;
            count1++;

        }

        int count2=0;
        ListNode temp2 = headB;
        while(temp2!=null){
            temp2=temp2.next;
            count2++;
        }

        if(count1>count2){
            int diff=count1-count2;
            for(int i=0; i<diff; i++){
                headA=headA.next;
            }

            while(headA!=headB){
                headA=headA.next;
                headB=headB.next;
            }
            return headA;
        }
        int diff=count2-count1;
        
        for(int i=0; i<diff; i++)
        {
            headB=headB.next;
        }
        while(headB!=headA){
            headB=headB.next;
            headA=headA.next;
        }
        return headA;

    }
}