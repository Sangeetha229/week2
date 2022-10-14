import java.util.HashMap;

public class ConstructBT1113_ntworking {

    public static Treenode root;

    static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    static int  preIndex=0;
 static Treenode buildTree(int[] preorder, int[] inorder ,int len ) {


        for(int i=0;i<len;i++){
            map.put(inorder[i],i);
        }

        return  constructTree(preorder,inorder,0,inorder.length-1);

    }

    public static  Treenode constructTree(int[] preorder,int[] inorder,int inorderStart,int inorderEnd){

        if(inorderStart > inorderEnd)
        {
            return null;
        }

        int currvalue= preorder[preIndex++];
        //preIndex++;
        Treenode tnode=new Treenode(currvalue);

        if(inorderStart==inorderEnd)
        {
            return tnode;
        }

        int inordercurrIndex=map.get(currvalue);
        tnode.left= constructTree(preorder,inorder,inorderStart, inordercurrIndex-1);
        tnode.right= constructTree(preorder,inorder,inordercurrIndex+1, inorderEnd);

        return tnode;

    }

    static void printInorder(Treenode node)
    {
        if(node == null)
        {
            return;
        }
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
    public static void main(String[] args) {

       int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
        //Treenode root=new Treenode();
        int len = inorder.length;
         ConstructBT1113.root=buildTree(preorder, inorder,len );
        printInorder(root);
    }

}