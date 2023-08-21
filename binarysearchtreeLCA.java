package ICS2105TAKEAWAYCATONE;
class Node {
    int data;
    Node left;
    Node right;
}

public class binarysearchtreeLCA {
    static Node lca(Node root, int v1, int v2) {
        // If the root is null, return null
        if (root == null)
            return null;
        // If both v1 and v2 are smaller than the root, search in the left subtree
        if (root.data > v1 && root.data > v2)
            return lca(root.left, v1, v2);
        // If both v1 and v2 are larger than the root, search in the right subtree
        if (root.data < v1 && root.data < v2)
            return lca(root.right, v1, v2);
        // If one of v1 and v2 is smaller and the other is larger than the root,
        // or one of them is equal to the root, then the root is the LCA
        return root;
    }

    public static void main(String[] args) {
        // Initialize the binary search tree
        Node root = new Node();
        root.data = 4;
        root.left = new Node();
        root.left.data = 2;
        root.left.left = new Node();
        root.left.left.data = 1;
        root.left.right = new Node();
        root.left.right.data = 3;
        root.right = new Node();
        root.right.data = 7;
        root.right.left = new Node();
        root.right.left.data = 6;
        // Find the LCA of values 1 and 7
        Node result = lca(root, 1, 7);
        // Print the result
        System.out.println(result.data);
    }
}
