
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraverser {
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
         public static void levelorder(Node root){
            if(root == null){
                return ;

            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();

                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);

                    }

                }
                else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right !=null){
                        q.add(currNode.right);

                    }
                }

            }
         }
    }

    //its follow BFS traversal
    public static void main(String[] args) {
        BinaryTree btr = new BinaryTree();
        int Node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = btr.buildtree(Node);
        btr.levelorder(root);

        
    }

    
    
}
