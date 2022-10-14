
/*import java.util.*;
public class identicalBinaryTreesIterative10111 {

    private static boolean issametree(Treenode p,Treenode q){
        //boolean result=false;
        Stack<Treenode> stack_p = new Stack <> ();
        Stack<Treenode> stack_q = new Stack <> ();
        if (p != null) stack_p.push( p ) ;
        if (q != null) stack_q.push( q ) ;
        while (!stack_p.isEmpty() && !stack_q.isEmpty()) {
            Treenode pn = stack_p.pop() ;
            Treenode qn = stack_q.pop() ;
            //System.out.println("pn.val "+pn.val+"qn.val "+qn.val);
            if (pn.val != qn.val) return false ;
            if (pn.right != null) {stack_p.push(pn.right) ;

            if (qn.right != null) {stack_q.push(qn.right) ;

            if (stack_p.size() != stack_q.size()) return false ;
            if (pn.left != null) {stack_p.push(pn.left) ;

            if (qn.left != null) {stack_q.push(qn.left) ;

            if (stack_p.size() != stack_q.size()) return false ;
        }
        return stack_p.size() == stack_q.size() ;
    }

    public static void main(String...args) {

        Treenode p= new Treenode(4);
        p.left=new Treenode(2);
        p.right=new Treenode(6);
        p.left.left=new Treenode(1);
        p.left.right=new Treenode(7);

        Treenode q= new Treenode(4);
        q.left=new Treenode(2);
        q.right=new Treenode(6);
        q.left.left=new Treenode(1);
        q.left.right=new Treenode(7);
        System.out.println(issametree(p,q));

    }
}
*/

