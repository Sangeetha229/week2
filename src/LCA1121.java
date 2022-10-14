public class LCA1121 {
    private Treenode ans;

    public LCA1121() {
        // Variable to store LCA node.
        this.ans = null;
    }

    private boolean recurseTree(Treenode currentNode, Treenode p, Treenode q) {

        // If reached the end of a branch, return false.
        if (currentNode == null) {
            return false;
        }
        //comment start
//        System.out.println();
//        System.out.print("root value:" +currentNode.val + " ");
        //comment end

        //comment start
//        if (currentNode. left != null)
//            System.out.print("left before:" +currentNode. left.val + " ");
        //comment end

        // Left Recursion. If left recursion returns true, set left = 1 else 0
        int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;

        //comment start
//        if (currentNode. left!= null)
//            System.out.print("left after:" +currentNode. left.val + " ");
        //comment end

        //comment start
//        if (currentNode. right != null)
//            System.out.print("right Before:" +currentNode. right.val + " ");
        //comment end

        // Right Recursion
        int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;

        //comment start
//        if (currentNode.right != null)
//            System.out.print("right after:" +currentNode. right.val + " ");
        //comment end

        // If the current node is one of p or q
        int mid = (currentNode == p || currentNode == q) ? 1 : 0;
        //comment start
        System.out.println();
        System.out.print("mid value:" +currentNode.val + " ");
        //comment end


        // If any two of the flags left, right or mid become True
        if (mid + left + right >= 2) {
            this.ans = currentNode;
        }

        // Return true if any one of the three bool values is True.
        return (mid + left + right > 0);
    }

    public Treenode lowestCommonAncestor(Treenode root, Treenode p, Treenode q) {
        // Traverse the tree
        this.recurseTree(root, p, q);
        return this.ans;
    }

    public static void main(String[] args) {
        Treenode root = new Treenode(3);
        root.left = new Treenode(5);
        root.right = new Treenode(1);
        root.right.right = new Treenode(2);
        root.left.left = new Treenode(4);

        Treenode p = root.left;
        root.left.right = new Treenode(9);

        Treenode q = root.right.right;

        LCA1121 BTlca = new LCA1121();
        Treenode result = BTlca.lowestCommonAncestor(root, p, q);
        System.out.println("Answer  :"+result.val);


    }
}

