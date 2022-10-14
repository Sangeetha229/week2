

// Java program to implement iterative preorder traversal
/*import java.util.Stack;

// A binary tree node
class node {

    int data;
    node left, right;

    node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class Iterativepreordertraversal {

    node root;


    // An iterative process to print preorder traversal of Binary tree
    static Stack<node> nodeStack;
    static void iterativePreorder(node node)
    {

        // Base Case
        if (node == null) {
            return;
        }

        // Create an empty stack and push root to it
      nodeStack = new Stack<node>();
        nodeStack.push(node);

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
     /*   while (nodeStack.empty() == false) {

            // Pop the top item from stack and print it
            node mynode = nodeStack.peek();
            System.out.print(mynode.data + " ");
            nodeStack.pop();

            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
                nodeStack.push(mynode.right);
            }
            if (mynode.left != null) {
                nodeStack.push(mynode.left);
            }
        }
    }

    // driver program to test above functions
    public static void main(String args[])
    {
       // Iterativepreordertraversal tree = new Iterativepreordertraversal();
        node root = new node(10);
        root.left = new node(8);
        root.right = new node(2);
        root.left.left = new node(3);
        root.left.right = new node(5);
        root.right.left = new node(2);


        iterativePreorder(root);
    }
}*/

/*Time Complexity: O(N)
Auxiliary Space: O(H), where H is the height of the tree.*/