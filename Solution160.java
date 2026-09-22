import javax.swing.text.html.HTMLDocument;

/*
ClassName:Solution
@Author Zhou
@Create 2026/9/22 21:08
*/
public class Solution160 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            ListNode tagA=headA;
            ListNode tagB=headB;

            while(tagA!=tagB)
            {
                if(tagA!=null)
                {
                    tagA=tagA.next;
                }else {
                    tagA=headB;
                }

                if(tagB!=null)
                {
                    tagB=tagB.next;
                }else {
                    tagB=headA;
                }

            }
            return tagA;
        }
}
