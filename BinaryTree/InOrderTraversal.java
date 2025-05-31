public class InOrderTraversal {
    static class Node{
        int data ;
        Node left ;
        Node right ;

         public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }     
    }

    static class BinaryTree{    // binary tree
        static int idx = -1;    // index for track nodes
        public static Node buildtree(int Nodes[]){ 
            idx++;    // idx=0
            if(Nodes[idx]==-1){
                return null;  // left and right node are not permited
            }

            Node newnode = new Node(Nodes[idx]);  // new node create
            newnode.left = buildtree(Nodes);   // left subtree
            newnode.right = buildtree(Nodes);  // right subtree   
             // = is used to join the nodes and the tree

            return newnode;


        }

        public static void Inorder(Node root){
            if(root == null){    // base code of recursion
                return ;
        }
    
            Inorder(root.left);  // calling left subtree using recursion 
            System.out.print(root.data + " ") ;  // print the current position data
            Inorder(root.right); // calling right subtreee using recursion 
        }
    }

   
    public static void main(String[] args) {
        BinaryTree btr = new BinaryTree();
        int Node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = btr.buildtree(Node);
        // System.out.println(root.data);  //value of root node 

        btr.Inorder(root);
        
    }
    
}
