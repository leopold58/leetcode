import java.util.ArrayList;
import java.util.List;

public class liaobiao_huiwen_234 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //时间空间都为O（n），将链表复制进入数组中判断其是否为回文
    /*
    public boolean isPalindrome(ListNode head){
        List<Integer> vals=new ArrayList<>();
        ListNode currentNode=head;
        while (currentNode!=null){
            vals.add(currentNode.val);
            currentNode=currentNode.next;
        }
        int left=0;
        int right=vals.size()-1;
        while (left<right){
            if (!vals.get(left).equals(vals.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    */
    //时间复杂度为O（n），空间复杂度为O（1）
    public boolean isPalindrome(ListNode head){
        if (head==null)
            return true;
        ListNode second=endOfFirstHalf(head);
        ListNode secondde=reverseList(second.next);

        ListNode p1=head;
        ListNode p2=secondde;
        boolean result=true;
        while (p2!=null){
            if (p1.val!=p2.val)
                result=false;
            p1=p1.next;
            p2=p2.next;
        }
        second.next=reverseList(secondde);
        return result;
    }
    private ListNode endOfFirstHalf(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode tmp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=tmp;
        }
        return pre;
    }
}
