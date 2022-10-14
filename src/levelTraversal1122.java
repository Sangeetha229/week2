import java.util.*;

public class levelTraversal1122 {
    public static List<List<Integer>> levelOrder(Treenode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) return levels;

        Queue<Treenode> queue = new LinkedList<Treenode>();
        queue.add(root);
        int level = 0;
        while ( !queue.isEmpty() ) {
            // start the current level
            levels.add(new ArrayList<Integer>());

            // number of elements in the current level
            int level_length = queue.size();
            for(int i = 0; i < level_length; ++i) {
                Treenode node = queue.remove();

                // fulfill the current level
                levels.get(level).add(node.val);

                // add child nodes of the current level
                // in the queue for the next level
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            // go to next level
            level++;
        }
        return levels;
    }

    public static void main(String... args) {

        Treenode p = new Treenode(9);
        p.left = new Treenode(5);
        p.right = new Treenode(7);
        p.left.left = new Treenode(1);
        p.left.right= new Treenode(3);
        p.right.right=new Treenode(8);
        p.right.left=new Treenode(6);

        List<List<Integer>> result=levelOrder(p);

            System.out.println(result);


    }
}
