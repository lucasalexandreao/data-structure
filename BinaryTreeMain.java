public class BinaryTreeMain {
    public static void main(String[] args) {

        Node node9 = new Node(9);
        Node node8 = new Node(8);
        Node node7 = new Node(7);

        Node node6 = new Node(6);
        Node node5 = new Node(5, node8, node9);
        Node node4 = new Node(4, null, node7);

        Node node3 = new Node(3, node5, node6);
        Node node2 = new Node(2, node4, null);
        Node node1 = new Node(1, node2, node3);

        BinaryTree bt1 = new BinaryTree(node1);
        bt1.preOrder();
        bt1.inOrder();
        bt1.postOrder();
        bt1.byLevel();

    }
}
