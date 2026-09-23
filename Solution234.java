/*
ClassName:Solution234
@Author Zhou
@Create 2026/9/23 17:42
*/
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        ListNode cur=head;
        ListNode mid=head;
        while(cur!=null){
            mid=mid.next;
            cur=cur.next;
            if(cur!=null)cur=cur.next;
        }
        mid=reverse(mid);
        while(head!=null&&mid!=null)
        {
            if(head.val!=mid.val){
                return false;
            }
            head=head.next;
            mid=mid.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        if(head==null)return null;

        ListNode cur=head.next;
        ListNode res=new ListNode();
        res.next=head;
        head.next=null;
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
