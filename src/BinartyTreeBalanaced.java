import java.util.ArrayList;
import java.util.List;

public class BinartyTreeBalanaced {

    private static boolean result =true;

    public static boolean isBalanced(Treenode root) {
        maxDepth(root);
        return result;
    }

    public static int maxDepth(Treenode root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1)
            result = false;
        return 1 + Math.max(l, r);

    }

    public static void main(String[] args) {
        Treenode root = new Treenode(3);
        root.left = new Treenode(5);
        root.right = new Treenode(1);
        root.right.right = new Treenode(2);

        root.left.left = new Treenode(4);
        root.left.right = new Treenode(7);
        root.left.right.right= new Treenode(8);
        System.out.println(isBalanced(root));
    }
}