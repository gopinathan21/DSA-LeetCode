public class Trees {
    public class TreeNode
    {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int value , TreeNode left , TreeNode right){
            this.value = value;
            this.left = left;
            this.right = right;
        };
    }

    public void displayNode(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        System.out.println(root.value);
        displayNode(root.left);
        displayNode(root.right);
    }

    public TreeNode getParent(TreeNode root , int value)
    {
        TreeNode rNode = root;

        while(root != null )
        {
            if(root.value == value)
            {
                return root;
            }
            else if(root.value <= value){
                rNode = root;
                root = root.right;
            }
            else if(root.value > value )
            {
                rNode = root;
                root = root.left;
            }
        }
        return rNode;
    }
    
    public void addNode(int value , TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        TreeNode parent = getParent(root ,value);
        Trees t = new Trees();
        TreeNode newN = t.new TreeNode(value , null , null);
        if (parent.value <= value) {
            if (parent.right != null) {
                TreeNode temp = parent.right;
                parent.right = newN;
                newN.left = temp;
                System.out.println(value + " is added as a right child of " + parent.value);
            } else {
                parent.right = newN;
                System.out.println(value + " is added as the right child of " + parent.value);
            }
        } else if (parent.value > value) {
            if (parent.left != null) {
                TreeNode temp = parent.left;
                parent.left = newN;
                newN.left = temp;
                System.out.println(value + " is added as a left child of " + parent.value);
            } else {
                parent.left = newN;
                System.out.println(value + " is added as the left child of " + parent.value);
            }
        }
        displayNode(root);
        System.out.println("Break");
    }

    public static void main(String[] args)
    {
        Trees t = new Trees();
        // TreeNode left = t.new TreeNode(5, null , null);
        // TreeNode right = t.new TreeNode(7 , null , null);
        TreeNode root  = t.new TreeNode(6 , null ,null);
        t.addNode(5, root);
        t.addNode(6, root);
        t.addNode(10, root);
        t.addNode(4, root);
        t.addNode( 8, root);
        t.addNode( 9, root);
        t.addNode(1, root);
    }
}


// public TreeNode getParent(TreeNode root , int value)
//     {
//         TreeNode rNode = new TreeNode(0, root, root);
//         if(root == null)
//         {
//             return rNode;
//         }
//        else if(root.value == value)
//         {
//             return root;
//         }
//         else if(root.value < value)
//         {
//             rNode = root;
//            return getParent(root.right, value);
//         }
//         else{
//             rNode = root;
//             return getParent(root.left, value);
//         }
//     }