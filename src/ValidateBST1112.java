public class ValidateBST1112 {
    public static boolean isValidBST(Treenode root) {
        return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    static boolean isBST(Treenode root, long min, long max)
    {
        if(root == null)
            return true;

        if(root.val <= min || root.val >= max)
            return false;

        boolean left = isBST(root.left,min,root.val);
        boolean right = isBST(root.right,root.val,max);

        return left && right;
    }

public static void main(String[] args) {
    Treenode p = new  Treenode(5);
    p.left = new  Treenode(3);
    p.right = new  Treenode(6);
    p.left.left = new  Treenode(1);
    p.left.right = new  Treenode(4);
    System.out.println(" valid tree : "+  isValidBST(p));

}

}
