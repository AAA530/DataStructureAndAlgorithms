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
    public int maxAncestorDiff(TreeNode root) {

        if(root==null){
            return Integer.MIN_VALUE;
        }

        int left = Math.max(helper(root.left,root.val),helper(root.right,root.val));

        int leftA = Math.max(maxAncestorDiff(root.left),maxAncestorDiff(root.right));

        return Math.max(left,leftA);
    }
    public int helper(TreeNode root,int num){
        if(root==null){
            return Integer.MIN_VALUE;
        }

        int left = Math.max(helper(root.left,num),helper(root.right,num));
        return Math.max(Math.abs(num-root.val),left);
    }
}