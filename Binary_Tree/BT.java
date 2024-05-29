class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    int count = 0;
    public void inorderTraversal(Node root)
    {
        if(root == null) return ;
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }
    public int c(Node root)
    {
        if(root == null) 
        {
            return 0;
        }

        int leftC = c(root.left);
        int rightC = c(root.right);
        count += Math.abs(leftC + rightC);
        root.data = leftC + rightC + 1;
        return (root.data - 1) + leftC + rightC; 
    }

    public void preOrderTraversal(Node root)
    {
        if(root == null)
        {
            return; 
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating the binary tree for the first question
        tree.root = new Node(0);
        tree.root.left = new Node(0);
        tree.root.right = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.left.left = new Node(3);
        tree.root.right.left = new Node(0);
        tree.root.right.right = new Node(0);

        //ans Should be 7 2 5 1 10 3 13

        // Printing the inorder traversal of the binary tree
        // System.out.println("Inorder traversal: ");
        // tree.inorderTraversal(tree.root);
        // System.out.println("preOrder traversal: ");
        // tree.preOrderTraversal(tree.root);
        tree.c(tree.root);
    }
}
