import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserialize1114 {
    public static String serialize(Treenode root) {
        // 1. Use Postorder traversal to encodes a tree to a single string.
        StringBuilder sb = postorder(root, new StringBuilder());
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static StringBuilder postorder(Treenode root, StringBuilder sb) {
        if (root == null)
            return sb;

        // 2. Traverse its left and right subtrees respectively
        postorder(root.left, sb);
        postorder(root.right, sb);

        // 3. Visit the root node at last
        sb.append(root.val);
        sb.append(' ');
        return sb;
    }

    // 4. Use Preorder traversal to decodes the string to a tree
    public static Treenode deserialize(String data) {
        if (data.isEmpty())
            return null;
        ArrayDeque<Integer> nums = new ArrayDeque<Integer>();
        for (String s : data.split("\s+"))
            nums.add(Integer.valueOf(s));
        return helper(Integer.MIN_VALUE, Integer.MAX_VALUE, nums);
    }

    public static Treenode helper(Integer lower, Integer upper, ArrayDeque<Integer> nums) {
        if (nums.isEmpty())
            return null;
        int val = nums.getLast();
        if (val < lower || val > upper)
            return null;

        nums.removeLast();
        Treenode root = new Treenode(val);
        // 5. Deserialize the right subtree
        root.right = helper(val, upper, nums);
        // 6. Deserialize the left subtree
        root.left = helper(lower, val, nums);
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

        Treenode p = new Treenode(9);
        p.left = new Treenode(5);
        p.right = new Treenode(7);
        p.left.left = new Treenode(1);
        p.left.right= new Treenode(3);
        p.right.right=new Treenode(8);
        p.right.left=new Treenode(6);

        String result=serialize(p);
        Treenode  res=deserialize(result);
         if(res.val==0)
        System.out.println("null");
         else
        levelorder(res);//getting wrong output

    }

}
