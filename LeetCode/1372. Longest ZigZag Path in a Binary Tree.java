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
    public int longestZigZag(TreeNode root) {

        if(root==null){
            return 0;
        }

        int left =0;
        int right = 0;
        if(root.left!=null){
            left = rightZigZag(root.left);
        }
        if(root.right!=null){
            right = leftZigZag(root.right);
        }

        int mid = Math.max(longestZigZag(root.right),longestZigZag(root.left));
        int mid2 = Math.max(left,right);
        return Math.max(mid,mid2);
    }

    public int leftZigZag(TreeNode root){

        if(root.left==null){
            return 1;
        }else{
            return rightZigZag(root.left)+1;
        }

    }
    public int rightZigZag(TreeNode root){
        if(root.right==null){
            return 1;
        }else{
            return leftZigZag(root.right)+1;
        }
    }
}