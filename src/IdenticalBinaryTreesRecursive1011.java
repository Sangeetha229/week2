/*class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode root;
    //  Treenode(){
    //    root=null;
    //  }
    Treenode(int val){
        this.val=val;
    }

}*/
public class IdenticalBinaryTreesRecursive1011 {
    private static boolean issametree(Treenode p, Treenode q) {
        //boolean result=false;
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val && issametree(p.left, q.left) && issametree(p.right, q.right)) {
            return true;
        }
        return false;
    }

    public static void main(String... args) {

        Treenode p = new Treenode(4);
        p.left = new Treenode(2);
        p.right = new Treenode(6);
        p.left.left = new Treenode(1);
        p.left.right = new Treenode(7);

        Treenode q = new Treenode(4);
        q.left = new Treenode(2);
        q.right = new Treenode(6);
        q.left.left = new Treenode(1);
        q.left.right = new Treenode(7);
        System.out.println(issametree(p, q));

    }
}
