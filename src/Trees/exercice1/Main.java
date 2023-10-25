package Trees.exercice1;

/*
 * Dada la raíz de un árbol binario, devuelve el árbol binario invertido.
 *
 * Ejemplo:
 *  Input:
 *        4
 *     2     7
 *   1   3  6  9
 *
 *  *  Output:
 *        4
 *     7    2
 *   9   6  3  1
 */

public class Main {
    public static void main(String[] args) {
        InvertTree invertTree = new InvertTree();

        NodeTree root = new NodeTree(4);
        root.left = new NodeTree(2);
        root.right = new NodeTree(7);

        root.left.left = new NodeTree(1);
        root.left.right = new NodeTree(3);

        root.right.right = new NodeTree(9);
        root.right.left = new NodeTree(6);

        NodeTree rootCurrent = invertTree.invertMethod(root);

        inOrderTraversal(rootCurrent);
    }

    public static void inOrderTraversal(NodeTree rootNode){
        if(rootNode != null){
            inOrderTraversal(rootNode.left);
            System.out.print(rootNode.value);
            inOrderTraversal(rootNode.right);
        }
    }
}
