package SwordOffer;

/**
 * 52两个链表的第一个公共节点
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class Offer52_publicNode_list {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode ha=headA;
        ListNode hb=headB;
        while (ha!=hb){
            ha=ha==null? headB:ha.next;
            hb=hb==null? headA:hb.next;
        }
        return ha;
    }
}
