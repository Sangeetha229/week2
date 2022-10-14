import java.util.Stack;

/* Class containing left and right child of
current node and key value*/
/*class node
{
    int data;
    node left, right;

    public node(int item)
    {
        data = item;
        left = right = null;
    }
}

/* Class to print the inorder traversal */
/*public class IterativeInordertraversal {
{
    //node root;
    
    static void inordertraversal(node root)
    {
        if (root == null) {
            return;
        }


        Stack<node> s = new Stack<node>();
        node curr = root;

        // traverse the tree
        while (curr != null || s.size() > 0) {

            /* Reach the left most node of the
            curr node */
           /* while (curr != null) {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
            /*    s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
         /*   curr = s.pop();

            System.out.print(curr.data + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
       /*     curr = curr.right;
        }
    }

    public static void main(String args[])
    {

        /* creating a binary tree and entering
        the nodes */
  /*      IterativeInordertraversal tree = new IterativeInordertraversal();
        node root = null;
        root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);

        inordertraversal(root);
      
    }
}
*/
   