class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right ){
            return head;
        }
        ListNode ln = null;
        ListNode rn = null;
        int count =1;
        ListNode temp = head;
        ListNode con = null;
        while(temp != null){
            if(count == left-1){
                con = temp;
            }
            if(count == left){
                ln = temp;
            }
            if(count == right){
                break;
            }
            temp = temp.next;
            count++;
        }
        rn = temp;
        System.out.println(rn.val);
        ListNode rnt = rn.next;
        rn.next = null;
        ListNode p = ln;
        ListNode q = ln.next;
        ListNode r = ln.next.next;
        ListNode head2 = null;
        p.next = null;
        if(r == null ){
            q.next = p;
            head2 = q;
        }
        while(r != null){
            if(r.next == null ){
                r.next = q;
                q.next = p;
                head2 = r;
                break;
            }
            q.next = p;
            p = q;
            q = r;
            r = r.next;
        }
        ListNode con2 = head2;
        while(con2.next!= null){
            con2 = con2.next;
        }
        if(con == null && rnt == null){
            return head2;
        }
        if(con == null){
            con2.next = rnt;
            return head2;
        }
        con.next = head2;
        if(rnt != null){
            con2.next = rnt;
        }
        return head;
    }
}
