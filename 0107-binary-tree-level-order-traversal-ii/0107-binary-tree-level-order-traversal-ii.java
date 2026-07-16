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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();

        if(root==null) return list;
        deque.offer(root);

        while(!deque.isEmpty())
        {
            int size= deque.size();
            List<Integer> l = new ArrayList<>();

            for(int i=0; i<size; i++)
            {
                TreeNode node = deque.poll();
                l.add(node.val);

                if(node.left!=null)
                {
                    deque.offer(node.left);
                }
                if(node.right!=null)
                {
                    deque.offer(node.right);
                }
            }
            list.addLast(l);
        }
        Collections.reverse(list);
        return list;
    }
}