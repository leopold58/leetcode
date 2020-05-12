public class lianbiao_huanxing2 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
    private ListNode getIntersect(ListNode head){
        if (head==null||head.next==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow){
                return slow;
            }
        }
        return null;
    }
    public ListNode detectCycle(ListNode head){
        if (head==null)
            return null;
        ListNode intersect=getIntersect(head);
        if (intersect==null)
            return null;
        ListNode first=head;
        while (first!=intersect){
            first=first.next;
            intersect=intersect.next;
        }
        return first;
    }
}
