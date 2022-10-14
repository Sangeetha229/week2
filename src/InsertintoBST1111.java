import java.util.LinkedList;
import java.util.Queue;

public class InsertintoBST1111 {
    public static Treenode insertIntoBST(Treenode root, int val) {
        if (root == null) return new Treenode(val);


        if (val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);
        return root;
    }

    static void levelorder(Treenode root) {

        if (root == null)
            return;
        Queue<Treenode> q1 = new LinkedList<>();

            q1.add(root);

        while (!q1.isEmpty()) {

            Treenode tempnode = q1.poll();
           // if (tempnode.val == 0)
           //     System.out.print("null ");
           // else
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
       // p.right.right=new Treenode();
       // p.right.left=new Treenode();

        Treenode result = insertIntoBST(p,5);


        levelorder(result);

    }
}
