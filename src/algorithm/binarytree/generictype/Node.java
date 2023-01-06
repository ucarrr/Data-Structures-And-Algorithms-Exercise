package algorithm.binarytree.generictype;

public class Node<T> {

    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;
    //when use remove method
    private Node<T> root;


    public Node(T data, Node<T> root) {
        this.data = data;
        this.root = root;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "data=" + data;
    }
}
