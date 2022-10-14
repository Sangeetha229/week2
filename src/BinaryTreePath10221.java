import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath10221 {
    public static void help(List<String> list, Treenode node, StringBuilder sb) {
        if (node == null)
            return;
       int len = sb.length();
        sb.append(node.val);
        if (node.left == null && node.right == null) {
            list.add(sb.toString());
          sb.setLength(len);
            return;
        }
        sb.append(">");
        help(list, node.left, sb);
        help(list, node.right, sb);
        sb.setLength(len);
    }

    public static List<String> binaryTreePaths(Treenode root) {
        List<String> res = new ArrayList<String>();
        help(res, root, new StringBuilder());
        return res;
    }

    public static void main(String[] args) {
        Treenode root = new Treenode(3);
        root.left = new Treenode(5);
        root.right = new Treenode(1);
        root.right.right = new Treenode(2);

        root.left.left = new Treenode(4);
        root.left.right = new Treenode(7);
        root.left.right.right= new Treenode(8);
        List<String> res = new ArrayList<String>();
        res=binaryTreePaths(root);
        System.out.println(res);
    }
}