import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath1022 {
    public static List<String> binaryTreePaths(Treenode root) {
        List<String> ret = new ArrayList<String>();
        dfs(root, "", ret);
        return ret;
    }

    private static void dfs(Treenode root, String s, List<String> list) {
        s += Integer.toString(root.val);
        if (root.left != null || root.right != null) {
            s += "->";
            if (root.left != null) {
                dfs(root.left, s, list);
            }
            if (root.right != null) {
                dfs(root.right, s, list);
            }
        }
        else {
            list.add(s);
        }
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
