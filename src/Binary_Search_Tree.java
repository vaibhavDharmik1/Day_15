class Node {

    int data;

    Node left;

    Node right;
}

class NodeOperations {

    public Node insert(Node node,int data) {

        if (node == null ) {

            return createNode(data);
        }

        if ( data < node.data) {

            node.left = insert(node.left,data);

        }

        else if (data > node.data) {

            node.right = insert(node.right,data);

        }

        return node;
    }

    private Node createNode(int data) {

        Node root = new Node();

        root.data = data;

        root.left = null;

        root.right = null;

        return root;
    }

    public boolean searchNode(Node node,int data) {

        if (node == null) return false;

        boolean isPresent = false;

        while (node != null) {

            if (data < node.data) {

                node = node.left;
            }

            else if(data > node.data) {

                node=node.right;
            }

            else {

                isPresent = true;

                break;
            }
        }
        return  isPresent;
    }
}

public class Binary_Search_Tree {

    public static void main(String[] args) {

        NodeOperations operations = new NodeOperations();

        Node node = new Node();

        operations.insert(node,56);

        operations.insert(node,32);

        operations.insert(node,22);

        operations.insert(node,40);

        operations.insert(node,11);

        operations.insert(node,3);

        operations.insert(node,16);

        operations.insert(node,70);

        operations.insert(node,60);

        operations.insert(node,95);

        operations.insert(node,65);

        operations.insert(node,67);

        operations.insert(node,63);

        System.out.println("if element present in the tree :: "+ operations.searchNode(node,63));

        System.out.println("operations Done");
    }
}