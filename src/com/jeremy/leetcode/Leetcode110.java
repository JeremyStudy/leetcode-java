package com.jeremy.leetcode;

public class Leetcode110 {
    //给定一个二叉树，判断它是否是高度平衡的二叉树。
//
// 本题中，一棵高度平衡二叉树定义为：
//
//
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
//
//
// 示例 1:
//
// 给定二叉树 [3,9,20,null,null,15,7]
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
// 返回 true 。
//
//示例 2:
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4]
//
//        1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
//
//
// 返回 false 。
//
//
// Related Topics 树 深度优先搜索


//leetcode submit region begin(Prohibit modification and deletion)

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        // 递归获取树的高度。一个空的树高度为-1
        private int height(TreeNode root) {
            if (root == null) {
                return -1;
            }
            return 1 + Math.max(height(root.left), height(root.right));
        }

        public boolean isBalanced(TreeNode root) {
            // 一个空的树满足平衡树的定义110
            if (root == null) {
                return true;
            }

            return Math.abs(height(root.left) - height(root.right)) < 2
                    && isBalanced(root.left)
                    && isBalanced(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
