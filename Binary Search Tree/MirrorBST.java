public class MirrorBST{
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

    public static Node CreateMirror(Node root){
        if(root == null){
            return null ;
        }

         Node leftMirror = CreateMirror(root.left);
         Node RightMirror = CreateMirror(root.right);

         root.left = RightMirror;
         root.right = leftMirror;

         return  root;

    }

    public static void PreOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    
    public static void main(String[] args) {
       Node root = new Node(8);
       root.left = new Node(5);
       root.right = new Node(10);
       root.left.left = new Node(3);
       root.left.right= new Node(6);
       root.right.right = new Node(11);



       PreOrder(root);

       Node MirrorRoot = CreateMirror(root);
       System.out.println("");
       PreOrder(MirrorRoot);


        
       
       
    }
        
    }
