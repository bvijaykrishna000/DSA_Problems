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
        if(head == null || head.next == null){
            return head;
        }
        while(head != null && head.next !=null && head.val == head.next.val ){
            int k = head.val;
            while(head != null && head.val == k){
                head = head.next;
            }
        }
        // return head;
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode res = slow;
        ListNode fast = head.next;
        while(fast != null){
            if(fast.next != null && fast.val == fast.next.val){
                int k = fast.val;
                while(fast != null && fast.val == k){
                    fast = fast.next;
                }
                if(fast == null){
                    slow.next = null;
                }
            }
            else{
                slow.next = fast;
                slow = slow.next;
                fast = fast.next;
            }
        }

        return res;
    }
}