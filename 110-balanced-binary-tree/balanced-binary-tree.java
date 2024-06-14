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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        System.out.println(left);
        System.out.println(right);
        if(left==Integer.MIN_VALUE||right==Integer.MIN_VALUE){
            return false;
        }
         if(Math.abs(left-right)>1){
            return false;
        }
        return true;
    }
    public int getHeight(TreeNode root){
        //base case
        if(root==null){
            return 0;
        }
        int left=getHeight(root.left);
         int right= getHeight(root.right);
        if(right==Integer.MIN_VALUE|| left==Integer.MIN_VALUE) return Integer.MIN_VALUE;     

        if(Math.abs(left-right)>1){
            return Integer.MIN_VALUE;
        }

        return Math.max(left,right)+1;
    }
}