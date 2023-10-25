package Trees;

/*
        1
     2     3
   4    5     6
 7   8
 */

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        root.left.left.left = new Node(7);
        root.left.left.right = new Node(8);

        binaryTree.inOrderTraversal(root);

        System.out.println();

        binaryTree.preOrderTraversal(root);

        System.out.println();

        binaryTree.postOrderTraversal(root);
    }
}
