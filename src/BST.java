public class BST {
    public TreeNode root;

    public BST() {
        this.root = null;
    }

    public void postOrder(TreeNode treeNode) {
        if (treeNode != null) {
            postOrder(treeNode.left);
            postOrder(treeNode.right);
            System.out.println(treeNode.element);
        }
    }

    public void postOrder() {
        postOrder(root);
    }
}
