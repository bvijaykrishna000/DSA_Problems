class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next == null || head.next.next == null){
            return ;
        }
        while(fast != null){
            if(fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            else{
                break;
            }
        }
        ListNode p = slow;
        ListNode q = slow.next;
        ListNode r = slow.next.next;
        ListNode head2 = null;
        p.next = null;
        if(r == null){
            q.next = p;
            head2 = q;
        }
        while(r != null){
            if(r.next == null){
                q.next = p;
                r.next = q;
                head2 = r;
                break;
            }
            q.next = p;
            p = q;
            q = r;
            r = r.next;
        }
        ListNode temp = head;
        while(temp != null){
            if(temp.next == slow){
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        temp =head;
        ListNode nxt = null;
        ListNode rnxt = null;
        while(temp != null){
            nxt = temp.next;
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
            temp.next = nxt;
            if(nxt == null){
                break;
            }
            temp = nxt;           
        }
        if(head2 != null){ 
        temp.next = head2;
        }
    }
}
