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
        public boolean isBalanced(TreeNode node){
            if(node == null)
                return true;
            return dfs(node)[0] == 1;
        }

        public int[] dfs(TreeNode node){
            if(node == null)
                return new int[]{1,0};
            int[] left = dfs(node.left);
            int[] right = dfs(node.right);

            boolean balanced = left[0] == 1 && right[0] ==1 && Math.abs(left[1] - right[1])<=1;
            int height = Math.max(left[1], right[1]) + 1;
            return new int[]{balanced?1:0,height};
        }
}
