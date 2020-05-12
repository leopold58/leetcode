public class lianbiao_paixu {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode sortList(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode fast=head.next;
        ListNode slow=head;
        // 注意是与的关系  只有在快指针不为空并且快指针的后面也不为空的时候循环，一旦二者之一为空，退出循环。
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode sortL=new ListNode(0);
        ListNode res=sortL;

        ListNode left=sortList(head);
        ListNode right=sortList(second);

        while (left!=null&&right!=null){
            if (left.val<right.val){
                res.next=left;
                left=left.next;
            }
            else{
                res.next=right;
                right=right.next;
            }
            res=res.next;
        }
        res.next=left!=null? left:right;
        return sortL.next;
    }
}
