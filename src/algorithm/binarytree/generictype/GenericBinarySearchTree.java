package algorithm.binarytree.generictype;

public class GenericBinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> rootNode;


    @Override
    public void insert(T data) {
        if (rootNode == null) {
            rootNode = new Node<>(data, null);
        } else {
            insertMetod(data, rootNode);
        }
    }

    private void insertMetod(T data, Node<T> node) {
        if (node.getData().compareTo(data) < 0) {

        }
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public void in_order_traversal() {

    }

    @Override
    public T getMin() {
        return null;
    }

    @Override
    public T getMax() {
        return null;
    }
}
