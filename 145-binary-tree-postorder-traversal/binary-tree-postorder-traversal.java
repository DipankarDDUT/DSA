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


    //using 1 stack 
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        List<Integer> ansList=new ArrayList<>();
        st.push(root);
        postOrderTraverse(ansList,st);
        // answer will come in reverse order if used two stack then it would come in correct order
        Collections.reverse(ansList); 
        return ansList;

    }
     public void postOrderTraverse(List<Integer> ansList,Stack<TreeNode> st){

            if(st.isEmpty()){
                return;
            }

            TreeNode temp=st.pop();
            //whenever pops add to ansList
            if(temp!=null)
            ansList.add(temp.val);
            if(temp!=null && temp.left!=null)
            st.push(temp.left);
            if(temp!=null && temp.right!=null)
            st.push(temp.right);
            postOrderTraverse(ansList,st);

     }
}