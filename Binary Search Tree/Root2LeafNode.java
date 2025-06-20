import java.util.ArrayList;

public class Root2LeafNode {
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

    public static void PrintArrayList(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
            
        }
        System.out.println("Null");
        
    }

    public static void RootToLeaf( Node root , ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            PrintArrayList(path);
        }

        
        RootToLeaf(root.left, path);
        RootToLeaf(root.right, path);
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
         int value[]={1,3,4,5,6,8,10,11,14};
        Node root = null;

        for (int idx = 0; idx < value.length; idx++) {
           root = insert(root , value[idx]);

            RootToLeaf(root, new ArrayList<>());
        }
        
    }
    
}
