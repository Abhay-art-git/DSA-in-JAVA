public  class Validator{
      static class  Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

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

    public static boolean  isValidatorBST(Node root , Node min , Node max ){
        if(root==null){
            return true;
        }
        if(min!=null && root.data <= min.data){
            return false;
        }
        if(max!=null && root.data >=max.data){
            return false;
        }
        return  isValidatorBST(root.left, min, root) && isValidatorBST(root.right, root, max);




    }

        public static void main(String[] args) {
            int value[]={1,3,4,5,6,8,10,11,14};
        Node root = null;

        for (int idx = 0; idx < value.length; idx++) {
           root = insert(root , value[idx]);

           
        }

        if(isValidatorBST(root, null, null)){
            System.out.println("is valid");
        }
        else{
            System.out.println("is not valid");
        }
            
        }
    }
}
