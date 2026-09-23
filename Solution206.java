/*
ClassName:Solution206
@Author Zhou
@Create 2026/9/23 17:06
*/
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode res=new ListNode();
        ListNode cur=head.next;
        res.next=head;
        head.next = null;
        while(cur!=null)
        {
            head=cur;
            cur=cur.next;
            head.next=res.next;
            res.next=head;
        }

        return res.next;
    }

}
