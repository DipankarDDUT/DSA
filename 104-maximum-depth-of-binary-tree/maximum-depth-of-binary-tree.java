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
    // we can use either level order traversal or recursion based 
    public int maxDepth(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        // if(root.left==null && root.right==null){
        //     return 1;
        // }
        return 1+ max(root.left,root.right);
    }
    public int max(TreeNode left,TreeNode right){
        
        int maxLeft=0;
        int maxRight=0;
        //base case
        if(left==null && right==null ){
            return 0;
        }
        if(left!=null){
          maxLeft= 1+ max(left.left,left.right);

        }
        if(right!=null){
           maxRight= 1 + max(right.left,right.right);

        }

        return maxLeft>maxRight?maxLeft:maxRight;

    }
}