package algorithm.binarytree;


//Binary Search Tree

public class BinarySearchTree {

    Node rootNode;

    public void insert(int data) {
        if (rootNode == null) {
            rootNode = new Node(data, null);
        } else {
            insertMethod(data, rootNode);
        }

    }

    private void insertMethod(int data, Node node) {
        //data smaller than the value in the node
        //Go TO left subtree
        if (node.getData() > data) {

            //if the left child not null, go there
            if (node.getLeftChild() != null) {
                insertMethod(data, node.getLeftChild());

                //left child null so create  a left child
            } else {
                node.setLeftChild(new Node(data, node));
            }
            // data greater than the value in the node Go TO right sub tree
        } else {
            //if the right child not null, go there
            if (node.getRightChild() != null) {
                insertMethod(data, node.getRightChild());
            } else {
                node.setRightChild(new Node(data, node));
            }

        }
    }

    public void remove(int data) {
        if (rootNode != null)
            remove(data, rootNode);

    }

    private void remove(int data, Node node) {
        if (node == null) return;

        if (node.getData() > data) {
            remove(data, node.getLeftChild());
        } else if (node.getData() < data) {
            remove(data, node.getRightChild());
        } else {

            //CASE 1
            //We found the item we want remove
            //if the node leaf node
            if (node.getLeftChild() == null && node.getRightChild() == null) {

                Node parent = node.getRoot();

                //The node is left child
                if (parent != null && parent.getLeftChild() == node) {
                    parent.setLeftChild(null);

                    // Node is right child
                } else if (parent != null && parent.getRightChild() == node) {
                    parent.setRightChild(null);

                }

                //Maybe the root node is the one we want to remove
                if (parent == null) rootNode = null;
                //remove node and make it available for GBC
                node = null;

            }
            // CASE 2 When we remove items with a single child
            // A single right child
            else if (node.getLeftChild() == null && node.getRightChild() != null) {
                Node parent = node.getRoot();
                //The node is left child
                if (parent != null && parent.getLeftChild() == node) {
                    parent.setRightChild(node.getRightChild());

                    // Node is right child
                } else if (parent != null && parent.getRightChild() == node) {
                    parent.setRightChild(node.getRightChild());

                }
                //when we deal with the root node
                if (parent == null) {
                    rootNode = node.getRightChild();
                }
                //Have to update the right child  parent
                node.getRightChild().setRoot(parent);
                node = null;

                //it is approximately the same CASE 2  but we have to deal with left child
            } else if (node.getLeftChild() != null && node.getRightChild() == null) {
                Node parent = node.getRoot();
                //The node is left child
                if (parent != null && parent.getLeftChild() == node) {
                    parent.setRightChild(node.getLeftChild());

                    // Node is right child
                } else if (parent != null && parent.getRightChild() == node) {
                    parent.setRightChild(node.getLeftChild());

                }
                //when we deal with the root node
                if (parent == null) {
                    rootNode = node.getRightChild();
                }
                //Have to update the right child  parent
                node.getLeftChild().setRoot(parent);
                node = null;

            } else {
                //remove two children
                //max item in the left subtree
                Node predecessor = getPredecessor(node.getLeftChild());

                //Swap the values
                int temp = predecessor.getData();
                predecessor.setData(node.getData());
                node.setData(temp);

                // we have to call the delete method recursively on the predecessor
                remove(data, predecessor);

            }
        }
    }


    private Node getPredecessor(Node node) {
        if (node.getRightChild() != null) {
            return getPredecessor(node.getRightChild());
        }
        return node;
    }

    //in order traversal --> left subtree -->  root node --> right subtree
    // in order traversal in O(N) linear running time
    public void in_order_traversal() {
        if (rootNode == null) {
            return;
        }
        traversal(rootNode);

    }

    //O(N)
    private void traversal(Node node) {
        if (node.getLeftChild() != null)
            traversal(node.getLeftChild());
        System.out.print(node + " - ");

        if (node.getRightChild() != null) {
            traversal(node.getRightChild());
        }

    }

    public int getMin() {
        if (rootNode == null) {
            return Integer.parseInt(null);
        }
        return getMin(rootNode);
    }

    private int getMin(Node node) {
        if (node.getLeftChild() != null) {
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }

    public int getMax() {
        if (rootNode == null)
            return Integer.parseInt(null);
        //the max items is the right most item in tree
        return getMax(rootNode);
    }

    private int getMax(Node node) {
        if (node.getRightChild() != null) {
            return getMax(node.getRightChild());
        }
        return node.getData();
    }

}

class Node {

    private int data;

    private Node leftChild;
    private Node rightChild;
    private Node root;

    //when use remove method


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
