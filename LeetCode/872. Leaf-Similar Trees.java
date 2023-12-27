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
    

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();

        traverse(root1,a1);
        traverse(root2,a2);

        // System.out.println(a1.toString());
        // System.out.println(a2.toString());


        if(a1.size()!=a2.size()){
            return false;
        }

        for(int i =0;i<a1.size();i++){
            if(a1.get(i)!=a2.get(i)){
                return false;
            }
        }

        return true;

        
    }

    public void traverse(TreeNode root1,List<Integer> a2){
        if(root1.left == null && root1.right == null){
            a2.add(root1.val);
        }else if(root1.right == null){
            traverse(root1.left,a2);
        }else if(root1.left == null){
            traverse(root1.right,a2);
        }else{
            traverse(root1.left,a2);
            traverse(root1.right,a2);
        }
    }
}