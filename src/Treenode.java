
public class Treenode {
    int val;
    Treenode left;
    Treenode right;
    Treenode root;

    Treenode() {
        root = null;
    }

    Treenode(int val) {
        this.val = val;
    }

    Treenode(int val, Treenode left, Treenode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}