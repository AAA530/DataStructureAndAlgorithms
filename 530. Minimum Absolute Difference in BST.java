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
    List<Integer> ans = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        
        inorder(root);
        int min = Integer.MAX_VALUE;

        for(int i=1;i<ans.size();i++){
            min = Math.min(min,ans.get(i)-ans.get(i-1));
        }

        return min;
       
    }

    public void inorder(TreeNode root) {
        if(root!=null){
            inorder(root.left);
            ans.add(root.val);
            inorder(root.right);
        }

    }

    

}