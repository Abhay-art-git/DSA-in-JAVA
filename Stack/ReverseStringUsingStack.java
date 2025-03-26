import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<Character>();
        int idx =0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sbt = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            sbt.append(curr);
        }

        return sbt.toString();

    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello world"));
       
          

    }
    
}
