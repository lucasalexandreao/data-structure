import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
    
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }

    public void preOrder() {
        preOrder(this.root);
        System.out.println();
    }

    public void preOrder(Node node) {

        if (node != null) {
            System.out.print(node.getValue() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
        
    }

    public void inOrder() {
        inOrder(this.root);
        System.out.println();
    }

    public void inOrder(Node node) {

        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrder(node.getRight());
        }

    }

    public void postOrder() {
        postOrder(this.root);
        System.out.println();
    }

    public void postOrder(Node node) {

        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getValue() + " ");
        }

    }

    public void byLevel() {
        byLevel(this.root);
        System.out.println();
    }

    public void byLevel(Node node) {

        Node current = null;

        if(node != null) {

            Queue<Node> nodeQueue = new LinkedList<>();
            nodeQueue.add(node);

            while (!nodeQueue.isEmpty()) {

                current = nodeQueue.remove();
                System.out.print(current.getValue() + " ");

                if(current.getLeft() != null)
                    nodeQueue.add(current.getLeft());
                
                if(current.getRight() != null)
                    nodeQueue.add(current.getRight());

            }

        }

    }

}
