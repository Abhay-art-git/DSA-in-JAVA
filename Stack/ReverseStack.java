import java.util.Stack;

public class ReverseStack {

    public static void PushAtbottom(Stack<Integer> s , int data){
       
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        PushAtbottom(s, data);
        s.push(top);


    }



    public static void ReverseStack(Stack<Integer> s){
        if(s.isEmpty()) {
            return;
            
        }
        int top = s.pop();
        ReverseStack(s);
        PushAtbottom(s , top);
        printStack(s);

    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }



    public static void main(String[] args) {
        Stack stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        ReverseStack(stk);

           
           
    }
    
}
