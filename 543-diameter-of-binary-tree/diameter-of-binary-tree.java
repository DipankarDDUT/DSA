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

 /**
 Problem with this brute force is first each node looping over entire tree
 so 0(n2)
  */
// class Solution {
//     public int maxHeight=0;
//     public int diameterOfBinaryTree(TreeNode root) {
//         max(root);
//         return maxHeight;
//     }

//     public int max(TreeNode root){
//         if(root==null){
//             return maxHeight;
//         }
//         int leftH=findHeight(root.left);
//         int rightH=findHeight(root.right);
//              if(maxHeight<leftH+rightH){
//             maxHeight=leftH+rightH;
//         }
//         // System.out.println(root.val);
//         System.out.println(leftH+rightH);
//         // System.out.println(rightH);
//         maxHeight=max(root.left);
//         maxHeight=max(root.right);
     
//         return maxHeight;

//     }

//     public int findHeight(TreeNode node){
//         int tempL=0;
//         int tempR=0;
//         if(node==null){
//             return 0;
//         }
//          tempL=1+ findHeight(node.left);
//          tempR=1+findHeight(node.right);

//          return tempL>tempR?tempL:tempR;
//     }

   

// }
//Optimal aprroach 
class Solution {
    public int maxHeight=0;
    public int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        return maxHeight;
    }

    public int findMax(TreeNode node){
        if(node==null){
            return 0;
        }
        int lh=findMax(node.left);
        int rh=findMax(node.right);

        if(maxHeight<lh+rh){
            maxHeight=lh+rh;
        }
        if(lh>rh){
            return 1 + lh;
        }
        return 1 + rh;
    }

}