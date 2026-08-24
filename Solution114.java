import java.util.LinkedList;
import java.util.List;

/*
ClassName:Solution114
@Author Zhou
@Create 2026/8/12 11:01
*/
public class Solution114 {

    class Solution {
        public void flatten(TreeNode root) {
            List<TreeNode> list =new LinkedList<>();
            if(root==null)return;
            preorder(root,list);
            TreeNode cur=root;
            for(int i=1;i<list.size();i++)
            {
                cur.left=null;
                cur.right=list.get(i);
                cur=cur.right;
            }
        }
        public void preorder(TreeNode root, List<TreeNode> list)
        {
            if(root==null)return;

            list.add(root);
            preorder(root.left,list);
            preorder(root.right,list);
        }
    }

    public static void main(String[] args) {

    }
}
