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
public class customDataStructure{
    TreeNode node;
    int depth;
    customDataStructure(TreeNode node,int depth){
        this.node = node;
        this.depth = depth;
    }
}
 
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        int depth = 0;
        List<Integer> answer = new ArrayList<Integer>();
        List<customDataStructure> qu = new ArrayList<customDataStructure>();

        if(root==null){
            return answer;
        }

        customDataStructure cu = new customDataStructure(root,depth);
        qu.add(cu);
        
        while(qu.size()!=0){
            customDataStructure curr_node = qu.get(0);
            qu.remove(0);
            
            if(curr_node.node.right != null){
                customDataStructure new_node = new customDataStructure(curr_node.node.right,curr_node.depth+1);
                qu.add(new_node);
            }
            if(curr_node.node.left != null){
                customDataStructure new_node = new customDataStructure(curr_node.node.left,curr_node.depth+1);
                qu.add(new_node);
            }

            if(answer.size() == curr_node.depth){
                answer.add(curr_node.node.val);
            }
        }
        return answer;
    }
}