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

    int count = 1;

    public int goodNodes(TreeNode root) {


        traverse(root.left,root.val);
        traverse(root.right,root.val);

        return this.count;
        
    }

    public void traverse(TreeNode root,int value){
        if(root==null){
            return;
        }
        if(root.val >= value){
            this.count++;
        }
        traverse(root.left,Math.max(root.val,value));
        traverse(root.right,Math.max(root.val,value));
    }


}