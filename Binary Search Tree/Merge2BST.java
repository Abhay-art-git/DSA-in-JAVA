
import java.util.ArrayList;

 public class Merge2BST{
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

    public static void InOrder( Node root , ArrayList<Integer> arr){
        if (root == null) {
            return;
            
        }

        InOrder(root.left , arr);
        arr.add(root.data);
        InOrder(root.right , arr);

    }

     public static Node CreateBST( ArrayList<Integer> ar , int start , int end){
        if(start > end){
            return null;
        }

        int mid = (start + end)/2;
        Node root = new Node(ar.get(mid));
        root.left = CreateBST(ar, start, mid-1);
        root.right = CreateBST(ar, mid+1, end);

        return root;



    }


    public static Node MergeBSTs( Node root1 , Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        InOrder(root1 , arr1);

         ArrayList<Integer> arr2 = new ArrayList<>();
        InOrder(root2 , arr2);

        //merge
        int i=0 , j=0;
        ArrayList<Integer> finalarr = new ArrayList<>();
        while(i<arr1.size() && j < arr2.size() ){
            if(arr1.get(i) <= arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }
            else{
                finalarr.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
              finalarr.add(arr1.get(i));
                i++;

        }

        while(j<arr2.size()){
              finalarr.add(arr2.get(j));
                i++;

        }


        //sorted arraylist to balanced tree 

       return  CreateBST(finalarr, 0, finalarr.size()-1);


    }



    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);



        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);





        Node root = MergeBSTs(root1, root2);
        PreOrder(root);
        
    }
 }
