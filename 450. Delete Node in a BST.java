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
    public TreeNode deleteNode(TreeNode root, int key) {

        if(root!=null){

            if(key<root.val){
                root.left = deleteNode(root.left,key);
            }else if(key>root.val){
                root.right = deleteNode(root.right,key);
            }
            else{
                if(root.left==null && root.right==null){
                    return null;
                }
                if(root.left==null || root.right==null){
                    return root.left!=null ? root.left : root.right;
                }

                TreeNode temp = root.left;
                while(temp.right!=null){
                    temp = temp.right;
                }
                root.val = temp.val;
                root.left = deleteNode(root.left,temp.val);
            }

        }

         return root;
        
        
    }

}