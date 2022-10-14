import java.util.HashMap;

public class ConstructBT1113 {


        public static Treenode root;

        // Store indexes of all items so that we
        // we can quickly find later
        static HashMap<Integer,Integer> mp = new HashMap<>();
        static int preIndex = 0;

        /* Recursive function to construct binary of size
          len from Inorder traversal in[] and Preorder traversal
          pre[]. Initial values of inStrt and inEnd should be
          0 and len -1. The function doesn't do any error
          checking for cases where inorder and preorder
          do not form a tree */

    // This function mainly creates an unordered_map, then
    // calls buildTree()
    public static Treenode buldTreeWrap(int[] in, int[] pre, int len)
    {
        for(int i = 0; i < len; i++)
        {
            mp.put(in[i], i);
        }
        return buildTree(in, pre, 0, len - 1);
    }
        public static Treenode buildTree(int[] in, int[] pre, int inStrt, int inEnd)
        {

            if(inStrt > inEnd)
            {
                return null;
            }

    /* Pick current Treenode from Preorder traversal using preIndex
        and increment preIndex */
            int curr = pre[preIndex++];
            Treenode tNode = new Treenode(curr);


            /* If this node has no children then return */
            if (inStrt == inEnd)
            {
                return tNode;
            }

            /* Else find the index of this node in Inorder traversal */
            int inIndex = mp.get(curr);

    /* Using index in Inorder traversal, construct left and
        right subtress */
            tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
            tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
            return tNode;
        }



        /* This function is here just to test buildTree() */
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

        /* Driver code */
        public static void main (String[] args)
        {
            int[] in = {3,9,20,15,7};
            int[] pre = {9,3,15,20,7};
            int len = in.length;

            ConstructBT1113.root=buldTreeWrap(in, pre, len);

    /* Let us test the built tree by printing
        Inorder traversal */
            System.out.println("Inorder traversal of the constructed tree is");
            printInorder(root);
        }
    }