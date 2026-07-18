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
    public int kthSmallest(TreeNode root, int k) {
        Queue<Integer> values = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode current = q.poll();

            values.offer(current.val);

            if (current.left != null) {
                q.offer(current.left);
            }

            if (current.right != null) {
                q.offer(current.right);
            }
        }

        while(!values.isEmpty()){
            list.add(values.poll());
        }

        Collections.sort(list);

        return list.get(k-1);
    }
}