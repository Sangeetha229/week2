import java.util.LinkedList;
import java.util.Queue;

public class listtoBalancedBST1013 {

    public static Treenode result(int[] array) {
        return balancedBST(array, 0, array.length - 1);

    }

    public static Treenode balancedBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Treenode node = new Treenode(arr[mid]);

        /* Recursively construct the left subtree and make it
         left child of root */
        node.left = balancedBST(arr, start, mid - 1);

        /* Recursively construct the right subtree and make it
         right child of root */
        node.right = balancedBST(arr, mid + 1, end);

        return node;
    }

    static void levelorder(Treenode root) {
        Queue<Treenode> q1 = new LinkedList<>();
        if (root == null)
            return;
        else
            q1.add(root);

        while (!q1.isEmpty()) {

            Treenode tempnode = q1.poll();
            // if (tempnode.val==0)
            // System.out.print("null ");
            // else
            if (tempnode == null)
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

    public static void main(String[] args) {
        int[] array = {-10, -3, 0, 5, 9};
        Treenode res = result(array);
        levelorder(res);
    }
}
