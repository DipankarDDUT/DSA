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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result=new ArrayList<>();
        // passing root and level 0 
        getRightSide(root,0,result);
        return result;

        
    }

    public List<Integer> getRightSide(TreeNode node,int level,List<Integer> result){
        
        if(node ==null){
            return result;
        }
        //check if level equals to list size insert it 
        if(result.size()==level){
            result.add(node.val);
        }
        getRightSide(node.right,level+1,result);
        getRightSide(node.left,level+1,result);
        return result;
    }  
}