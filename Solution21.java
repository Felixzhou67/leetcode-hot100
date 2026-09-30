/*
ClassName:Solution21
@Author Zhou
@Create 2026/9/29 17:23
*/
public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null)return null;
        if(list1==null)return list2;
        if(list2==null)return list1;

        ListNode res = new ListNode();
        ListNode cur=res;
        while(list1!=null&list2!=null)
        {
            if(list2.val<=list1.val)
            {
                cur.next=list2;
                list2=list2.next;
            }else{
                cur.next=list1;
                list1=list1.next;
            }
            cur=cur.next;
        }
        if(list1==null){
            cur.next=list2;
        }else{
            cur.next=list1;
        }

        return res.next;
    }
}
