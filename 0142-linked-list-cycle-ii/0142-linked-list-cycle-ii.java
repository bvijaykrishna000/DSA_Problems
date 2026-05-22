/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        int length = 0;
        Set<ListNode> s = new HashSet<>();
        while(head != null){
            if(!(s.contains(head))){
                s.add(head);
                length++;
            }
            else{
                break;
            }
            head = head.next;
        }
        while(temp != null){
            if(s.contains(temp) && length <= 0){
                return temp;
            }
            length--;
            temp = temp.next;
        }
        return null;
    }
}