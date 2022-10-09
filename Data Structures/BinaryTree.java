public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    // insert node into the tree
    public void addNode(Node node, int data) {
        if (data < node.data) {
            if (node.left != null)
                addNode(node.left, data);
            else
                node.left = new Node(data);
        } else {
            if (node.right != null)
                addNode(node.right, data);
            else
                node.right = new Node(data);
        }
    }

    // traversing the tree (inorder)
    public void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print(node.data + " ");
            traverseTree(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(5);
        tree.addNode(root, 3);
        tree.addNode(root, 7);
        tree.addNode(root, 4);
        tree.addNode(root, 5);
        tree.traverseTree(root);
    }
}
