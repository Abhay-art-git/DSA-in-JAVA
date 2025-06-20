
public class PrintinRange {
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
      public static Node insert( Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left , val);
        }
        else{
            root.right = insert (root.right, val);
        }
        return root;

    }

    public static void PrintRange( Node root , int k1 , int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1 && root.data <= k2){
            PrintRange(root.left, k1, k2);
            System.out.println(root.data);
            PrintRange(root.right, k1, k2);
        }
        else if (root.data<k1) {
            PrintRange(root.left, k1, k2);
            
        }
        else{
            PrintRange(root.right, k1, k2);
        }

    }
    public static void main(String args[]){
        int value[]={8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int idx = 0; idx < value.length; idx++) {
           root = insert(root , value[idx]);

            
        }

        PrintRange(root, 5, 12);

    }
}
