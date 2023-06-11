/*Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.*/
public class SameBinaryTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both trees are empty, they are the same
        if (p == null && q == null) {
            return true;
        }

        // If one of the trees is empty while the other is not, they are not the same
        if (p == null || q == null) {
            return false;
        }

        // If the values of the current nodes are not equal, the trees are not the same
        if (p.val != q.val) {
            return false;
        }

        // Recursively compare the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SameBinaryTree solution = new SameBinaryTree();

        // Example usage
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(solution.isSameTree(p, q)); // Output: true
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
