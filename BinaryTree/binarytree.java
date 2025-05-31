public class binaryTree{
    static class Node{ // creating node 
        int data;
        Node left;
        Node right;

        public Node(int data) {  // constructor
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
    }
    public static void main(String[] args) {
        int Node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree(); // we create a object for static BinaryTree class 
        Node root = tree.buildtree(Node); // we store tree node 

        System.out.println(root.data);  // print node of binary tree


         
    }
}
