import java.util.ArrayList;
import java.util.List;

/*
ClassName:Solution236
@Author Zhou
@Create 2026/8/12 16:53
*/
public class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return root;
        List<TreeNode> l1=new ArrayList<>();
        List<TreeNode> l2=new ArrayList<>();
        findpath(root,p,l1);
        findpath(root,q,l2);
        int i=0;
        while(i<l1.size()&&i<l2.size()&&l1.get(i)==l2.get(i)){
            i++;
        }
        return l1.get(i-1);
    }

    private boolean findpath(TreeNode root, TreeNode target, List<TreeNode> list)
    {
        if(root==null)return false;
        list.add(root);
        if(root==target)return true;

        if(findpath(root.left,target,list)|| findpath(root.right,target,list))return true;

        list.remove(list.size()-1);
        return false;
    }
}
