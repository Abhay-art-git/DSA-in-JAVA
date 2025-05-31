
// this is more optimized its solved in  O(n) time complexity
// we can not solve height or never node manual or recursive 

public class OptimizedDiameterOfTree {
    static class Node{
        int data;
        Node left ;
        Node right ;

        public Node( int data){
            this.data = data;
            this.left = null;
            this.right = null;
            
        }

    }

    static class Info{   // info class 
        int dim ;
        int ht ;

        public Info( int dim , int ht){  
            this.dim = dim;
            this.ht = ht;

        }
    }

    public static Info OptimizedDiameter( Node root){
        if(root == null){  // base case 
            return  new Info(0,0);

        }

         Info leftInfo = OptimizedDiameter(root.left);  // left diameter and height
         Info rightInfo = OptimizedDiameter(root.right); // right diameter and height

        int  finalDiameter = Math.max(Math.max(leftInfo.dim , rightInfo.dim ) , (leftInfo.ht + rightInfo.ht +1)); 
        int finalheight = Math.max(leftInfo.ht, rightInfo.ht) + 1;   

        return new Info(finalDiameter, finalheight);  


    }
    public static void main(String[] args) {
           /*
         *       1
         *     /   \
         *    2     3 
         *   / \   / \
            4   5 6   7

         */ 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println(OptimizedDiameter(root).dim);
        System.out.println(OptimizedDiameter(root).ht);
    }
    
}
