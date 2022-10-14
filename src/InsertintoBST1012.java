import java.util.*;

public class InsertintoBST1012 {//check iterative also

    public static Treenode insertIntoBST(Treenode root, int val) {
        if (root == null)
            return new Treenode(val);
        if (val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);
        return root;
    }

    static void levelorder(Treenode root) {
        Queue<Treenode> q1 = new LinkedList<>();
        if (root == null)
            return;
        else
            q1.add(root);

        while (!q1.isEmpty()) {

            Treenode tempnode = q1.poll();
            if (tempnode.val == 0)
                System.out.print("null ");
            else
                System.out.print(tempnode.val + " ");


            if (tempnode.left != null) {
                q1.add(tempnode.left);
            }

            if (tempnode.right != null) {
                q1.add(tempnode.right);
            }

        }
    }

    public static void main(String... args) {

        Treenode p = new Treenode(4);
        p.left = new Treenode(2);
        p.right = new Treenode(7);
        p.left.left = new Treenode(1);
        p.left.right = new Treenode(3);

//        Treenode p = new Treenode(40);
//        p.left = new Treenode(20);
//        p.right = new Treenode(60);
//        p.left.left = new Treenode(10);
//        p.left.right = new Treenode(30);
//        p.right.left = new Treenode();
//        p.right.right = new Treenode();
        //     Treenode result=insertIntoBST(p,25);

        Treenode result = insertIntoBST(p, 5);
        levelorder(result);

    }
}
