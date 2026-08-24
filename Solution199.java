import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
ClassName:Solution199
@Author Zhou
@Create 2026/8/11 15:01
*/
public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++)
            {
                TreeNode tmp=queue.poll();
                if(i==len-1)res.add(tmp.val);
                if(tmp.left!=null)queue.offer(tmp.left);
                if(tmp.right!=null)queue.offer(tmp.right);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        List<Integer> res=new ArrayList<>();
        Solution199 ss=new Solution199();
        res=ss.rightSideView(root);
        System.out.println(res);
    }
}
