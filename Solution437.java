/*
ClassName:Solution437
@Author Zhou
@Create 2026/8/12 16:23
*/
public class Solution437 {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;

        int count=rootsum(root,targetSum);

        count+=pathSum(root.left,targetSum);
        count+=pathSum(root.right,targetSum);

        return count;
    }
    private int rootsum(TreeNode root, long targetSum){
        if(root==null)return 0;
        int count=0;
        if(root.val==targetSum){
            count++;
        }
        count+=rootsum(root.left,targetSum-root.val);
        count+=rootsum(root.right,targetSum-root.val);

        return count;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        root.right.right = new TreeNode(11);

        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);

        root.left.right.right = new TreeNode(1);
        Solution437 ss=new Solution437();
        System.out.println(ss.pathSum(root,8));
    }
}
