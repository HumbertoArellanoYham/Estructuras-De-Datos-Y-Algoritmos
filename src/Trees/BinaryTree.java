package Trees;

public class BinaryTree {
    public void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(Node root){
        if(root != null){
            System.out.print(root.value + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(Node root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }
}
