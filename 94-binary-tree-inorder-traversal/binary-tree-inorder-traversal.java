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
        
         public List<Integer> inorderTraversal(TreeNode root) {

        if(root==null){
            return new  ArrayList<Integer>();
        }
        List<Integer> ansList=new ArrayList<>();
        inorderTraver(root,ansList);
        return ansList;

    }
    public void inorderTraver(TreeNode root,List<Integer> ansList){
         if(root==null){
            return ;
        }
       
        inorderTraver(root.left,ansList);
         ansList.add(root.val);
        inorderTraver(root.right,ansList);

    }
}