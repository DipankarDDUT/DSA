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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
          Queue<TreeNode> queueMap=new LinkedList<>();
          List<List<Integer>> ansList=new LinkedList<List<Integer>>();
           if(root==null){
            return ansList;
        }
        queueMap.offer(root);
        while(!queueMap.isEmpty()){
            int size=queueMap.size();
            
            List<Integer> subList=new ArrayList<>();
            for(int j=0;j<size;j++){
                TreeNode rootNode=queueMap.poll();
                if(rootNode.left!=null){
                   queueMap.offer(rootNode.left);
                }
                if(rootNode.right!=null){
                    queueMap.offer(rootNode.right);
                }
                subList.add(rootNode.val);    
            }
            ansList.add(subList);
            
            
        }
        return ansList;
    }
}