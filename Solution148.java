import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.sort;

/*
ClassName:Solution148
@Author Zhou
@Create 2026/8/5 15:39
*/
public class Solution148 {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode a=head;
        int n=0,length=0;
        ListNode result=new ListNode();
        while(a!=null)
        {
            length++;
            a=a.next;
        }
        int arr[]=new int[length];
        while (head!=null)
        {
            arr[n++]=head.val;
            head=head.next;
        }
        sort(arr);
        result.val=arr[0];
        ListNode j=result;
        for(int i=1;i<n;i++)
        {
            ListNode temp=new ListNode(arr[i]);
            j.next=temp;
            j=j.next;
        }
        return result;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(3);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;

        Solution148 ss=new Solution148();
        ListNode result=ss.sortList(head);

        System.out.println(result.toString());
    }
}
