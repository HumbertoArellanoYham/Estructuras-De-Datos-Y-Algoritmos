package Trees.exercice1;

public class InvertTree {
    public NodeTree invertMethod(NodeTree root){
        if(root == null) return null;

        NodeTree temporal = root.left;

        root.left = invertMethod(root.right);
        root.right = invertMethod(temporal);

        return root;
    }
}
