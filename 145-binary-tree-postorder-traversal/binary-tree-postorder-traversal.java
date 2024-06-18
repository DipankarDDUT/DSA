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
   

   // using recursion 
        
    //   public List<Integer> postorderTraversal(TreeNode root) {
    //     if(root==null){
    //         return new  ArrayList<Integer>();
    //     }
    //     List<Integer> ansList=new ArrayList<>();
    //     postOrderTraverse(root,ansList);
    //     return ansList;

    // }
    // public void postOrderTraverse(TreeNode root,List<Integer> ansList){
    //      if(root==null){
    //         return ;
    //     }
    //     postOrderTraverse(root.left,ansList);
    //     postOrderTraverse(root.right,ansList);
    //     ansList.add(root.val);


    // }


    //using 2 stack 
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        Stack<Integer> stRoot=new Stack<>();
       
        st.push(root);
        // postOrderTraverse(ansList,st);
        while(!st.isEmpty()){
            TreeNode temp=st.pop();
            //whenever pops add to ansList
            if(temp!=null)
            stRoot.push(temp.val);
            if(temp!=null && temp.left!=null)
            st.push(temp.left);
            if(temp!=null && temp.right!=null)
            st.push(temp.right);
        }
         List<Integer> ansList=new ArrayList<>(stRoot);
         Collections.reverse(ansList);
        return ansList;

    }
}