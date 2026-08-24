import java.util.ArrayList;
import java.util.List;

/*
ClassName:Solution98
@Author Zhou
@Create 2026/8/11 11:43
*/
public class Solution98 {

    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)<=list.get(i-1))return false;
        }
        return true;
    }

    public void inorder(TreeNode root,List<Integer> list){
        if(root==null)return;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        Solution98 ss=new Solution98();
        System.out.println(ss.isValidBST(root));

    }
}
