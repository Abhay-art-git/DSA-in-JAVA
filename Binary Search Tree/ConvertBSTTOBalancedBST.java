
import java.util.ArrayList;

public class ConvertBSTTOBalancedBST {
     static class  Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }    
    }

    public static void PreOrder(Node root){
        if(root == null){
            return ;
        }

        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);

    }

    public static void getInorder(Node root , ArrayList<Integer> inorder){
        if(root == null){
            return ;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node BalancedBST( Node root){
        // inorder Sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        //sorted inorder -> balanced BST

        root = CreateBST(inorder, 0, inorder.size()-1);

        return root;

    }

     public static Node CreateBST( ArrayList<Integer> inorder , int start , int end){
        if(start > end){
            return null;
        }

        int mid = (start + end)/2;
        Node root = new Node( inorder.get(mid));
        root.left = CreateBST(inorder, start, mid-1);
        root.right = CreateBST(inorder, mid+1, end);

        return root;



    }



    public static void main(String[] args) {
        /*                 8
         *                / \
         *               6   10
         *              /      \ 
         *             5        11
         *            /          \
         *           3            12 
         */          
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


         root = BalancedBST(root);
         PreOrder(root);

                  /*          8
                   *         / \
                   *        5   11
                   *       / \  / \   
                   *      3   6 10 12 
                   * 
                   * Expected BST 
                   */



    }


    
}
