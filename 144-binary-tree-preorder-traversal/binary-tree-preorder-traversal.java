/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new  ArrayList<Integer>();
        }
        List<Integer> ansList=new ArrayList<>();
        preTraverse(root,ansList);
        return ansList;

    }
    public void preTraverse(TreeNode root,List<Integer> ansList){
         if(root==null){
            return ;
        }
        ansList.add(root.val);
        preTraverse(root.left,ansList);
        preTraverse(root.right,ansList);

    }
}