public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
 
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // In-order traversal method
    public static void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 5);
        insert(root, 3);
        insert(root, 7);
        insert(root, 2);
        insert(root, 4);
        insert(root, 6);
        insert(root, 8);

        System.out.print("In-order traversal: ");
        inOrderTraversal(root);
        System.out.println();
    }
}
