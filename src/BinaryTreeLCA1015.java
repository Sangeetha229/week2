
public class BinaryTreeLCA1015 {
    public Treenode lca(Treenode root, Treenode n1, Treenode n2) {
        if (root == null) {
            return null;
        }
        //comment start
        System.out.println();
        System.out.print("root value:" + root.val + " ");
        //comment end

          //return to left value

        // If either n1 or n2 matches with root's key, report
        // the presence by returning root (Note that if a key is
        // ancestor of other, then the ancestor key becomes LCA

        if (root == n1 || root == n2) {
            return root;
        }

        // Look for keys in left and right subtrees

        Treenode left = lca(root.left, n1, n2);
        //comment start
//        if (left != null)
//            System.out.print("left:" + left.val + " ");
        //comment end

        Treenode right = lca(root.right, n1, n2);

        //comment start
//        if (right != null) {
//           System.out.print("right:" + right.val + " ");
//        }
        //comment end

        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA

        if (left != null && right != null) {
            return root;
        }

        //comment start
//        if (left != null)
//            System.out.print("left:" + left.val + " ");
//        if (right != null)
//            System.out.print("right" + right.val + " ");
        //comment end

        // Otherwise check if left subtree or right subtree is LCA
        return left != null ? left : right;
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

        BinaryTreeLCA1015 BTlca = new BinaryTreeLCA1015();
        Treenode result = BTlca.lca(root, p, q);
        System.out.println(result.val);


    }
}





