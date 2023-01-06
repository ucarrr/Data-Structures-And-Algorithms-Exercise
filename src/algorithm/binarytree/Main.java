package algorithm.binarytree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(14);
        tree.insert(16);

        System.out.println(tree.getMax());
        System.out.println(tree.getMin());

        tree.in_order_traversal();
    }
}
