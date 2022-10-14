public class BinaryTreeDiameter {
    static int ans=0;
    public static int diameterOfBinaryTree(Treenode root) {
        if(root==null )return 0;
        height(root);
        return ans;
    }

    public static int height(Treenode root){
        //if root==null height==0
        if(root==null)
            return -1;
// int lvalue;
//if(root.left!=null)
     //   lvalue=root.left.val;
        int L=height(root.left);
      //  int rvalue;
      //  if(root.right!=null)
       //     rvalue=root.right.val;
        int R=height(root.right);
        //ans signfies(no. of nodes farthest apart) or the DIAMETER
        ans=Math.max(ans,L+R);

        //height of the tree is max of LST & RST +1
        return 1+Math.max(L,R);
    }

    public static void main(String[] args) {
        Treenode root = new Treenode(1);
        root.left = new Treenode(2);
        root.right = new Treenode(3);
        root.left.left = new Treenode(4);
        root.left.right = new Treenode(5);
      //  root.left.right.right= new Treenode(8);
        diameterOfBinaryTree(root);
        System.out.println(diameterOfBinaryTree(root));
    }

}
