package algorithm.homework2;

public class MUHAMMET_UCAR_Q1 {

    public static void main(String[] args) {
        int[] keys = {10, 20, 30, 40};
        int[] freq = {4, 2, 6, 3};
        int n = keys.length;
        Node node;

          node= optimalSearchTree(keys, freq,0,n-1);

    }



    public static int sum(int freq[], int i, int j) {
        int s = 0;
        for (int k = i; k <= j; k++)
            s += freq[k];
        return s;
    }

    public static Node optimalSearchTree(int keys[], int freq[], int i, int j) {
        Node result=null;
        // Base case
        if (j < i)
            return new Node(-1, 0);


        int min = Integer.MAX_VALUE;


        for (int r = i; r <= j; r++) {

            Node left = optimalSearchTree(keys, freq, i, r - 1);
            Node right = optimalSearchTree(keys, freq, r + 1, j);


            int cost = left.cost + right.cost + sum(freq, i, j);
            if (cost < min) {
                min = cost;

                result = new Node(keys[r], min);
            }
        }

        return result;
    }

}


class Node {

    private int data;

    private Node leftChild;
    private Node rightChild;
    private Node root;
    int cost;

    //when use remove method
    Node(int data, int cost) {
        this.data = data;
        this.cost = cost;
    }

    public Node(int data, Node root) {
        this.data = data;
        this.root = root;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    @Override
    public String toString() {
        return "" + data;
    }
}


