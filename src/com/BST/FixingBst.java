package com.BST;

public class FixingBst {

    Node firstElement = null;
    Node secondElement = null;
    // The reason for this initialization is to avoid null pointer exception in the first comparison when prevElement has not been initialized
    Node prevElement = new Node(Integer.MIN_VALUE);
    public void recoverTree(Node root) {

        // In order traversal to find the two elements
        traverse(root);

        // Swap the dataues of the two nodes
        int temp = firstElement.data;
        firstElement.data = secondElement.data;
        secondElement.data = temp;
    }

    private void traverse(Node root) {

        if (root == null)
            return;

        traverse(root.left);

        // Start of "do some business",
        // If first element has not been found, assign it to prevElement (refer to 6 in the example above)
        if (firstElement == null && prevElement.data >= root.data) {
            firstElement = prevElement;
        }

        // If first element is found, assign the second element to the root (refer to 2 in the example above)
        if (firstElement != null && prevElement.data >= root.data) {
            secondElement = root;
        }
        prevElement = root;

        // End of "do some business"

        traverse(root.right);
    }

}
