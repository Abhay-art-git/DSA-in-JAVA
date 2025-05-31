public class PreOrderTreeTraversal {
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

    public static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int Node[]){
            idx++;
            if(Node[idx]==-1){
                return null ;
            }
            
        Node newnode = new Node(Node[idx]);
        newnode.left = buildTree(Node);
        newnode.right = buildTree(Node);


        return newnode;
            

        }

        public static void Preorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data +" ");
            Preorder(root.left);
            Preorder(root.right);


        }
        
    }
    public static void main(String[] args) {
        BinaryTree btr = new BinaryTree();
        int Node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = btr.buildTree(Node);
        // System.out.println(root.data);

        btr.Preorder(root);

        
    }
    
}
