/*
ClassName:Solution105
@Author Zhou
@Create 2026/8/12 15:00
*/
public class Solution105
{
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder,int preleft,int preright,int[] inorder,int inleft,int inright)
    {
        if(preleft>preright)return null;
        int rootval=preorder[preleft];//先序找根结点
        TreeNode root=new TreeNode(rootval);

        int rootIndex=inleft;
        while(inorder[rootIndex]!=rootval)rootIndex++;//中序找根结点

        int leftsize=rootIndex-inleft;

        root.left=build(preorder,preleft+1,preleft+leftsize,inorder,inleft,rootIndex-1);
        root.right=build(preorder,preleft+1+leftsize,preright,inorder,rootIndex+1,inright);

        return root;
    }
}
