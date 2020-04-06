public class TestPostOrder {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = new TreeNode(50);
        bst.root.left = new TreeNode(39);
        bst.root.right = new TreeNode(56);
        bst.root.left.left = new TreeNode(30);
        bst.root.left.right = new TreeNode(41);
        bst.root.right.left = new TreeNode(55);
        bst.root.right.right = new TreeNode(57);
        bst.root.right.right.left = new TreeNode(51);
        bst.root.right.right.right = new TreeNode(60);

        bst.postOrder();
    }
}
