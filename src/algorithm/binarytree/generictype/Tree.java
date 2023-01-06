package algorithm.binarytree.generictype;

public interface Tree <T> {

    public void insert(T data);
    public void remove(T data);

    //in order traversal --> left subtree -->  root node --> right subtree
    public void in_order_traversal();

    public T getMin();

    public T getMax();
}
