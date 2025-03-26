public class stackbylinkedlist {
 public class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;

     }
    
    }

    public static  class stackthis{
         static node  head = null;

        // is empty operation 
        public static boolean isEmpty(){
            if(head==null){
                return true;

            }
            return false;
        }

        public static void push(int data){
            node newnode = new node(data); 
            if(isEmpty()){
                head = newnode;
                return ;
            }

            newnode.next = head;
            head = newnode;
            
              
    
        }

        public static int pop(){
            if(isEmpty()){
                return -1;

            }
            int top = head.data ;
            head = head.next;
            return top;  
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }


    }

    public static void main(String[] args) {
        stackthis s = new stackthis();
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
        
    }
    
}
