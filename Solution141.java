import java.util.HashMap;

/*
ClassName:Solution141
@Author Zhou
@Create 2026/9/24 11:32
*/
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map=new HashMap<>();
        int i=1;
        if(head==null||head.next==null)return true;
        while(head!=null){
            if(!map.containsKey(head)){
                map.put(head,i);
            }else{
                return false;
            }
            i++;
            head=head.next;
        }
        return true;
    }
}
