
class BTlefttoRight1021  {
    private static void printleafnode(Treenode p) {

        if (p == null) {
            return;
        }

        if (p.left != null)
            printleafnode(p.left);
        else
            System.out.println(p.val);
        if (p.right != null)
            printleafnode(p.right);



    }

    public static void main(String[] args) {
        Treenode p = new  Treenode(2);
        p.left = new  Treenode(4);
        p.right = new  Treenode(7);
        p.right.right = new  Treenode(10);
        p.left.left = new  Treenode(8);
        p.left.right = new  Treenode(5);
        printleafnode(p);


    }
}
