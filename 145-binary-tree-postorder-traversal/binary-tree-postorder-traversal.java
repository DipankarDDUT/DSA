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
   
        
      public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return new  ArrayList<Integer>();
        }
        List<Integer> ansList=new ArrayList<>();
        postOrderTraverse(root,ansList);
        return ansList;

    }
    public void postOrderTraverse(TreeNode root,List<Integer> ansList){
         if(root==null){
            return ;
        }
        postOrderTraverse(root.left,ansList);
        postOrderTraverse(root.right,ansList);
        ansList.add(root.val);


    }
}