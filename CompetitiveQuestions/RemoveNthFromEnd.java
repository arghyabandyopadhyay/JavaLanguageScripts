public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return null;
        ListNode toBeDeleted=null;
        ListNode current=head;
        int i=0;
        while(current.next!=null&&i<n-1){
            current=current.next;
            i+=1;
        }
        if(i!=n-1&&current.next!=null)return null;
        while(current.next!=null){
            current=current.next;
            if(toBeDeleted==null)toBeDeleted=head;
            else toBeDeleted=toBeDeleted.next;
        }
        if(toBeDeleted==null)head=head.next;
        else toBeDeleted.next=toBeDeleted.next.next;
        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
