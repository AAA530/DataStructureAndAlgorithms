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

    class customDataStructure{
        TreeNode node;
        int depth;

        customDataStructure(TreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        } 
    }

    public int maxLevelSum(TreeNode root) {
        ArrayList<customDataStructure> qu = new ArrayList<>();

        customDataStructure cu = new customDataStructure(root,0);
        qu.add(cu);
        int currDepth = 0;
        int previousDepth = 0;
        int ans =Integer.MIN_VALUE;
        int depth = 0;
        int sum = 0;
        while(qu.size()!=0){
            // System.out.println(qu);
            customDataStructure currNode = qu.get(0);
            if(previousDepth == currNode.depth -1){
                if(sum>ans){
                    ans = sum;
                    depth = currNode.depth;
                }
                sum = 0;
            }
            sum = sum+currNode.node.val;
            if(currNode.node.left!=null){
                qu.add(new customDataStructure(currNode.node.left,currNode.depth+1));
            }
            if(currNode.node.right!=null){
                qu.add(new customDataStructure(currNode.node.right,currNode.depth+1));
            }
            previousDepth = currNode.depth;
            qu.remove(0);
        }

        if(sum>ans){
            ans = sum;
            depth = previousDepth+1;
        }
        sum = 0;

        return depth;
        
    }
}