import java.util.Scanner;

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

    // inorder traversing
    public void inorderTraverse(Node node) {
        if (node != null) {
            inorderTraverse(node.left);
            System.out.print(node.data + " ");
            inorderTraverse(node.right);
        }
    }

    // preorder traversing
    public void preorderTraverse(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraverse(node.left);
            preorderTraverse(node.right);
        }
    }

    // postorder traversing
    public void postorderTraverse(Node node) {
        if (node != null) {
            postorderTraverse(node.left);
            postorderTraverse(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root node: ");
        int rootValue = sc.nextInt();
        Node root = new Node(rootValue);
        int option, value;
        do {
            System.out.println(
                    "\nMENU\n1. Add node\n2. Inorder Traversal\n3. Preorder Traversal\n4. Postorder Traversal\n5. Exit");
            System.out.print("Enter any one option: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter node value: ");
                    value = sc.nextInt();
                    tree.addNode(root, value);
                    break;
                case 2:
                    tree.inorderTraverse(root);
                    System.out.println();
                    break;
                case 3:
                    tree.preorderTraverse(root);
                    System.out.println();
                    break;
                case 4:
                    tree.postorderTraverse(root);
                    System.out.println();
                    break;
                case 5:
                    break;
            }
        } while (option != 5);
        sc.close();
    }
}
